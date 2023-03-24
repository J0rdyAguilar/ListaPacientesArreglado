package pckModelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class ListaModel {
        Queue<Pacientes> ListaPacientes = new LinkedList();
    
    public void EncolarPaciente(String ape, String nom){
        
        Pacientes nuevoPaciente = new Pacientes(ape, nom);
        this.ListaPacientes.add(nuevoPaciente);
        JOptionPane.showMessageDialog(null, "Paciente Agregado Correctamente");
    }
    
    public Queue ListarPacientes(){
        
        return this.ListaPacientes;
        
    }
    
    public void DesEncolar(){
      this.ListaPacientes.poll();
          
    }
}
