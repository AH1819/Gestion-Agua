package Servicio;

import Dao.InformativoDao;
import Entity.Informativo;
import java.util.List;

public class InformativoServicio {
    private final InformativoDao info = new InformativoDao();
    
    public List<Informativo> MostrarInformacion() {
        return this.info.MostrarInformacion();
    }
}
