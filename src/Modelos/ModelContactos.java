/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author umg
 */
public class ModelContactos {
    
    
    DefaultTableModel ModeloTabla = new DefaultTableModel();
     
    ArrayList MiLista = new ArrayList<String>();
    
        public void IngresarContacto(String ape, String nom, String tel)
    {
        ClaseContactos nuevoPersona = new ClaseContactos(ape, nom, tel);
        MiLista.add(nuevoPersona);        
    }
    
    public DefaultTableModel ListarContacto()
    {             
        ArrayList <ClaseContactos> ListaLocal=MiLista;
        for(ClaseContactos MiListaPersona: ListaLocal)
        {
            ModeloTabla.addRow(new Object[]{MiListaPersona.getApellidos(), MiListaPersona.getNombre(),
            MiListaPersona.getTelefono()});
        }
        
        return ModeloTabla;            
    }
    
    public DefaultTableModel nomColumna()
    {         
        ModeloTabla.addColumn("APELLIDOS");
        ModeloTabla.addColumn("NOMBRE");
        ModeloTabla.addColumn("TELEFONO");
       
        return ModeloTabla;
    }
}
