/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author NATHALY
 * @version 1.0
 */
@ManagedBean(name="persona")
@RequestScoped
public class Persona {
    /**
     * Variable que almacena el nombre de la persona
     */
    private String nombre;
   /**
    * Variable que almacena el numero de dias laborados
    */
    private int dias;
    /**
     * variable que almacena el valor del dia laborado
     */
    private int salario;
    /**
     * lista que almacena los valores de los idiomas 
     */
    private List<String> listaIdioma;

    public Persona(String nombre, int dias, int salario, List<String> listaIdioma) {
        this.nombre = nombre;
        this.dias = dias;
        this.salario = salario;
        this.listaIdioma = listaIdioma;
    }
    
    
    public Persona() {
    }

    /**
     * retorna nombre persona
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * envia nombre persona
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * retorna dias laborados
     * @return 
     */
    public int getDias() {
        return dias;
    }
    /**
     * envia dias laborados
     * @param dias 
     */
    public void setDias(int dias) {
        this.dias = dias;
    }
    /**
     * retorna salario
     * @return 
     */
    public int getSalario() {
        return salario;
    }
    /**
     * envia salario 
     * @param salario 
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }
    /**
     * retornaa lista de idiomas
     * @return 
     */
    public List<String> getListaIdioma() {
        return listaIdioma;
    }
    /**
     * envia lista de valores de los idiomas
     * @param listaIdioma 
     */
    public void setListaIdioma(List<String> listaIdioma) {
        this.listaIdioma = listaIdioma;
    }
    
    /**
     * metodo que retorna el numero de idiomas que hablo durante la jornada laboral
     * @return 
     */
    public int numeroIdiomas(){
      
       int numeroI =listaIdioma.size();
       return numeroI;
   }
    /*
    variable que almacena el salario sin idiomas
    */
    int salarioT;
    /**
     * returna el valor del salario sin idiomas
     * @return 
     */
   public int obtenerSalarioT(){
       
       salarioT= (dias*salario);
       return salarioT;
   }
   /**
    * variable que guarda valor de los idiomas
    */
   int valorIdioma=0;
   /**
    * retorna valor de los idiomas
    * @return 
    */
   public int obtenerValorIdiomas(){
       List<String>idioma = new ArrayList<>();
       
       for(String i: listaIdioma){
           valorIdioma+= Integer.parseInt(i);         
       }
       
       return valorIdioma;
   }
   /**
    * Funcion que calcula el valor del salario con recargo de idiomas
    * @return 
    */
   public int obtenerSalarioTotal(){
       
       int totalS= salarioT + valorIdioma; 
       return totalS;
   }
    
}
