/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeyuli;

import java.util.ArrayList;

/**
 *
 * @author Yuli
 */
public class Profesor implements Horario{
    
    
    String nombre;
    String dia;
    
    private ArrayList <Horario> horario;
    
    public Profesor() {}

    public Profesor(String nombre, String dia) {
        this.nombre = nombre;
        this.dia = dia;
        setHorario(new ArrayList());
    }
  
    public void cambiarHorario(String dia){
        for (Horario h : horario) h.cambiarHorario(dia);
        setDia(dia);
        System.out.println("Cambio Horario a "+nombre+" al dia "+dia);
    }
   
    public void add(Horario h){
        getHorario().add(h);
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

    public ArrayList<Horario> getHorario() {
        return horario;
    }

    public void setHorario(ArrayList<Horario> horario) {
        this.horario = horario;
    }

    
    
    

}
