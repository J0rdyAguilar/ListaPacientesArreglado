package pckControladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;
import javax.swing.JOptionPane;
import pckModelos.ListaModel;
import pckModelos.ListaModel1;
import pckModelos.Pacientes;
import pckVistas.frmListas;
import pckVistas.frmPrincipal;

public class ListaController implements ActionListener {

    frmPrincipal VistaPrincipal;
    frmListas ListaPacientes;
    ListaModel ModeloLista;
    ListaModel1 ModeloLista1;
 

    public ListaController(frmPrincipal VistaPrincipal, frmListas ListaPacientes,
            ListaModel ModeloLista, ListaModel1 ModeloLista1) {
        this.VistaPrincipal = VistaPrincipal;
        this.ListaPacientes = ListaPacientes;
        this.ModeloLista = ModeloLista;
        this.ModeloLista1 = ModeloLista1;
        
                
        this.VistaPrincipal.btnHombre.addActionListener(this);
        this.VistaPrincipal.btnMujer.addActionListener(this);
        this.VistaPrincipal.btnVer.addActionListener(this);
        this.ListaPacientes.btnAtender1.addActionListener(this);
        this.ListaPacientes.btnAtender2.addActionListener(this);
        
        this.VistaPrincipal.setVisible(true);
    }
    
           
    
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == this.VistaPrincipal.btnHombre){
             this.ModeloLista.EncolarPaciente(this.VistaPrincipal.txtApellido.getText(),
                     this.VistaPrincipal.txtNombre.getText());
             
             Queue <Pacientes> ListaLocal = this.ModeloLista.ListarPacientes();
             
             String Cadena = " ";
             
             for(Pacientes MiListaPacientes: ListaLocal){
                 Cadena = Cadena + MiListaPacientes.getApellido() + " " + MiListaPacientes.getNombre() + "\n";
                 this.ListaPacientes.txtLista1.setText(Cadena);
             }
         }
         
         if(e.getSource() == this.VistaPrincipal.btnMujer){
             this.ModeloLista1.EncolarPaciente(this.VistaPrincipal.txtApellido.getText(),
                     this.VistaPrincipal.txtNombre.getText());
             
             Queue <Pacientes> ListaLocal = this.ModeloLista1.ListarPacientes();
             
             String Cadena = " ";
             
             for(Pacientes MiListaPacientes: ListaLocal){
                 Cadena = Cadena + MiListaPacientes.getApellido() + " " + MiListaPacientes.getNombre() + "\n";
                 this.ListaPacientes.txtLista2.setText(Cadena);
             }
         }
         if(e.getSource() == this.VistaPrincipal.btnVer){  
             this.ListaPacientes.setVisible(true);
         } 
         if(e.getSource() == this.ListaPacientes.btnAtender1){
            JOptionPane.showMessageDialog(null,"Paciente Atendido");
             this.ModeloLista.DesEncolar();
            Queue <Pacientes> ListaLocal = this.ModeloLista.ListarPacientes();
            
            String Cadena = " ";
             for(Pacientes MiListaPacientes: ListaLocal){
                 Cadena = Cadena + MiListaPacientes.getApellido() + " " + MiListaPacientes.getNombre() + "\n";
                 this.ListaPacientes.txtLista1.setText(Cadena);
            if(ListaLocal == null){
                this.ListaPacientes.txtLista1.setText(" ");
            }
            
         }  
    }
        if(e.getSource() == this.ListaPacientes.btnAtender2){
            JOptionPane.showMessageDialog(null,"Paciente Atendido");
             this.ModeloLista1.DesEncolar();
            Queue <Pacientes> ListaLocal = this.ModeloLista1.ListarPacientes();
            
            String Cadena = " ";
             for(Pacientes MiListaPacientes: ListaLocal){
                 Cadena = Cadena + MiListaPacientes.getApellido() + " " + MiListaPacientes.getNombre() + "\n";
                 this.ListaPacientes.txtLista2.setText(Cadena);
            }}
    }}