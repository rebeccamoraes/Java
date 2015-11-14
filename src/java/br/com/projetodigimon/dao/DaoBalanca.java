/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetodigimon.dao;

import br.com.projetodigimon.model.Balanca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author erico_000
 */
public class DaoBalanca {

    private Balanca balanca = new Balanca();

    public void inserir(Balanca balanca) throws ClassNotFoundException {
        this.balanca = balanca;
        System.out.println("entrou no dao");

        String sql = "Insert into BAlANCA"
                + " (NUMSERIE, FABRICANTE, MODELO)"
                + " VALUES (?,?,?)";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            //stmt.setInt(1, this.balanca.getIdBalanca());
            stmt.setInt(1, this.balanca.getNumSerie());
            stmt.setString(2, this.balanca.getFabricante());
            stmt.setString(3, this.balanca.getModelo());

            stmt.executeUpdate();
            stmt.close();
            con.close();

            //SQL Server
            Connection conS = new ConnectionFactory().getServer();
            stmt = conS.prepareStatement(sql);
            //stmt.setInt(1, this.balanca.getIdBalanca());
            stmt.setInt(1, this.balanca.getNumSerie());
            stmt.setString(2, this.balanca.getFabricante());
            stmt.setString(3, this.balanca.getModelo());

            stmt.executeUpdate();
            stmt.close();
            conS.close();
        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

    public void alterar(Balanca balanca) throws ClassNotFoundException {
        this.balanca = balanca;

        String sql = "update BALANCA set"
                + " NUMSERIE = ?, FABRICANTE = ?, MODELO = ?"
                + " where IDRODOVIA = ?";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, this.balanca.getNumSerie());
            stmt.setString(2, this.balanca.getFabricante());
            stmt.setString(3, this.balanca.getModelo());
            stmt.setInt(4, this.balanca.getIdBalanca());

            stmt.executeUpdate();
            stmt.close();
            con.close();

            //SQL Server
            Connection conS = new ConnectionFactory().getServer();
            stmt = conS.prepareStatement(sql);

            stmt.setInt(1, this.balanca.getNumSerie());
            stmt.setString(2, this.balanca.getFabricante());
            stmt.setString(3, this.balanca.getModelo());
            stmt.setInt(4, this.balanca.getIdBalanca());

            stmt.executeUpdate();
            stmt.close();
            conS.close();

        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

    public void excluir(Balanca balanca) throws ClassNotFoundException {
        this.balanca = balanca;

        String sql = "delete from BALANCA"
                + " where IDBALANCA = ?";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, this.balanca.getIdBalanca());

            stmt.executeUpdate();
            stmt.close();
            con.close();

            //SQL Server
            Connection conS = new ConnectionFactory().getServer();
            stmt = conS.prepareStatement(sql);

            stmt.setInt(1, this.balanca.getIdBalanca());

            stmt.executeUpdate();
            stmt.close();
            conS.close();
        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

}
