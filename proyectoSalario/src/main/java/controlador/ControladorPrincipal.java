/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import modelo.Persona;

/**
 *
 * @author NATHALY
 */

@ManagedBean(name="controladorPrincipal")
@RequestScoped
public class ControladorPrincipal {
    /**
     * variable que almacena el nombre de la persona
     */
    private String nombreT;
    /**
     * variable que guarda el salario diario
     */
    private int salarioT;
    /**
     * variable que guarda los dias laborados
     */
    private int diasT;
    /**
     * guarda la lista de los valores de los idiomas
     */
    private List<String>idiomaT;
    /**
     * constructor
     */
    public ControladorPrincipal() {
    }
    /**
     * return nombre persona
     * @return 
     */
    public String getNombreT() {
        return nombreT;
    }
    /**
     * envia nombre
     * @param nombreT 
     */

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
    }
    /**
     * obtiene salario por dia
     * @return 
     */
    public int getSalarioT() {
        return salarioT;
    }
    /**
     * envia salario por dia
     * @param salarioT 
     */
    public void setSalarioT(int salarioT) {
        this.salarioT = salarioT;
    }
    /**
     * retorna dias trabajados
     * @return 
     */
    public int getDiasT() {
        return diasT;
    }
    /**
     * envias dias trabajados
     * @param diasT 
     */
    public void setDiasT(int diasT) {
        this.diasT = diasT;
    }
    /**
     * retorna valores de los idiomas
     * @return 
     */
    public List<String> getIdiomaT() {
        return idiomaT;
    }
    /**
     * envia valores de los idiomas
     * @param idiomaT 
     */
    public void setIdiomaT(List<String> idiomaT) {
        this.idiomaT = idiomaT;
    }
    /**
     * instancia de la clase de la persona
     */
    Persona persona = new Persona();
    /**
     * Envia las variables obtenidas de la vista para el controlador principal y redirecciona a la pagina para obtener los resultados
     * @return 
     */
     public String calcular(){
        
        FacesContext context = FacesContext.getCurrentInstance();
        persona = context.getApplication().evaluateExpressionGet(context, "#{persona}", Persona.class);
        persona.setNombre(this.nombreT);
        persona.setDias(this.diasT);
        persona.setSalario(this.salarioT);
        persona.setListaIdioma(this.idiomaT);
     
       return "resultado"; 
    }
     
}
