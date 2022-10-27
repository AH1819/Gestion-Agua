package Dao;

import Conexion.Conexion;
import Entity.DetTipoconsumoTarifa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TarifaDao {
    private static ResultSet Resultado;
    private Conexion conexion = Conexion.getInstance();
    
    public List<DetTipoconsumoTarifa> Tarifas(int id){
        List<DetTipoconsumoTarifa> tari = new ArrayList<>();
        
        String sql = "select * from det_tipoconsumo_tarifa where id_consumo = ? order by id_consumo";
        PreparedStatement comando = null;
        
        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, id);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                DetTipoconsumoTarifa dt = new DetTipoconsumoTarifa();
                dt.setConsec(Resultado.getInt("consec"));
                dt.setId_consumo(Resultado.getInt("id_consumo"));
                dt.setTarifa(Resultado.getDouble("tarifa"));
                tari.add(dt);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(TarifaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return tari;
    }
    public int idtarifa(int consumo,double tarifa){
        int ret = 0;
        
        String sql = "select consec from det_tipoconsumo_tarifa where id_consumo = ? and tarifa = ?";
        PreparedStatement comando = null;
        
        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, consumo);
            comando.setDouble(2, tarifa);
            Resultado = comando.executeQuery();
            
            if(Resultado.next()){
                ret = Resultado.getInt("consec");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TarifaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
    }
}
