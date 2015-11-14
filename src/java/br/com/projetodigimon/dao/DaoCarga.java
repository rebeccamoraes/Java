/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetodigimon.dao;

import br.com.projetodigimon.model.Carga;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sora
 */
public class DaoCarga {

    public List<Carga> listar(Carga carga) throws ClassNotFoundException {
        List<Carga> lista = new ArrayList<Carga>();
        String sql = "SELECT * FROM carga WHERE tipo like ? or remetente like ? or destinatario like ?";
        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, "%" + carga.getTipo() + "%");
            stmt.setString(2, "%" + carga.getRemetente() + "%");
            stmt.setString(3, "%" + carga.getDestinatario() + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                carga = new Carga();
                carga.setTipo(rs.getString("tipo"));
                carga.setDestinatario(rs.getString("destinatario"));
                carga.setIdOrigem(rs.getInt("origem"));
                carga.setIdDestino(rs.getInt("destino"));
                carga.setRemetente(rs.getString("remetente"));
                carga.setSituacao(rs.getString("situacao").charAt(0));
            }
            stmt.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }
}
