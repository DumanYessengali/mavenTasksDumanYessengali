package kz.aitu.project.repository;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres", "postgres", "1234")) {
            Boolean exist = conn.getMetaData().getTables(
                    null, null, "hello", null).next();
            System.out.println(exist);

        } catch (Exception e) {
            System.out.println(e.toString() );
        }


    }
}
