/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author poo01alu34
 */
public class Gerente extends Empleado {

    private int presupuesto;

    public Gerente() {
    }

    public Gerente(String nombre, int numEmpleado, int sueldo, int presupuesto) {
        super(nombre, numEmpleado, sueldo); //llamada al constructor de la clase padre
        this.presupuesto = presupuesto;
    }
    
    /**
     * Método que muestra el presupuesto del gerente
     * @return Regresa el presupuesto del gerente
     */

    public int getPresupuesto() {
        return presupuesto;
    }
    
    /**
     * Método que modifica el presupuesto del gerente
     * @param presupuesto El presupuesto del gerente
     */

    public void setPresupuesto(int presupuesto) {
        if (presupuesto < 0) {
            presupuesto = 0;
        }
        this.presupuesto = presupuesto;
    }
    
    /**
     * Método que muestra en formato los datos del gerente
     * @return Regresa todos los datos de un gerente
     */

    @Override
    public String toString() {
        return "Gerente{" + super.toString() + "presupuesto=" + presupuesto + '}';
    }
    
    

    
    

}
