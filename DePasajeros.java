package Ejercicio11;

public abstract class DePasajeros extends Camion {
    
    private int totPasajeros;

    public DePasajeros() {
    }

    public DePasajeros(String marca, String numMotor, String placas, double costoCamion, int totPasajeros) {
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
        return "DePasajeros{" + "totPasajeros=" + totPasajeros + super.toString();
    }
   
   public double calculaCostoServicio(double cantKilometros){
       return (0.01 * super.getCostoCamion() / totPasajeros) * cantKilometros;
   }
}
