package com.safebox.entidades;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class TablaAmortizacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int codigo;
    @Column( nullable = false, length = 5)
    protected int periodo;
    @Column(nullable = false, scale = 2)
    protected double cuota;
    @Column( nullable = false, scale = 2)
    protected double pagoInteres;
    @Column(nullable = false, scale = 2)
    protected double pagoCapital;
    @Column( nullable = false, scale = 2)
    protected double saldo;

    @ManyToOne
    @JoinColumn
    protected Credito credito;

    @Temporal(TemporalType.DATE)
    protected Date Fecha_Vencimiento;
    @Column( nullable = false, scale = 2)
    protected double mora;
    @Column( nullable = false, length = 25)
    protected String estado;

    public TablaAmortizacion(int codigo, int periodo, double cuota, double pagoInteres, double pagoCapital, double saldo, Credito credito, Date fecha_Vencimiento, double mora, String estado) {
        this.codigo = codigo;
        this.periodo = periodo;
        this.cuota = cuota;
        this.pagoInteres = pagoInteres;
        this.pagoCapital = pagoCapital;
        this.saldo = saldo;
        this.credito = credito;
        Fecha_Vencimiento = fecha_Vencimiento;
        this.mora = mora;
        this.estado = estado;
    }

    public TablaAmortizacion (){}

    public int getCodigo() {
        return codigo;
    }

  /*  public int getPeriodo() {
        return periodo;
    }

    public double getCuota() {
        return cuota;
    }

    public double getPagoInteres() {
        return pagoInteres;
    }

    public double getPagoCapital() {
        return pagoCapital;
    }

    public double getSaldo() {
        return saldo;
    }

    public Date getFecha_Vencimiento() {
        return Fecha_Vencimiento;
    }

    public double getMora() {
        return mora;
    }

    public String getEstado() {
        return estado;
    }*/

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

  /*  public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public void setPagoInteres(double pagoInteres) {
        this.pagoInteres = pagoInteres;
    }

    public void setPagoCapital(double pagoCapital) {
        this.pagoCapital = pagoCapital;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setFecha_Vencimiento(Date fecha_Vencimiento) {
        Fecha_Vencimiento = fecha_Vencimiento;
    }

    public void setMora(double mora) {
        this.mora = mora;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean crear(TablaAmortizacion tabla){
        return false;
    }
*/
    public Credito getCredito() {
        return credito;
    }

    public void setCredito(Credito credito) {
        this.credito = credito;
    }


}
