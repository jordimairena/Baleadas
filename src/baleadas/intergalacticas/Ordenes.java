/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baleadas.intergalacticas;

/**
 *
 * @author jordi
 */
public class Ordenes {
    protected int numerodeorden;
    protected String nomcliente;
    //lista de platos
    protected double totalapagar;
    protected double tiempodepreparacion;

    public Ordenes() {
    }

    public Ordenes(int numerodeorden, String nomcliente, double totalapagar, double tiempodepreparacion) {
        this.numerodeorden = numerodeorden;
        this.nomcliente = nomcliente;
        this.totalapagar = totalapagar;
        this.tiempodepreparacion = tiempodepreparacion;
    }

    public int getNumerodeorden() {
        return numerodeorden;
    }

    public void setNumerodeorden(int numerodeorden) {
        this.numerodeorden = numerodeorden;
    }

    public String getNomcliente() {
        return nomcliente;
    }

    public void setNomcliente(String nomcliente) {
        this.nomcliente = nomcliente;
    }

    public double getTotalapagar() {
        return totalapagar;
    }

    public void setTotalapagar(double totalapagar) {
        this.totalapagar = totalapagar;
    }

    public double getTiempodepreparacion() {
        return tiempodepreparacion;
    }

    public void setTiempodepreparacion(double tiempodepreparacion) {
        this.tiempodepreparacion = tiempodepreparacion;
    }

    @Override
    public String toString() {
        return "Ordenes{" + "numerodeorden=" + numerodeorden + ", nomcliente=" + nomcliente + ", totalapagar=" + totalapagar + ", tiempodepreparacion=" + tiempodepreparacion + '}';
    }
    
}
