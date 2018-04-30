/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jairo
 */
public class Empleado {
    
   /**
    * Atributos privados de la clase Empleado
    */
    private int idEmpleado;
    private String nombre;
    private String apellidos;
    private String trabajo;
    private float salario;
    private String nombreDepartamento;
    
    /**
     * Constructor sin parametros, se encarga de inicializar los atributos
     */
    public Empleado(){
      idEmpleado = 0;
      nombre = null;
      apellidos = null;
      trabajo = null;
      salario = 0;
      nombreDepartamento = null;
    }
    public Empleado (int idE, String nom, String ap, String tra, float sal, String dep){
       idEmpleado = idE;
       nombre = nom;
       apellidos = ap;
       trabajo = tra;
       salario = sal;
       nombreDepartamento = dep;
    }
    
    
    public int getIdEmpleado(){
        return idEmpleado;
    }
    public void setIdEmpleado(int idE){
        this.idEmpleado = idE;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String ap){
        this.apellidos = ap;
    }
    public String getTrabajo(){
        return trabajo;
    }
    public void setTrabajo(String tra){
        this.trabajo = tra;
    }
    public float getSalario(){
        return salario;
    }
    public void setSalario(float sal){
        this.salario = sal;
    }
}
