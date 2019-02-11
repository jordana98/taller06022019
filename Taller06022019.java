/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller06022019;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s204e15
 */
public class Taller06022019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Velocity vel =new Velocity();
        Persona per= new Persona();
        per.setNombre("Jordana");
        per.setCedula(123456);
        try {
            vel.crearVelocity(per);
        } catch (Exception ex) {
            Logger.getLogger(Taller06022019.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
