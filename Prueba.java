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
public class Prueba {
    public static void main (String [] args){
        EmpsTransp emp = new EmpsTransp ("Juanitos");
        Turismo tur = new Turismo ("Volvo", "12346", "479-YIP", 100000, 60, true, true);
        
        emp.altaCamion("Mercedes", "12345", "478-YIP", 150000, 45, true);
        emp.altaCamion("Volvo","12349", "481-YIP", 15000, 90, true);
        emp.altaCamion("Volvo", "12346", "479-YIP", 100000, 60, true, true);
        emp.altaCamion("Volvo", "12347", "480-YIP", 100000, 70, false, false);
        
        System.out.println (emp.rentaTurista(70, 1500));
        System.out.println (emp.camionEscolarDisponible());
        System.out.println(emp.satisfaccionDemanda(50, 1));
        System.out.println (emp.camionDisponible("479-YIP"));
        System.out.println (emp.camionEscolarDisponible());
        System.out.println(emp.marcaTurismo("Volvo", 10000, 10));
    }
}
