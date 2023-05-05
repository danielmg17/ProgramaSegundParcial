/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelos.ModelContactos;
import Vistas.frmAgregar;
import Vistas.frmPersonas;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author umg
 */
public class ContactoController implements ActionListener {
    frmPrincipal VistaPrincipal;
    frmAgregar AgregarContactos;
    frmPersonas VistaContactos;
    ModelContactos ContactosModelo;

    public ContactoController(frmPrincipal VistaPrincipal, frmAgregar AgregarPersonas, frmPersonas VistaPersonas, ModelContactos PersonasModelo) {
        this.VistaPrincipal = VistaPrincipal;
        this.AgregarContactos = AgregarPersonas;
        this.VistaContactos = VistaPersonas;
        this.ContactosModelo = PersonasModelo;
        
        this.VistaPrincipal.btnVerContactos.addActionListener(this);
        this.VistaPrincipal.btnAgregarContacto.addActionListener(this);
        this.AgregarContactos.btnAgregar.addActionListener(this);
        
        this.VistaPrincipal.setLocationRelativeTo(null);
        this.VistaPrincipal.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.VistaPrincipal.btnAgregarContacto){
            this.AgregarContactos.setVisible(true);
        }
        
        if(e.getSource() == this.VistaPrincipal.btnVerContactos){
            this.VistaContactos.jtbPersonas.setModel(this.ContactosModelo.ListarContacto());
            this.VistaContactos.setVisible(true);
        }
        
        if(e.getSource() == this.AgregarContactos.btnAgregar){
           if(this.VistaContactos.jtbPersonas.getColumnCount()==0)
            {
                this.VistaContactos.jtbPersonas.setModel(this.ContactosModelo.nomColumna());
            }
           
           
            this.ContactosModelo.IngresarContacto(this.AgregarContactos.txtApellidos.getText(), this.AgregarContactos.txtNombre.getText(),
            this.AgregarContactos.txtTelefono.getText());
            
            //this.VistaPersonas.jtbPersonas.setModel(this.PersonasModelo.ListarPacientes());
            this.AgregarContactos.setVisible(true);
        }
        
    }

}
