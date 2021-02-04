/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio11;

/**
 *
 * @author Usuario
 */
public class Turismo extends DePasajeros{
    private boolean asientoCama;
    private boolean serviBar;

    public Turismo() {
    }

    public Turismo(String marca, String numMotor, String placas, double costoCamion, int totalPasaj, boolean asientoCama, boolean serviBar) {
        super(marca, numMotor, placas, costoCamion, totalPasaj);
        this.asientoCama = asientoCama;
        this.serviBar = serviBar;
    }

    public boolean isAsientoCama() {
        return asientoCama;
    }

    public boolean isServiBar() {
        return serviBar;
    }
    
    @Override
    public String toString(){
        StringBuilder cad = new StringBuilder();
        
        cad.append ("\nTurimo: " + super.toString());
        cad.append ("\nAsiento Cama: " + asientoCama);
        cad.append ("\nServibar: " + serviBar);
        
        return cad.toString();
    }
   
    @Override
    public double calculaCostoServicio(double kilometros) {
        double costo;
        
        costo = super.calculaCostoServicio(kilometros);
        if(isAsientoCama())
            costo *= 1.05;
        if(isServiBar())
            costo *= 1.05;
                    
        return costo;
    }
}