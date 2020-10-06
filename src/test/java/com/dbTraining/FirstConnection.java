package com.dbTraining;

import com.database.DbViewer;
import com.database.Repository;
import com.dbTraining.model.UserEntity;
import org.jdbi.v3.core.Jdbi;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FirstConnection {


    final static String DB_URL = "jdbc:mysql://db-prerelease.intesting.de:3306/ndcc?user=qa_user&password=3edcvfr45tgb";
    static DbViewer viewer;

    @BeforeAll
    static void beforeAll() {
        Jdbi jdbi = Jdbi.create(DB_URL);

        viewer = new DbViewer(jdbi);
    }

    @Test
    void getUserById() {
        UserInterface userInterface = viewer.create(UserInterface.class);

        UserEntity user = userInterface.findOne(56).orElseGet(null);

        assertThat(user).isNotNull();
    }


    @Test
    void getCompaniesById() {
        UserInterface userInterface = viewer.create(UserInterface.class);

        UserEntity user = userInterface.findOne(56).orElseGet(null);

        assertThat(user).isNotNull();
    }
    // TODO: 07.10.2020  продолжить от сюда https://youtu.be/UOU3tsbJWJc?t=1744 

}

interface UserInterface extends Repository<UserEntity> {
    Optional<UserEntity> findOne(int id);
}

