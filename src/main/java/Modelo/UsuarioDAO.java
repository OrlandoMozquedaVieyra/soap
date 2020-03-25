package Modelo;

import com.mycompany.servicio.Usuario;
import java.sql.*;

/**
 *
 * @author ALM_Usuario11
 */
public class UsuarioDAO {
    Conexion conexion;
    
    public UsuarioDAO (){
        conexion = new Conexion();
    }
    
    public Usuario verificaUsuario(String nombre,String usuario,String pass){
        Usuario user = null;
        Connection accesoDB = conexion.getConexion();
        
        try{
            PreparedStatement ps = accesoDB.prepareStatement("SELECT * FROM usuario WHERE usuario=? and pass=?");
            ps.setString(1, usuario);
            ps.setString(2, pass);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                user = new Usuario();
                user.setNombre(rs.getString(1));
                user.setUsuario(rs.getString(2));
                user.setPass(rs.getString(3));
                user.setEmail(rs.getString(4));
                
                return user;
            }
        }catch(Exception ex){
        }
        return user;
    }
}
