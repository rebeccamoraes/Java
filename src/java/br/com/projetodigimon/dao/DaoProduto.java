/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetodigimon.dao;

import br.com.projetodigimon.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sora
 */
public class DaoProduto {

    public List<Produto> listar(Produto produto) throws ClassNotFoundException{
        List<Produto> lista = new ArrayList<Produto>();
        String sql = "SELECT * FROM produto WHERE mercadoria like ?";
        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, "%" + produto.getMercadoria() + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                produto = new Produto();

                produto.setIdProduto(rs.getInt("idproduto"));
                produto.setMercadoria(rs.getString("mercadoria"));
                produto.setPesoTotal(rs.getFloat("pesototal"));
                produto.setValorTotal(rs.getFloat("valortotal"));
                produto.setSituacao(rs.getString("situacao").charAt(0));
                lista.add(produto);
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
