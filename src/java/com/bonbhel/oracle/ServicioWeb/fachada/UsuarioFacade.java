/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonbhel.oracle.ServicioWeb.fachada;

import com.bonbhel.oracle.ServicioWeb.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author LEIDY
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {
    @PersistenceContext(unitName = "SevicioWebPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
}
