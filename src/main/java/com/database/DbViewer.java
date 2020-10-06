package com.database;

import org.jdbi.v3.core.Jdbi;

import java.lang.reflect.Proxy;

public class DbViewer {
    private Jdbi jdbi;

    public DbViewer(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    public <T> T create(Class<T> tClass) {
        Handler handler = new Handler(jdbi, tClass);


        return (T) Proxy.newProxyInstance(tClass.getClassLoader(),
                new Class[]{tClass},
                handler);

    }
}
