package Dao;

import Conexion.Conexion;
import Entity.DetAbono;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Det_abonoDao {
    private static ResultSet Resultado;
    
    private Conexion conexion = Conexion.getInstance();
    
    public int InsertarDetAbono(DetAbono detabono){
        int ret = 0;

        String sql = "insert into det_abono(abono,id_lect_pago,id_tipo_pago) values (?,?,?)";
        PreparedStatement comando = null;
        
        try {
            
            comando = conexion.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setDouble(1, detabono.getAbono());
            comando.setInt(2, detabono.getId_lectura_pago());
            comando.setInt(3, detabono.getId_tipo_pago());
            System.out.println(comando);
            comando.executeUpdate();

            Resultado = comando.getGeneratedKeys();

            if (Resultado.next()) {
                ret = Resultado.getInt(1);
            }

            conexion.conectar().close();
            comando.close();

            return ret;
        } catch (SQLException ex) {
            Logger.getLogger(ContratoDao.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

}