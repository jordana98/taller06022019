/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller06022019;

/**
 *
 * @author s204e15
 */
     
import java.io.StringWriter;
 
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class Velocity {
 
    void crearVelocity(Persona per) throws Exception {
        VelocityEngine ve = new VelocityEngine();
        ve.init();
         
        Template t = ve.getTemplate("datapage.vm");
         
        VelocityContext vc = new VelocityContext();
        vc.put("nombre", per.getNombre());
        vc.put("cédula", per.getCedula());
        StringWriter sw = new StringWriter();
        t.merge(vc, sw);
         
        System.out.println(sw);
    }
    
    
}
