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

    public Acesso getUsuario(String usuario, String senha) throws SQLException, ClassNotFoundException {
        Connection con = new ConnectionFactory().getConnection();
        Boolean login = false;
        try {
            String sql = "Select usuario, senha from acesso "
                    + "where usuario = ? and senha = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Acesso us = new Acesso();
                String pusuario = rs.getString("usuario");
                String psenha = rs.getString("senha");         
                if (usuario.equals(pusuario) && senha.equals(psenha)) {
                    System.out.println("Usuario Encontrado");
                    login = true;
                } else {
                    System.out.println("Usuario não encontrado");
                }
                return us;
            }
            stmt.close();
            con.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
