package br.com.projetodigimon.dao;

import br.com.projetodigimon.model.Camera;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DarkBox
 */
public class DaoCamera {

    private Camera camera = new Camera();

    public void inserir(Camera camera) throws ClassNotFoundException {
        this.camera = camera;
        System.out.println("entrou no dao");

        String sql = "Insert into CAMERA"
                + " (FABRICANTE, MODELO, NUMSERIE, KM, LATITUDE, LONGITUDE)"
                + " VALUES (?,?,?,?,?,?)";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            //stmt.setInt(1, this.camera.getIdCamera());
            stmt.setString(1, this.camera.getFabricante());
            stmt.setString(2, this.camera.getModelo());
            stmt.setString(3, this.camera.getNumSerie());
            stmt.setInt(4, this.camera.getKm());
            stmt.setFloat(5, this.camera.getLatitude());
            stmt.setFloat(6, this.camera.getLongitude());
            //stmt.setInt(8, this.camera.getSituacao().charAt(0));

            stmt.executeUpdate();
            stmt.close();
            con.close();

            //SQL Server
            Connection conS = new ConnectionFactory().getServer();
            stmt = conS.prepareStatement(sql);
            //stmt.setInt(1, this.camera.getIdCamera());
            stmt.setString(1, this.camera.getFabricante());
            stmt.setString(2, this.camera.getModelo());
            stmt.setString(3, this.camera.getNumSerie());
            stmt.setInt(4, this.camera.getKm());
            stmt.setFloat(5, this.camera.getLatitude());
            stmt.setFloat(6, this.camera.getLongitude());
            //stmt.setInt(8, this.camera.getSituacao().charAt(0));
            
            //Não tem idRodovia?
            
            stmt.executeUpdate();
            stmt.close();
            conS.close();

        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

    public void alterar(Camera camera) throws ClassNotFoundException {
        this.camera = camera;

        String sql = "update CAMERAset"
                + "FABRICANTE  = ?, NUMSERIE = ?, MODELO = ?, KM = ?, LATITUDE = ?, LONGITUDE = ?, IDRODOVIA = ?"
                + " where IDCAMERA = ?";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, this.camera.getFabricante());
            stmt.setString(2, this.camera.getNumSerie());
            stmt.setString(3, this.camera.getModelo());
            stmt.setInt(4, this.camera.getKm());
            stmt.setFloat(5, this.camera.getLatitude());
            stmt.setFloat(6, this.camera.getLongitude());
            stmt.setInt(7, this.camera.getIdRodovia());  //Era tipo rodovia, e transformei em um idRodovia int
            stmt.setInt(8, this.camera.getIdCamera());

            stmt.executeUpdate();
            stmt.close();
            con.close();

            //SQL Server
            Connection conS = new ConnectionFactory().getServer();
            stmt = conS.prepareStatement(sql);

            stmt.setString(1, this.camera.getFabricante());
            stmt.setString(2, this.camera.getNumSerie());
            stmt.setString(3, this.camera.getModelo());
            stmt.setInt(4, this.camera.getKm());
            stmt.setFloat(5, this.camera.getLatitude());
            stmt.setFloat(6, this.camera.getLongitude());
            stmt.setInt(7, this.camera.getIdRodovia());
            stmt.setInt(8, this.camera.getIdCamera());

            stmt.executeUpdate();
            stmt.close();
            conS.close();

        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

    public void excluir(Camera camera) throws ClassNotFoundException {
        this.camera = camera;

        String sql = "delete from CAMERA"
                + " where IDCAMERA = ?";

        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, this.camera.getIdCamera());

            stmt.executeUpdate();
            stmt.close();
            con.close();

            //SQL SERVER
            Connection conS = new ConnectionFactory().getServer();
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, this.camera.getIdCamera());

            stmt.executeUpdate();
            stmt.close();
            conS.close();
        } catch (SQLException e) {
            throw new RuntimeException(e + "Erro na Conexão");
        }
    }

}
