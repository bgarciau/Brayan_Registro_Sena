/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import VIEWS.ConsultarUsuarios;

public class GestorCuentasControl implements ActionListener {
    MODEL.gestorUsuario usuariosModelo;
    VIEWS.ConsultarUsuarios consultarUsuarioView;

    public GestorCuentasControl(ConsultarUsuarios consultarUsuarioView) {
        this.consultarUsuarioView = consultarUsuarioView;
        usuariosModelo=new MODEL.gestorUsuario();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
