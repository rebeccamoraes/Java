package br.com.projetodigimon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.projetodigimon.model.PostoPesagem;

/**
 *
 * @author DarkBox
 */
public class DaoPosto {

    private PostoPesagem postopesagem = new PostoPesagem();

    public void inserir(PostoPesagem postoPesagem) throws ClassNotFoundException {
        this.postopesagem = postoPesagem;
        System.out.println("entrou no dao");

        String sql = "INSERT INTO postodepesagem"
                + " (LATITUDE, LONGITUDE, KM)"
                + " VALUES (?,?,?)";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setFloat(1, this.postopesagem.getLatitude());
            stmt.setFloat(2, this.postopesagem.getLongitude());
            stmt.setInt(3, this.postopesagem.getKm());

            stmt.executeUpdate();
            stmt.close();
            con.close();
            //Sql Server
            Connection conS = new ConnectionFactory().getServer();
            stmt = conS.prepareStatement(sql);

            stmt.setFloat(1, this.postopesagem.getLatitude());
            stmt.setFloat(2, this.postopesagem.getLongitude());
            stmt.setInt(3, this.postopesagem.getKm());

            stmt.executeUpdate();
            stmt.close();
            conS.close();

        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

    public void alterar(PostoPesagem postoPesagem) throws ClassNotFoundException {
        this.postopesagem = postoPesagem;

        String sql = "update POSTOPESAGEM set"
                + " KM = ?, LATITUDE = ?, LONGITUDE = ?"
                + " where IDPOSTO = ?";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, this.postopesagem.getKm());
            stmt.setFloat(2, this.postopesagem.getLatitude());
            stmt.setFloat(3, this.postopesagem.getLongitude());
            stmt.setInt(4, this.postopesagem.getIdPosto());

            stmt.executeUpdate();
            stmt.close();
            con.close();

            //Sql Server
            Connection conS = new ConnectionFactory().getServer();
            stmt = conS.prepareStatement(sql);

            stmt.setInt(1, this.postopesagem.getKm());
            stmt.setFloat(2, this.postopesagem.getLatitude());
            stmt.setFloat(3, this.postopesagem.getLongitude());
            stmt.setInt(4, this.postopesagem.getIdPosto());

            stmt.executeUpdate();
            stmt.close();
            conS.close();

        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

    public void excluir(PostoPesagem postoPesagem) throws ClassNotFoundException {
        this.postopesagem = postoPesagem;

        String sql = "delete from POSTOPESAGEM"
                + " where IDPOSTOPESAGEM = ?";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, this.postopesagem.getIdPosto());

            stmt.executeUpdate();
            stmt.close();
            con.close();

            //Sql Server
            Connection conS = new ConnectionFactory().getServer();
            stmt = conS.prepareStatement(sql);

            stmt.setInt(1, this.postopesagem.getIdPosto());

            stmt.executeUpdate();
            stmt.close();
            conS.close();
        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

}
