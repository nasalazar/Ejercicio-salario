/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;



import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import modelo.Persona;



/**
 *
 * @author NATHALY
 */
@ManagedBean(name="controladorSalario")
@RequestScoped
public class ControladorSalario {
   /**
    * Propiedad que trae los atributos de la clase referenciada
    */
    @ManagedProperty("#{persona}")
    private Persona persona;
   
    public ControladorSalario() {
    }
/**
 * retorno de la instancia de la clase persona
 * @return 
 */
    public Persona getPersona() {
        return persona;
    }
/**
 * envio de datos de la clase persona
 * @param persona 
 */

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /**
     * obtiene nombre de la persona
     * @return 
     */
    
    public String obtenerNombre(){
        
        return persona.getNombre();
    }
    /**
     * Obtiene dias laborados
     * @return 
     */
    public int obtenerDias(){
        return persona.getDias();
    }
    /**
     * obtiene salario persona
     * @return 
     */
   public int obtenerSalario(){
       return persona.getSalario();
   }
   
}
