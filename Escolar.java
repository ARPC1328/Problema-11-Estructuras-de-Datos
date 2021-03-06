/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio11;

/**
 *
 * @author Brayansito
 */
public class Escolar extends DePasajeros{
    private boolean lugarProyecto;

    public Escolar() {
    }

    public Escolar(String marca, String numMotor, String placas, double costoCamion, int totalPasaj, boolean lugarProyecto) {
        super(marca, numMotor, placas, costoCamion, totalPasaj);
        this.lugarProyecto = lugarProyecto;
    }

    public boolean isLugarProyecto() {
        return lugarProyecto;
    }
    
    public double calculaCostoServicio() {
        return 0.0001 * super.getCostoCamion() / super.getTotPasajeros() * 250;
    }

    @Override
    public String toString() {
        StringBuilder cad = new StringBuilder();
        
        cad.append ("Escolor con lugar de proyecto: " + lugarProyecto);
        cad.append (super.toString());
        
        return cad.toString();
    }    
}