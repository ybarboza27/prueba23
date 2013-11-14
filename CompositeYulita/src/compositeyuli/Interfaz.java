/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeyuli;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Yuli
 */
public class Interfaz extends JFrame implements ActionListener {

    public JLabel lTitulo;
    public JLabel lProfesor;
    public JComboBox cbProfesor;
    public JLabel lEstudiante;
    public JComboBox cbEstudiante;
    public JLabel lHorarioProfesor;
    public JLabel lHorarioEstudiante;
    public JTextField tfHorarioProfesor;
    public JTextField tfHorarioEstudiante;
    public JButton bCambioHorario;
    public JButton bActualHorario;
    
    Horario h1;
    Horario h2;
    Horario h3;
    Horario h4;
    
    Profesor a;
    Profesor b;
    
    
    
    public Interfaz() {
        add(getlTitulo());
        add(getlProfesor());
        add(getcbProfesor());
        add(getlEstudiante());
        add(getcbEstudiante());
        add(getlHorarioProfesor());
        add(getlHorarioEstudiante());
        add(gettfHorarioEstudiante());
        add(gettfHorarioProfesor());
        add(getbCambioHorario());
        add(getbActualHorario());
        llenarCampos();
        inicializadorGUI();
    }
    
    public void inicializadorGUI(){
	setLayout(null);   //respetar x-y/ancho-alto de la palabra
	setSize(360, 300);  //Tama�o de la ventana
	setLocationRelativeTo(null); //centrar la ventana
	setResizable(false);      //quita el de maximizar
	setVisible(true);    //se pueda ver	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para que cierre 
    }
        
    public JLabel getlTitulo(){
        lTitulo=new JLabel();
	lTitulo.setText("Horarios");
	lTitulo.setBounds(10, 10, 115, 25);   //Alto-largo de la palabra
	return lTitulo;		
    }
    
    public JLabel getlProfesor(){
        lProfesor=new JLabel();
	lProfesor.setText("Profesor");
	lProfesor.setBounds(10, 40, 115, 25);   //Alto-largo de la palabra
	return lProfesor;		
    }
    
    public JComboBox getcbProfesor(){
        cbProfesor=new JComboBox();
        cbProfesor.setBounds(70,40,80,20);
        cbProfesor.addItem("Felipe");
        cbProfesor.addItem("Wil");
        //cbProfesor.addItemListener((ItemListener) this);
	return cbProfesor;		
    }
    
    public JLabel getlEstudiante(){
        lEstudiante=new JLabel();
	lEstudiante.setText("Estudiante");
	lEstudiante.setBounds(170, 40, 115, 25);   //Alto-largo de la palabra
	return lEstudiante;		
    }
    
    public JComboBox getcbEstudiante(){
        cbEstudiante=new JComboBox();
        cbEstudiante.setBounds(240,40,80,20);
        cbEstudiante.addItem("Carolina");
        cbEstudiante.addItem("Dayana");
        cbEstudiante.addItem("Manfred");
        cbEstudiante.addItem("Vanesa");
        //cbEstudiante.addItemListener(this);
	return cbEstudiante;		
    }
    
    public JLabel getlHorarioProfesor(){
        lHorarioProfesor=new JLabel();
	lHorarioProfesor.setText("Horario:");
	lHorarioProfesor.setBounds(10, 70, 115, 25);   //Alto-largo de la palabra
	return lHorarioProfesor;		
    }
    
    public JLabel getlHorarioEstudiante(){
        lHorarioEstudiante=new JLabel();
	lHorarioEstudiante.setText("Horario:");
	lHorarioEstudiante.setBounds(170, 70, 115, 25);   //Alto-largo de la palabra
	return lHorarioEstudiante;		
    }
    
    public JTextField gettfHorarioProfesor(){
        tfHorarioProfesor=new JTextField();
        tfHorarioProfesor.setBounds(70,70,80,20);
	return tfHorarioProfesor;		
    }
    
    public JTextField gettfHorarioEstudiante(){
        tfHorarioEstudiante=new JTextField();
        tfHorarioEstudiante.setBounds(240,70,80,20);
        tfHorarioEstudiante.enable(false);
	return tfHorarioEstudiante;		
    }
    
    public JButton getbActualHorario(){
        bActualHorario=new JButton("Horario Actual");
        bActualHorario.setBounds(100,100,200,20);
        bActualHorario.addActionListener(this);     
	return bActualHorario;		
    }
    
    public JButton getbCambioHorario(){
        bCambioHorario=new JButton("Cambiar horario");
        bCambioHorario.setBounds(100,130,200,20);
        bCambioHorario.addActionListener(this);     
	return bCambioHorario;		
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bCambioHorario){ 
            a.cambiarHorario(tfHorarioProfesor.getText());
            horarioEstudiante();
            JOptionPane.showMessageDialog(null, "El horario se ha modificado con éxito");
	}
        if(e.getSource()==bActualHorario){ 
            if(cbProfesor.getSelectedItem().equals("Felipe")){
                tfHorarioProfesor.setText(a.getDia());
            }else if(cbProfesor.getSelectedItem().equals("Wil")){
                tfHorarioProfesor.setText(b.getDia());
            }
            horarioEstudiante();
	}
    }
    
   public void horarioEstudiante(){
       
       if(cbEstudiante.getSelectedItem().equals("Carolina")){
            tfHorarioEstudiante.setText(h1.getDia());
       }else if(cbEstudiante.getSelectedItem().equals("Dayana")){
            tfHorarioEstudiante.setText(h2.getDia());
       }else if(cbEstudiante.getSelectedItem().equals("Vanesa")){
            tfHorarioEstudiante.setText(h3.getDia());
       }else if(cbEstudiante.getSelectedItem().equals("Manfred")){
            tfHorarioEstudiante.setText(h4.getDia());
       }
   }
    
    public void llenarCampos(){
        h1 = new Estudiante("Carolina","Martes");
        h2 = new Estudiante("Dayana","Martes");
        h3 = new Estudiante("Vanesa","Martes");
        
        h4 = new Estudiante("Manfred","Jueves");
        
        a = new Profesor("Felipe", "Martes");
        b = new Profesor("Wil", "Jueves");
        
        a.add(h1);
        a.add(h2);
        a.add(h3);
        
        b.add(h4);
    }
    
}
