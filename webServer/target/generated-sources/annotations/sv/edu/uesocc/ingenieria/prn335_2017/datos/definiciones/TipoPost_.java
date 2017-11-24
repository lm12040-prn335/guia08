package sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Post;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoPostSeccion;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-23T20:22:18")
@StaticMetamodel(TipoPost.class)
public class TipoPost_ { 

    public static volatile SingularAttribute<TipoPost, String> descripcion;
    public static volatile SingularAttribute<TipoPost, Integer> idTipoPost;
    public static volatile ListAttribute<TipoPost, Post> postList;
    public static volatile ListAttribute<TipoPost, TipoPostSeccion> tipoPostSeccionList;
    public static volatile SingularAttribute<TipoPost, String> nombre;
    public static volatile SingularAttribute<TipoPost, Boolean> activo;

}