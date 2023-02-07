package Servicio;

import Dao.ReportesDao;
import Entity.Reportes;
import java.util.List;

public class ReportesServicio {
    
    ReportesDao RD = new ReportesDao();
    
    public List<Reportes> Reporte_adeudos(){
        return this.RD.Reporte_adeudos();
    }
    
}
