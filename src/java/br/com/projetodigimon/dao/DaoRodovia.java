package br.com.projetodigimon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.projetodigimon.model.Rodovia;

/**
 *
 * @author DarkBox
 */
public class DaoRodovia {

    private Rodovia rodovia = new Rodovia();

    public void inserir(Rodovia rodovia) throws ClassNotFoundException {
        this.rodovia = rodovia;
        System.out.println("entrou no dao");

        String sql = "Insert into RODOVIA"
                + " (NOME, EXTENSAOKM, CIDADEINICIAL, UFINICIAL, CIDADEFINAL, UFFINAL)"
                + " VALUES (?,?,?,?,?,?)";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            // stmt.setInt(1, this.rodovia.getIdRodovia());
            stmt.setString(1, this.rodovia.getNome());
            stmt.setFloat(2, this.rodovia.getExtensaoKm());
            stmt.setString(3, this.rodovia.getCidadeInicial());
            stmt.setString(4, this.rodovia.getUfInicial());
            stmt.setString(5, this.rodovia.getCidadeFinal());
            stmt.setString(6, this.rodovia.getUfFinal());
            //stmt.setInt(8, this.rodovia.getSituacao().charAt(0));

            stmt.executeUpdate();
            stmt.close();
            con.close();

            //SQL Server
            Connection conS = new ConnectionFactory().getServer();
            stmt = conS.prepareStatement(sql);
            // stmt.setInt(1, this.rodovia.getIdRodovia());
            stmt.setString(1, this.rodovia.getNome());
            stmt.setFloat(2, this.rodovia.getExtensaoKm());
            stmt.setString(3, this.rodovia.getCidadeInicial());
            stmt.setString(4, this.rodovia.getUfInicial());
            stmt.setString(5, this.rodovia.getCidadeFinal());
            stmt.setString(6, this.rodovia.getUfFinal());
            //stmt.setInt(8, this.rodovia.getSituacao().charAt(0));

            stmt.executeUpdate();
            stmt.close();
            conS.close();
        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

    public void alterar(Rodovia rodovia) throws ClassNotFoundException {
        this.rodovia = rodovia;

        String sql = "update RODOVIA set"
                + " NOME = ?, EXTENSAOKM = ?, CIDADEINICIAL = ?, UFINICIAL = ?, CIDADEFINAL = ?, UFFINAL = ?, SITUACAO = ?"
                + " where IDRODOVIA = ?";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, this.rodovia.getNome());
            stmt.setFloat(2, this.rodovia.getExtensaoKm());
            stmt.setString(3, this.rodovia.getCidadeInicial());
            stmt.setString(4, this.rodovia.getUfInicial());
            stmt.setString(5, this.rodovia.getCidadeFinal());
            stmt.setString(6, this.rodovia.getUfFinal());
            stmt.setInt(7, this.rodovia.getSituacao().charAt(0));
            stmt.setInt(8, this.rodovia.getIdRodovia());

            stmt.executeUpdate();
            stmt.close();
            con.close();

            //SQO Server
            Connection conS = new ConnectionFactory().getServer();
            stmt = conS.prepareStatement(sql);

            stmt.setString(1, this.rodovia.getNome());
            stmt.setFloat(2, this.rodovia.getExtensaoKm());
            stmt.setString(3, this.rodovia.getCidadeInicial());
            stmt.setString(4, this.rodovia.getUfInicial());
            stmt.setString(5, this.rodovia.getCidadeFinal());
            stmt.setString(6, this.rodovia.getUfFinal());
            stmt.setInt(7, this.rodovia.getSituacao().charAt(0));
            stmt.setInt(8, this.rodovia.getIdRodovia());

            stmt.executeUpdate();
            stmt.close();
            conS.close();

        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

    public void excluir(Rodovia rodovia) throws ClassNotFoundException {
        this.rodovia = rodovia;

        String sql = "delete from RODOVIA"
                + " where IDRODOVIA = ?";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, this.rodovia.getIdRodovia());

            stmt.executeUpdate();
            stmt.close();
            con.close();

            //SQL Server
            Connection conS = new ConnectionFactory().getServer();
            stmt = conS.prepareStatement(sql);

            stmt.setInt(1, this.rodovia.getIdRodovia());

            stmt.executeUpdate();
            stmt.close();
            conS.close();
        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }
}
