/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.controladores;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.primefaces.model.LazyDataModel;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.AbstracInterface;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.RolFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Rol;

/**
 *
 * @author ed
 */
@Named(value = "rolBean")
@ViewScoped
public class RolBean extends DefaultGenerator<Rol> implements Serializable{

    /**
     * Creates a new instance of RolBean
     */
    public RolBean() {
    }

    @EJB
    private RolFacadeLocal rolFacade;

  


    /**
     *
     * @return
     */
    @Override
    public Rol crearNuevo() {

        this.registro = new Rol();

        return this.registro;
    }

    /**
     *
     * @return
     */
    @Override
    protected AbstracInterface<Rol> getFacade(){
        return this.rolFacade;
    }
    
    

    /**
     *
     */
    public void onRowSelect() {

    }
    
    /**
     *
     * @return
     */
    public Integer seleccion (){
        return registro.getIdRol();
    }


    
 

    /**
     *
     * @param rowKey
     * @return
     */
    @Override
    public Rol obtenerRowData(String rowKey) {
        try {
            List<Rol> registros = (List<Rol>) this.modelo.getWrappedData();
            if (registros != null && !registros.isEmpty()) {
               int buscado = Integer.parseInt(rowKey);
                for (Rol r : registros) {
                    if (r.getIdRol().compareTo(buscado) != 0) {
                    } else {
                        return r;
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
        return null;
    }

    /**
     *
     * @param object
     * @return
     */
    @Override 
    public Object obtenerRowKey(Rol object) {
        if (object != null) {
            return object.getIdRol();
        }
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public LazyDataModel<Rol> getModelo() {
        return modelo;
    }



}
