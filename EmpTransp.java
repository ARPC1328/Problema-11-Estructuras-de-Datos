/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema11;

/**
 *
 * @author alexh
 */
public class EmpTransp {

    private String nombre;
    private int totalCamiones;
    private Camion[] camiones;

    public EmpTransp() {
        nombre = "ABC";
        totalCamiones = 0;
        camiones = new Camion[4];
    }

    public boolean SetTurismo(boolean asientoCama, boolean serviBar, int totalPasaj, String marca, String numMotor, String placas, double costoCamion) {
        boolean resp = false;
        if (totalCamiones == camiones.length) {
            resp = false;
        } else {
            camiones[totalCamiones] = new Turismo(asientoCama, serviBar, totalPasaj, marca, numMotor, placas, costoCamion);

            totalCamiones++;
            resp = true;
        }
        return resp;

    }

    public boolean SetEscolares(boolean lugarProyecto, int totalPasaj, String marca, String numMotor, String placas, double costoCamion) {
        boolean resp = false;
        if (totalCamiones == camiones.length) {
            resp = false;
        } else {
            camiones[totalCamiones] = new Escolar(lugarProyecto, totalPasaj, marca, numMotor, placas, costoCamion);
            totalCamiones++;
            resp = true;

        }
        return resp;
    }

    public String rentaTurista(int pasajeros, double kilometros) {
        StringBuilder sb = new StringBuilder();
        sb.append("los datos de los camiones que cvumplen estas condicines son:\n");
        for (int i = 0; i < totalCamiones; i++) {
            if (pasajeros <= ((DePasajeros) camiones[i]).totalPasaj && camiones[i] instanceof Turismo) {
                sb.append("costo: " + ((Turismo) camiones[i]).calculaCostoServicio(kilometros));
                sb.append("Datos: " + ((Turismo) camiones[i]).toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public boolean satisfaccionDemanda(int totalNinios, int tCam) {
        int contador = 0;
        for (int i = 0; i < totalCamiones; i++) {
            if (totalNinios <= ((DePasajeros) camiones[i]).totalPasaj && camiones[i] instanceof Escolar) {
                contador++;

            }

        }
        return contador >= tCam;
    }
    public String camionDisponible(String placas){
        int i = 0;
        String res = "No se encontré un camión con esas placas";
        while(i < totalCamiones && !camiones[i].getPlacas().equals(placas))
            i++;
        if(i != totalCamiones)
            res = camiones[i].getClass().getSimpleName();
        return res;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        EmpTransp TR1 = new EmpTransp() ;
        TR1.SetEscolares(true, 8, "BMW", "B111", "A123", 5000);
        TR1.SetTurismo(true, true, 10, "Mercedez", "C124", "B123",8000);
        
        System.out.println("renta de coches para turistas;  " + TR1.rentaTurista(7, 50));
    }

}
