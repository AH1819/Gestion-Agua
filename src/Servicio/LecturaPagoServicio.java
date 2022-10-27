package Servicio;

import Dao.LecturapagoDao;
import Entity.LecturaPago;
import java.util.List;

public class LecturaPagoServicio {
    private LecturapagoDao lp = new LecturapagoDao();
    
    public List<LecturaPago> Mes_deuda(int id){
        return this.lp.Mes_adeudo(id);
    }
    public List<LecturaPago> MostrarLecturas(){
        return this.lp.MostrarLecturas();
    }
    public List<LecturaPago> BuscarLectura(int folio){
        return this.lp.BuscarLecturas(folio);
    }
    public int InsertarLecturapago(Double lecturaIni, Double lecturaFin, Double consumo, int folio_contrato, int id_m){   
        LecturaPago LeP =  new LecturaPago(lecturaIni,lecturaFin, consumo, folio_contrato, id_m);
        int ret = this.lp.InsertarLecturapago(LeP);
        return ret; 
    }
}
