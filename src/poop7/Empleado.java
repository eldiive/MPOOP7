/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author poo01alu34
 */
public class Empleado {
    private String nombre;
    private int numEmpleado, sueldo;

    public Empleado() {
        this.sueldo = 10_000;
    }

    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    
    /**
     * Método que muestra el nombre del empleado
     * @return Regresa el nombre del empleado
     */

    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método que muestra el numero de empleado
     * @return Regresa el numero del empleado
     */

    public int getNumEmpleado() {
        return numEmpleado;
    }
    
    /**
     * Método que muestra el sueldo de un empleado
     * @return Regresa el sueldo del empleado
     */

    public int getSueldo() {
        return sueldo;
    }
    
    /**
     * Método que modifica el valor de un nombre
     * @param nombre El nombre de un empleado 
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método que modifica el numero de empleado
     * @param numEmpleado El numero de un empleado
     */

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    
    /**
     * Método que aumenta el sueldo de un empleado
     * @param porcentaje El aunmento de sueldo de un empleado
     */

    public void setSueldo(int porcentaje) {
        this.sueldo += (int)(this.sueldo*porcentaje/100);           
        //el sueldo màs el aumento
        //casteo para que se almacene en int   
        //this -> hace referencia al atributo
    }
    
    /**
     * Método que muestra en formato los datos del empleado
     * @return Regresa todos los datos de un empleado
     */

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    //extends object -> tostring -> direcciòn de memoria
    
}
