/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetodigimon.dao;

import br.com.projetodigimon.model.Pesagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author erico_000
 */
public class DaoPesagem {

    private Pesagem pesagem = new Pesagem();

    public void inserir(Pesagem pesagem) throws ClassNotFoundException {
        this.pesagem = pesagem;
        System.out.println("entrou no dao");

        String sql = "Insert into PESAGEM"
                + " (PBT, PESOEIXO, DATAHORA, TRANSBORDO, REMANEJAMENTO)"
                + " VALUES (?,?,?,?,?)";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            //stmt.setInt(1, this.pesagem.getIdPesagem());
            stmt.setFloat(1, this.pesagem.getPbt());
            stmt.setFloat(2, this.pesagem.getPesoEixo());
            stmt.setString(3, this.pesagem.getDataHora()); // Tipo Date?
            stmt.setString(4, this.pesagem.getTransbordo());
            stmt.setString(5, this.pesagem.getRemanejamento());

            stmt.executeUpdate();
            stmt.close();
            con.close();

            //SQL Server
            Connection conS = new ConnectionFactory().getServer();
            stmt = conS.prepareStatement(sql);
            //stmt.setInt(1, this.pesagem.getIdPesagem());
            stmt.setFloat(1, this.pesagem.getPbt());
            stmt.setFloat(2, this.pesagem.getPesoEixo());
            stmt.setString(3, this.pesagem.getDataHora()); // Tipo Date?
            stmt.setString(4, this.pesagem.getTransbordo());
            stmt.setString(5, this.pesagem.getRemanejamento());

            stmt.executeUpdate();
            stmt.close();
            conS.close();

        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

    public void alterar(Pesagem pesagem) throws ClassNotFoundException {
        this.pesagem = pesagem;

        String sql = "update PESAGEM set"
                + "PBT = ?, PESOEIXO = ?, DATAHORA = ?, TRANSBORDO = ? , REMANEJAMENTO = ?"
                + " where IDPESAGEM = ?";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setFloat(1, this.pesagem.getPbt());
            stmt.setFloat(2, this.pesagem.getPesoEixo());
            stmt.setString(3, this.pesagem.getDataHora());
            stmt.setString(4, this.pesagem.getTransbordo());
            stmt.setString(5, this.pesagem.getRemanejamento());
            stmt.setInt(6, this.pesagem.getIdPesagem());

            stmt.executeUpdate();
            stmt.close();
            con.close();

            //SQL Server
            Connection conS = new ConnectionFactory().getServer();
            stmt = conS.prepareStatement(sql);

            stmt.setFloat(1, this.pesagem.getPbt());
            stmt.setFloat(2, this.pesagem.getPesoEixo());
            stmt.setString(3, this.pesagem.getDataHora());
            stmt.setString(4, this.pesagem.getTransbordo());
            stmt.setString(5, this.pesagem.getRemanejamento());
            stmt.setInt(6, this.pesagem.getIdPesagem());

            stmt.executeUpdate();
            stmt.close();
            conS.close();

        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

    public void excluir(Pesagem pesagem) throws ClassNotFoundException {
        this.pesagem = pesagem;

        String sql = "delete from PESAGEM"
                + " where IDPESAGEM = ?";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, this.pesagem.getIdPesagem());

            stmt.executeUpdate();
            stmt.close();
            con.close();

            //SQL Server
            Connection conS = new ConnectionFactory().getServer();
            stmt = conS.prepareStatement(sql);

            stmt.setInt(1, this.pesagem.getIdPesagem());

            stmt.executeUpdate();
            stmt.close();
            conS.close();
        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

}
