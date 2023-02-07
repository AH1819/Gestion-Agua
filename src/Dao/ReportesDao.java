package Dao;

import Conexion.Conexion;
import Entity.Reportes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReportesDao {

    private static ResultSet Resultado;
    private Conexion conexion = Conexion.getInstance();

    public List<Reportes> Reporte_adeudos() {
        List<Reportes> RP = new ArrayList<>();

        String sql = "select contrato.folio_contrato,(cliente.nombre||' '||cliente.apellido_p||' '||cliente.apellido_m) AS nombre_cliente,"
                + "lectura_pago.fecha_hora,lectura_pago.adeudo,cat_mes.mes,contrato.deuda "
                + "from cliente "
                + "inner join contrato "
                + "on cliente.folio_cte = contrato.folio_cte "
                + "inner join lectura_pago "
                + "on contrato.folio_contrato = lectura_pago.folio_contrato "
                + "inner join cat_mes "
                + "on lectura_pago.id_m = cat_mes.id_m where lectura_pago.adeudo <> 0.0 "
                + "order by contrato.folio_contrato";

        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);

            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Reportes cd = new Reportes(Resultado.getInt("folio_contrato"),
                        Resultado.getString("nombre_cliente"),
                        Resultado.getString("mes"),
                        Resultado.getDouble("adeudo"),
                        Resultado.getDouble("deuda"));

                RP.add(cd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cat_descuentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return RP;
    }
}
