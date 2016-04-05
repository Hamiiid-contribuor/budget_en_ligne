/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author HawkEye
 */
@Entity
public class BudgetEntiteAdministratifItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private CompteItem compteItem;
    @ManyToOne
    private BudgetEntiteAdministratif budgetEntiteAdministratif;

    public CompteItem getCompteItem() {
        return compteItem;
    }

    public void setCompteItem(CompteItem compteItem) {
        this.compteItem = compteItem;
    }

    public BudgetEntiteAdministratif getBudgetEntiteAdministratif() {
        return budgetEntiteAdministratif;
    }

    public void setBudgetEntiteAdministratif(BudgetEntiteAdministratif budgetEntiteAdministratif) {
        this.budgetEntiteAdministratif = budgetEntiteAdministratif;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetEntiteAdministratifItem)) {
            return false;
        }
        BudgetEntiteAdministratifItem other = (BudgetEntiteAdministratifItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.BudgetEntiteAdministratifItem[ id=" + id + " ]";
    }

}
