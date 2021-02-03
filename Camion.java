/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio11;

import java.util.Objects;

/**
 * 
 * @author Anthoan J.O. <djuarezo@itam.mx>
 */
public abstract class Camion {
    private String marca;
    private String numMotor;
    private String placas;
    private double costoCamion;

    public Camion() {
    }

    public Camion(String marca, String numMotor, String placas, double costoCamion) {
        this.marca = marca;
        this.numMotor = numMotor;
        this.placas = placas;
        this.costoCamion = costoCamion;
    }

    @Override
    public String toString() {
        return "Camion{" + "marca=" + marca + ", numMotor=" + numMotor + ", placas=" + placas + ", costoCamion=" + costoCamion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean res= false;
        
        if (obj != null && obj instanceof Camion)
            res=this.placas.equalsIgnoreCase(((Camion)obj).placas);
        return res;        
        
    }
}
  