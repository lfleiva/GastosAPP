/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gastosApp.ejb;

import co.gastosApp.modelo.CategoriaGasto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Luis Fernando Leiva
 */
@Stateless
public class CategoriaGastoFacade extends AbstractFacade<CategoriaGasto> {

    @PersistenceContext(unitName = "GastosAPPPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategoriaGastoFacade() {
        super(CategoriaGasto.class);
    }
    
}
