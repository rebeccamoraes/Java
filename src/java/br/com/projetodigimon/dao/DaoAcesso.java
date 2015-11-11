/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projetodigimon.dao;

import br.com.projetodigimon.model.Acesso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sora
 */
public class DaoAcesso {
    public Acesso getUsuario(String login, String senha) throws SQLException, ClassNotFoundException{
        Connection con = new ConnectionFactory().getConnection();
        try{
            String sql = "Select usuario, senha from acesso "
                    + "where usuario = ? and senha = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()){
                Acesso us = new Acesso();
                us.setUsuario(rs.getString("usuario"));
                us.setSenha(rs.getString("senha"));
                return us;
            }
            stmt.close();
            con.close();
            rs.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
