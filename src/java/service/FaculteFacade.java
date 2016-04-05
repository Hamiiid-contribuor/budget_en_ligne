/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Faculte;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hamid
 */
@Stateless
public class FaculteFacade extends AbstractFacade<Faculte> {

    @PersistenceContext(unitName = "budget_fstg_en_lignePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FaculteFacade() {
        super(Faculte.class);
    }
    
}
