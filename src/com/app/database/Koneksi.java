/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author gusti
 */
public class Koneksi {
    public static Connection getConnection() {

        try {

            String url =
                "jdbc:mysql://localhost:3306/pbo";

            String user = "root";
            String password = "";

            Connection conn =
                    DriverManager.getConnection(
                            url,
                            user,
                            password
                    );

            return conn;

        } catch (Exception e) {

            System.out.println(
                    "Koneksi gagal : "
                    + e.getMessage()
            );

            return null;
        }
    }
}
