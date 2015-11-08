/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetodigimon.dao;

import br.com.projetodigimon.model.Veiculo;
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
public class DaoVeiculo {

    public List<Veiculo> listar(Veiculo veiculo) throws ClassNotFoundException {
        List<Veiculo> lista = new ArrayList<Veiculo>();
        String sql = "SELECT * FROM veiculo " + "WHERE placa LIKE ?";
        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, "%" + veiculo.getPlaca() + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                veiculo = new Veiculo();
                veiculo.setIdVeiculo(rs.getLong("idveiculo"));
                veiculo.setPlaca(rs.getString("placa"));
                veiculo.setRenavam(rs.getString("renavam"));
                veiculo.setAnoDeFabricacao(rs.getString("anodefabric"));
                veiculo.setUf(rs.getString("uf"));
                veiculo.setTipo(rs.getString("tipo"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setMarca(rs.getString("marca"));
                //O numeixos Estava int na model, mudar para String? 
                veiculo.setNumEixos(Integer.parseInt(rs.getString("numeixos")));
                veiculo.setTara(rs.getFloat("tara"));
                veiculo.setCmt(rs.getFloat("cmt"));
                veiculo.setPbt(rs.getFloat("pbt"));
                //veiculo.setCidade(rs.getString("cidade"));
                veiculo.setSituacao(rs.getString("situacao").charAt(0));
                
                
                
                lista.add(veiculo);
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
