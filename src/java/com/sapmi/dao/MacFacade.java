/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sapmi.dao;

import com.sapmi.persistencia.Mac;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Auxiliares
 */
@Stateless
public class MacFacade extends AbstractFacade<Mac> implements MacFacadeLocal {

    @PersistenceContext(unitName = "ServicesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MacFacade() {
        super(Mac.class);
    }
    
}
