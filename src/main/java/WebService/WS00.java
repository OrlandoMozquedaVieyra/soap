package WebService;

import com.mycompany.servicio.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

@WebService(serviceName = "WS00")
@Stateless()
public class WS00 {

    @WebMethod(operationName = "enviar00")
    public Usuario ingresar(@WebParam(name = "Nombre") String Nombre, @WebParam(name = "usuario") String usuario,
    @WebParam(name="pass") String pass, @WebParam(name="email")String email) {
        Usuario obj = new Usuario();
        obj.setNombre(Nombre);
        obj.setPass(pass);
        obj.setUsuario(usuario);
        obj.setEmail(email);
        return obj;
    }
    
    @WebMethod(operationName = "enviar01")
    public List<Usuario> ingresar01(@WebParam(name = "Nombre") String Nombre, @WebParam(name = "usuario") String usuario,
    @WebParam(name="pass") String pass, @WebParam(name="email")String email) {
        Usuario obj = new Usuario();
        List <Usuario> lista = new ArrayList<Usuario>();
        obj.setNombre(Nombre);
        obj.setPass(pass);
        obj.setUsuario(usuario);
        obj.setEmail(email);
        lista.add(obj);
        return lista;
    }
    
    @WebMethod(operationName = "enviar02")
    public String ingresar02(@WebParam(name = "Nombre") String Nombre, @WebParam(name = "usuario") String usuario,
    @WebParam(name="pass") String pass, @WebParam(name="email")String email) {
        Usuario obj = new Usuario();
        obj.setNombre(Nombre);
        obj.setPass(pass);
        obj.setUsuario(usuario);
        obj.setEmail(email);
        String respuesta = obj.getRespuesta();
        return respuesta;
    }
    
}
