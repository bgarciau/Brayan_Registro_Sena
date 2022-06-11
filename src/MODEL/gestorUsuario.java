
package MODEL;

import java.util.LinkedList;

public class gestorUsuario {
     private static LinkedList<Usuario>usuarios;
     public gestorUsuario() {
        usuarios=new LinkedList<Usuario>();
    }
    public void RegistrarUsuario(Usuario usuario){
       usuarios.add(usuario);
       
    }

    }
