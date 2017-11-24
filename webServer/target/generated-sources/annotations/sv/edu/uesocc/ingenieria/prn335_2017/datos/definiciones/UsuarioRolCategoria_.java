package sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.RolCategoria;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Usuario;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.UsuarioRolCategoriaPK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-23T20:22:18")
@StaticMetamodel(UsuarioRolCategoria.class)
public class UsuarioRolCategoria_ { 

    public static volatile SingularAttribute<UsuarioRolCategoria, RolCategoria> rolCategoria;
    public static volatile SingularAttribute<UsuarioRolCategoria, UsuarioRolCategoriaPK> usuarioRolCategoriaPK;
    public static volatile SingularAttribute<UsuarioRolCategoria, Usuario> usuario;
    public static volatile SingularAttribute<UsuarioRolCategoria, Boolean> activo;

}