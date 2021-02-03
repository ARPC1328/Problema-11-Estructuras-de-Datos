
public class DePasajeros {
    
    private int totPasajeros;

    public DePasajeros() {
    }

    public DePasajeros(String marca, String numMotor, String placas, double costoCamion, int totPasajeros) {
        this.totPasajeros = totPasajeros;
    }

    @Override
    public String toString() {
        return "DePasajeros{" + "totPasajeros=" + totPasajeros + '}'; //super.toString();
     } 
}
