package  pckModelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class ListaModel1 {
    Queue<Pacientes> ListaPacientes1 = new LinkedList();
    
    public void EncolarPaciente(String ape, String nom){
        
        Pacientes nuevoPaciente = new Pacientes(ape, nom);
        this.ListaPacientes1.add(nuevoPaciente);
        JOptionPane.showMessageDialog(null, "Paciente Agregado Correctamente");
    }
    
    public Queue ListarPacientes(){
        
        return this.ListaPacientes1;
        
    }
    
    public void DesEncolar(){
        
        this.ListaPacientes1.poll();
        
    }
    
}