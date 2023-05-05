
import Controlador.ContactoController;
import Modelos.ModelContactos;
import Vistas.frmAgregar;
import Vistas.frmPersonas;
import Vistas.frmPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        frmPrincipal vista = new frmPrincipal();
        frmAgregar Agregar = new frmAgregar(null, true);
        frmPersonas vistaContacto = new frmPersonas(null, true);
        ModelContactos modelo = new ModelContactos();
        
        ContactoController Controlador= new ContactoController(vista,Agregar,vistaContacto, modelo);
    }
    
}
