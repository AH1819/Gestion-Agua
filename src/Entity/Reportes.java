package Entity;

public class Reportes {

    private Integer id_contrato;
    private String nombre;
    private String meses_adeudo;
    private Double cantidad;
    private Double total_deuda;

    public Reportes() {
    }

    public Reportes(Integer id_contrato,String nombre, String meses_adeudo, Double cantidad, Double total_deuda) {
        this.id_contrato = id_contrato;
        this.nombre = nombre;
        this.meses_adeudo = meses_adeudo;
        this.cantidad = cantidad;
        this.total_deuda = total_deuda;
    }

    public Integer getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(Integer id_contrato) {
        this.id_contrato = id_contrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMeses_adeudo() {
        return meses_adeudo;
    }

    public void setMeses_adeudo(String meses_adeudo) {
        this.meses_adeudo = meses_adeudo;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal_deuda() {
        return total_deuda;
    }

    public void setTotal_deuda(Double total_deuda) {
        this.total_deuda = total_deuda;
    }

}
