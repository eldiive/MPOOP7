/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

/**
 *
 * @author poo01alu34
 */
public class POOP7 {

    /** Función principal
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gerente ger = new Gerente();
        ger.setNombre("Pedro EscalaSEXO");
        ger.setNumEmpleado(12345);
        //ger.setSueldo(20_000); // _ comas en cifras
        System.out.println("Nombre: " + ger.getNombre());
        System.out.println("NumEmpleado: " + ger.getNumEmpleado());
        System.out.println("Sueldo: " + ger.getSueldo());
        ger.setSueldo(10); // aumenta el 10
        System.out.println("Sueldo Aumentado: " + ger.getSueldo());
        
        ger.setPresupuesto(100_000);
        System.out.println("Presupuesto: " + ger.getPresupuesto());
        System.out.println(ger); //no imprime el presupuestp porque es el tostring empleado
        
        
        // subir a github 
        //practica -> codigo 
        // .jar -> codigo
        // javadoc -> pages 
        // 2 links en apartado de repositorio 
        
        // act. extras 
        // generar diagrama de empleado -> gerente
        // generar diagrama de animal y programarlo 
        
        // 2 proyectos -> 4 links 
        
        // esta es la practica 7 
        
        
        
        
        
    }
    
}
