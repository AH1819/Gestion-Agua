package Entity;

import java.util.Date;

public class DetAbono {
    
    private Integer consec;
    private Date fechaHora;
    private Double abono;
    private Double saldo;
    private Integer id_lectura_pago;
    private Integer id_tipo_pago;

    public DetAbono(Double abono, Integer id_lect_pago, Integer id_tipo_pago) {
        this.abono = abono;
        this.id_lectura_pago = id_lect_pago;
        this.id_tipo_pago = id_tipo_pago;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Double getAbono() {
        return abono;
    }

    public void setAbono(Double abono) {
        this.abono = abono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getConsec() {
        return consec;
    }

    public void setConsec(Integer consec) {
        this.consec = consec;
    }

    public Integer getId_lectura_pago() {
        return id_lectura_pago;
    }

    public void setId_lectura_pago(Integer id_lectura_pago) {
        this.id_lectura_pago = id_lectura_pago;
    }

    public Integer getId_tipo_pago() {
        return id_tipo_pago;
    }

    public void setId_tipo_pago(Integer id_tipo_pago) {
        this.id_tipo_pago = id_tipo_pago;
    }
    
}
