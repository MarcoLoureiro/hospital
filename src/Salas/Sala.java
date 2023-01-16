package Salas;
import Principal.*;

public abstract class Sala extends Hospital {
    private Boolean isReservada;
    private int dia;
    private int mes;
    private int ano;

    public Sala(String nomeDoHospital){
        super(nomeDoHospital);
        this.isReservada = false;
    }

    public Boolean getReservada() {
        return isReservada;
    }

    public void setReservada(Boolean reservada) {
        isReservada = reservada;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public abstract void reservar(int dia, int mes, int ano);
}
