/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetodigimon.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DarkBox
 */
public class ConnectionFactory {

    public Connection getConnection() throws ClassNotFoundException {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection("jdbc:oracle:thin:@10.2.12.37:1521:forsoft", "system", "123");
        } catch (SQLException e) {
            throw new RuntimeException(e + " Erro 666: Miguel ferrou o DNS");
        }

    }
    
    public Connection getServer() throws ClassNotFoundException{
        try{
            Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
            return DriverManager.getConnection("jdbc:sqlserver://10.2.12.132:1433\\FORSOFT;user=system;password=123");            
        }catch (SQLException e) {
            throw new RuntimeException(e + "ERRO DOTENETE: Lazyness arrived");
        }
    }
}
