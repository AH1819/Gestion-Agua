package Entity;

public class DetTipoconsumoTarifa{

    private Integer consec;
    private Integer id_consumo;
    private Double tarifa;

    public Integer getConsec() {
        return consec;
    }

    public void setConsec(Integer consec) {
        this.consec = consec;
    }

    public Integer getId_consumo() {
        return id_consumo;
    }

    public void setId_consumo(Integer id_consumo) {
        this.id_consumo = id_consumo;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    public DetTipoconsumoTarifa(Integer consec, Double tarifa) {
        this.consec = consec;
        this.tarifa = tarifa;
    }

    public DetTipoconsumoTarifa() {
    }
    
}
