package Servicio;

import Dao.TarifaDao;
import Entity.DetTipoconsumoTarifa;
import java.util.List;

public class TarifaServicio {

    TarifaDao td = new TarifaDao();

    public List<DetTipoconsumoTarifa> Tarifas(int id) {
        return this.td.Tarifas(id);
    }

    public int Tarifaid(int consumo, double tarifa) {

        int ret = this.td.idtarifa(consumo, tarifa);

        return ret;
    }
}
