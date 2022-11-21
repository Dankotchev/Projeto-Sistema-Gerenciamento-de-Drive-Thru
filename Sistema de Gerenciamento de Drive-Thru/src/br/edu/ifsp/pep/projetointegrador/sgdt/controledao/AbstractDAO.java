package br.edu.ifsp.pep.projetointegrador.sgdt.controledao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractDAO<T> {

    private final EntityManagerFactory emf;

    public AbstractDAO() {
        emf = Persistence
                .createEntityManagerFactory("ProjetoIntegradorSGDT_PU");
//                .createEntityManagerFactory("ProjetoIntegradorSGDT_PU_POSTGRES");
    }

    protected EntityManager getEntityManager() {
        return this.emf.createEntityManager();
    }

    public void inserir(T entity) throws Exception {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();

        em.close();
    }

    public void alterar(T entity) {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();

        em.close();
    }

    public void remover(T entity) {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        em.remove(em.merge(entity));
        em.getTransaction().commit();

        em.close();
    }

}
