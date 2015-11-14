/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetodigimon.dao;

import br.com.projetodigimon.model.PessoaJuridica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author md10
 */
public class DaoPessoaJuridica {

    public List<PessoaJuridica> listar(PessoaJuridica pj) throws ClassNotFoundException {
        List<PessoaJuridica> lista = new ArrayList<PessoaJuridica>();
        String sql = "SELECT * FROM pessoajuridica WHERE cnpj like ? and nomefantasia like ?";
        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, "%" + pj.getCnpj() + "%");
            stmt.setString(2, "%" + pj.getNomeFantasia() + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                pj = new PessoaJuridica();
                pj.setIdPessoaJuridica(rs.getInt("idpessoajuridica"));
                pj.setCnpj(rs.getString("cnpj"));
                pj.setNomeFantasia(rs.getString("nomefantasia"));
                pj.setRazaoSocial(rs.getString("razaosocial"));
                pj.setSituacao(rs.getString("situacao").charAt(0));

                lista.add(pj);
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
