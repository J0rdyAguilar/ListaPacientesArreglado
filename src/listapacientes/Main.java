
package listapacientes;

import pckControladores.ListaController;
import pckModelos.ListaModel;
import pckModelos.ListaModel1;
import pckVistas.frmListas;
import pckVistas.frmPrincipal;

public class Main {

    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmListas VistaListas = new frmListas(VistaPrincipal, true);
        ListaModel ModeloLista = new ListaModel();
        ListaModel1 ModeloLista1 = new ListaModel1();
        ListaController ControladorLista = new ListaController(VistaPrincipal, VistaListas,
        ModeloLista, ModeloLista1);
        
        
        
        
        
        
       
    }
    
}
