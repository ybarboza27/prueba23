/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeyuli;

/**
 *
 * @author Yuli
 */
public class Estudiante implements Horario{

    
    String nombre;
    String dia;

    public Estudiante() {}

    public Estudiante(String nombre, String dia) {
        this.nombre = nombre;
        this.dia=dia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
    
    public void cambiarHorario(String dia){
        System.out.println("Cambio Horario de "+nombre+" al dia "+dia);
        setDia(dia);
    }

    
}
