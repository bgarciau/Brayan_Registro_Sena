
package Controlador;

import VIEWS.Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class CuentasControl implements ActionListener{
    
    VIEWS.Registro registrarUsuarioViews;
    MODEL.Usuario usuarioModelo;
    MODEL.gestorUsuario gestorPacienteModelo;

    public CuentasControl(Registro registrarUsuarioViews) {
        this.registrarUsuarioViews = registrarUsuarioViews;
        gestorPacienteModelo=new MODEL.gestorUsuario();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    if (e.getSource().equals(registrarUsuarioViews.AceptarjButton)){
           
            String tipoUsuario=(String)registrarUsuarioViews.tipoUusarioComboBox.getSelectedItem();
            String nombre=registrarUsuarioViews.nombreTextField.getText();
            String apellido=registrarUsuarioViews.apellidosTextField.getText();
            String tipoDocumento=(String)registrarUsuarioViews.tipoDocumentoComboBox.getSelectedItem();
            String documento=registrarUsuarioViews.numeroDocumentoTextField.getText();
            String correo=registrarUsuarioViews.correoTextField.getText();
            String contraseña=registrarUsuarioViews.contraseñaPasswordField.getName();
            usuarioModelo=new MODEL.Usuario(tipoUsuario, nombre, apellido, tipoDocumento, documento, correo, contraseña);
            gestorPacienteModelo.RegistrarUsuario(usuarioModelo);
            
        }
    }
}
