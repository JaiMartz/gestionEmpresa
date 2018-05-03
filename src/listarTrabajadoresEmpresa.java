/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Jairo
 */
public class listarTrabajadoresEmpresa {

    
    public static void main(String[] args) {
        // TODO code application logic here
            //Definimos los objetos Departamento con sus parametros
    Departamento desarrollo = new Departamento ("Desarrollo","Departamento encargado del desarrollo software");
    Departamento sistemas = new Departamento ("Sistemas","Departamento encargado de mantener los sistemas");
    Departamento contabilidad = new Departamento ("Contabilidad","Departamento encargado de la gestion economica");
    Departamento ventas = new Departamento ("Ventas","Departamento encargado de la realización de ventas");
    
    
    //Creamos los 12 objetos empleados con sus parametros
    Empleado empleado1 = new Empleado(1,"David","Gutierrez","Programador",900,"Desarrollo");
    Empleado empleado2 = new Empleado(2,"Jose Antonio","Martin","Programador", 1100, "Desarrollo");
    Empleado empleado3 = new Empleado(3,"Laura", "Mesones", "Programador", 890, "Desarrollo");
    Empleado empleado4 = new Empleado(4,"Yaiza","Rodriguez","Administrador", 1200,"Sistemas");
    Empleado empleado5 = new Empleado(5,"Andrea", "Heredero", "Administrador", 1150, "Sistemas");
    Empleado empleado6 = new Empleado(6,"Yeray", "Alaminos", "Administrador", 1300, "Sistemas");
    Empleado empleado7 = new Empleado(7,"Mario", "Fuentes","Contable",1100,"Contabilidad");
    Empleado empleado8 = new Empleado(8,"Enrique","Segura","Contable",1000,"Contabilidad");
    Empleado empleado9 = new Empleado(9,"Estefania","Garcia","Contable", 1350,"Contabilidad");
    Empleado empleado10 = new Empleado(10,"Aurora","Boreal", "Comercial", 1270,"Ventas");
    Empleado empleado11 = new Empleado(11,"Lourdes", "Hernandez","Comercial", 1050, "Ventas");
    Empleado empleado12 = new Empleado(12,"Macarena","Arnedo","Comercial", 1150,"Ventas");
    
    //Creamos un arraylist de tipo departamento
    ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    
    
    listaDepartamentos.add(desarrollo);
    listaDepartamentos.add(sistemas);
    listaDepartamentos.add(contabilidad);
    listaDepartamentos.add(ventas);
    

       
    listaEmpleados.add(empleado1);
    listaEmpleados.add(empleado2);
    listaEmpleados.add(empleado3);
    listaEmpleados.add(empleado4);
    listaEmpleados.add(empleado5);
    listaEmpleados.add(empleado6);
    listaEmpleados.add(empleado7);
    listaEmpleados.add(empleado8);
    listaEmpleados.add(empleado9);
    listaEmpleados.add(empleado10);
    listaEmpleados.add(empleado11);
    listaEmpleados.add(empleado12);
    
    
    
    for(int j = 0; j<listaDepartamentos.size(); j++){
        System.out.println(listaDepartamentos.get(j).getNombre());
        System.out.println(listaDepartamentos.get(j).getDescripcion());
                
        for(int i = 0; i<listaEmpleados.size(); i++){
            System.out.println(listaEmpleados.get(i).getIdEmpleado());
            System.out.println(listaEmpleados.get(i).getNombre());
            System.out.println(listaEmpleados.get(i).getApellidos());
            System.out.println(listaEmpleados.get(i).getTrabajo());
            System.out.println(listaEmpleados.get(i).getSalario());
            }
        }   
    }
}

