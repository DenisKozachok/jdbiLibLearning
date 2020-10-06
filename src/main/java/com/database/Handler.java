package com.database;

import org.jdbi.v3.core.Jdbi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Handler implements InvocationHandler {

    private Jdbi jdbi;
    private Class<?> tClass;

    public <T> Handler(Jdbi jdbi, Class<?> tClass) {
        this.jdbi = jdbi;
        this.tClass = tClass;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Type[] genericInterface = tClass.getGenericInterfaces();
        if (genericInterface[0] instanceof ParameterizedType) {
            Type[] genericTypes = ((ParameterizedType) genericInterface[0]).getActualTypeArguments();
            String className = genericTypes[0].toString().split(" ")[1];
            Class<?> clazz = Class.forName(className);

            if (method.getName().equalsIgnoreCase("findOne")) {
                String query = "SELECT * FROM users WHERE id = ?";

                return jdbi.withHandle(h -> h.select(query, args[0]).mapToBean(clazz).findOne());
            }
        }

        return null;
    }
}
