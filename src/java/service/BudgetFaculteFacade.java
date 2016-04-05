/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.BudgetFaculte;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hamid
 */
@Stateless
public class BudgetFaculteFacade extends AbstractFacade<BudgetFaculte> {

    @PersistenceContext(unitName = "budget_fstg_en_lignePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BudgetFaculteFacade() {
        super(BudgetFaculte.class);
    }
    
}
