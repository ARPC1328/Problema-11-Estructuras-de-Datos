/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio11;

public abstract class DePasajeros extends Camion {
    
    private int totPasajeros;

    public DePasajeros() {
    }

    public DePasajeros(String marca, String numMotor, 
            String placas, double costoCamion, int totPasajeros) {
        super (marca, numMotor, placas, costoCamion);
        this.totPasajeros = totPasajeros;
    }

    public int getTotPasajeros() {
        return totPasajeros;
    }

    public void setTotPasajeros(int totPasajeros) {
        this.totPasajeros = totPasajeros;
    }
    
    @Override
    public String toString() {
        StringBuilder cad = new StringBuilder();
        
        cad.append ("\nTotal pasajeros: " + totPasajeros);
        cad.append (super.toString());
        
        return cad.toString();
    }
   
   public double calculaCostoServicio(double cantKilometros){
       return (0.01 * super.getCostoCamion() / totPasajeros) * cantKilometros;
   }
}