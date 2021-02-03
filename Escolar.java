/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema11;

/**
 *
 * @author Usuario
 */
public class Escolar extends DePasajeros{
    private boolean lugarProyecto;

    public Escolar() {
    }

    public Escolar(String marca, String numMotor, String placas, double costoCamion, boolean disponible, int totalPasaj, boolean lugarProyecto) {
        super(marca, numMotor, placas, costoCamion, disponible, totalPasaj);
        this.lugarProyecto = lugarProyecto;
    }

    public boolean isLugarProyecto() {
        return lugarProyecto;
    }
    
    @Override
    public String toString() {
        return "Escolar\n" + super.toString() + "LugarProyecto: " + lugarProyecto + "\n";
    }
    
    public double calculaCostoServicio() {
        return 0.0001 * costoCamion / totalPasaj * 250;
    }
}
