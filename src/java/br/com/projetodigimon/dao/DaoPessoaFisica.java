/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetodigimon.dao;

import br.com.projetodigimon.model.PessoaFisica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Sora
 */
public class DaoPessoaFisica {

    public List<PessoaFisica> listar(PessoaFisica pf) throws ClassNotFoundException {
        List<PessoaFisica> lista = new ArrayList<PessoaFisica>();
        String sql = "SELECT * FROM pessoafisica " + "WHERE cpf LIKE ? AND nome LIKE ?";
        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, "%" + pf.getCpf() + "%");
            stmt.setString(2, "%" + pf.getNome() + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                pf = new PessoaFisica();
                pf.setIdPessoaFisica(rs.getInt("idpessoafisica"));                
                pf.setNome(rs.getString("nome"));
                pf.setCpf(rs.getString("cpf"));           
                pf.setDataNascimento(rs.getString("datanascimento")); // mudar para date?
                pf.setRg(rs.getString("rg"));
                pf.setUf(rs.getString("uf"));
                pf.setOrgaoEmissor(rs.getString("orgaoemissor"));
                pf.setSexo(rs.getString("sexo"));
                pf.setSituacao(rs.getString("situacao").charAt(0));

                lista.add(pf);
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
