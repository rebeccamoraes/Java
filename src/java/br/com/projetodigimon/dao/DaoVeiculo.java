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

    public List<Veiculo> listar(Veiculo veiculo) throws ClassNotFoundException {//A função listar com uma lista da entidade Veiculo <array>
        List<Veiculo> lista = new ArrayList<Veiculo>();				//Atribuindo a variável lista uma instância de lista de array da entidade Veiculo
        String sql = "SELECT * FROM veiculo " + "WHERE placa LIKE ?";	//Atribuindo a variável sql o query do banco
        try {
            Connection con = new ConnectionFactory().getConnection();     //Atribuindo a variável "con" uma instância da classe ConnectionFactory e o método GetConnection
            PreparedStatement stmt = con.prepareStatement(sql);           //Atribuindo a variável "stmt" do tipo PreparedStatement um prepare statement abrindo conexão (com o con) e recebendo a variável sql

            stmt.setString(1, "%" + veiculo.getPlaca() + "%");		//Campo que é digitado, ele recebe % + o valor do campo. 
            ResultSet rs = stmt.executeQuery();				//Executa a query

            while (rs.next()) {						//Enquanto houver um rs (ResultSet) ele avança
                veiculo = new Veiculo();				//A cada resultado do banco, ele vai criar uma nova instância
                veiculo.setIdVeiculo(rs.getLong("idveiculo"));
                veiculo.setPlaca(rs.getString("placa"));		//Atribuindo o setPlaca para um resultSet pegando a string da coluna placa (O valor entre aspas é o nome da coluna DO BANCO)
                veiculo.setRenavam(rs.getString("renavam"));
                veiculo.setAnoDeFabricacao(rs.getString("anodefabric"));
                veiculo.setUf(rs.getString("uf"));
                veiculo.setTipo(rs.getString("tipo"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setMarca(rs.getString("marca"));
                //O numeixos Estava int na model, mudar para String? 
                veiculo.setNumEixos(rs.getString("numeixos"));
                veiculo.setTara(rs.getFloat("tara"));
                veiculo.setCmt(rs.getFloat("cmt"));
                veiculo.setPbt(rs.getFloat("pbt"));
                veiculo.setCidade(rs.getString("cidade"));
                veiculo.setSituacao(rs.getString("situacao").charAt(0));

                lista.add(veiculo);					//Adicionando os valores para a variável lista
            }
            stmt.close();                                               //Fechando as conexoes
            rs.close();                                                 //Fechando as conexoes
            con.close();                                                //Fechando as conexoes
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;							//retornando lista
    }
}
