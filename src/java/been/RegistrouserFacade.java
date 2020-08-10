/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package been;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import loginpack.Registrouser;

/**
 *
 * @author pc-4
 */
@Stateless
public class RegistrouserFacade extends AbstractFacade<Registrouser> {

    @PersistenceContext(unitName = "ejemplologinPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegistrouserFacade() {
        super(Registrouser.class);
    }
    
}
