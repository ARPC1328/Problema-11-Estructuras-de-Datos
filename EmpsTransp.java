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
public class EmpsTransp {
    
    private String nombreEmp;
    private int totalCamiones;
    private Camion[] camiones;
    private final int MAX = 4;

    public EmpsTransp(){
    }    
    
    public EmpsTransp(String nombre) {
        this.nombreEmp = nombre;
        this.totalCamiones = 0;
        camiones = new Camion[MAX];
    }

    //Turismo
    public boolean altaCamion(String marca, String numMotor, 
            String placas, double costoCamion, int totalPasaj, 
            boolean asientoCama, boolean serviBar) {
        boolean resp = false;        
        
        if (totalCamiones < MAX){
            camiones[totalCamiones] = new Turismo(marca, numMotor, 
                    placas, costoCamion, totalPasaj, asientoCama, 
                    serviBar);
            totalCamiones++;
            resp = true;
        }  
        return resp;    
    }
    
    //Escolar
    public boolean altaCamion(String marca, String numMotor, 
            String placas, double costoCamion, int totalPasaj, 
            boolean lugarProyecto) {
        boolean resp = false;
        
        if (totalCamiones < MAX){
            camiones[totalCamiones] = new Escolar(marca, numMotor, 
                    placas, costoCamion, totalPasaj, lugarProyecto);
            totalCamiones++;
            resp = true;
        }
        return resp;
    }

    public String rentaTurista(int pasajeros, double kilometros) { //Inciso A
        StringBuilder sb = new StringBuilder();
        
        sb.append("los datos de los camiones que cvumplen estas condicines son:\n");
        for (int i = 0; i < totalCamiones; i++) {
            if (pasajeros <= ((DePasajeros) camiones[i]).getTotPasajeros() && camiones[i] instanceof Turismo) {
                sb.append("\nCosto por rentar este camion: " + ((Turismo) camiones[i]).calculaCostoServicio(kilometros));
                sb.append("\nDatos" + ((Turismo) camiones[i]).toString());
                sb.append("\n--------------");
            }
        }
        return sb.toString();
    }

    public boolean satisfaccionDemanda(int totalNinios, int tCam) { //Incisco B
       int contador = 0;
        for (int i = 0; i < totalCamiones; i++) {
            if (totalNinios <= ((DePasajeros) camiones[i]).getTotPasajeros() && camiones[i] instanceof Escolar) {
                contador++;
            }
        }
        return contador >= tCam;
    }
    
    public String camionDisponible(String placas){ //Inciso C
        int i = 0;
        String res = "No se encontré un camión con esas placas";
        
        while(i < totalCamiones && !camiones[i].getPlacas().equals(placas))
            i++;
        if(i != totalCamiones)
            res = camiones[i].getClass().getSimpleName();
        return res;
    }
    
    public String camionEscolarDisponible() { //Inciso D
        StringBuilder sb;
        sb = new StringBuilder();
        
        for(int i = 0;i < totalCamiones;i++) 
            if(camiones[i] instanceof Escolar && ((Escolar)camiones[i]).getTotPasajeros() > 20 && ((Escolar)camiones[i]).isLugarProyecto()) 
                sb.append(camiones[i].getPlacas()).append("\n");
        return sb.toString();
    }
    
    public int marcaTurismo(String marca, double costo, double km){
        int res=0;        
         
        for(int i = 0;i < totalCamiones;i++)
            if(camiones[i] instanceof Turismo && camiones[i].getMarca().equals(marca))
                    if (((Turismo)camiones[i]).isServiBar() && ((Turismo)camiones[i]).calculaCostoServicio(km)<costo)
                        res++;
        return res;
    }
}