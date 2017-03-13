package au.com.edimoto.repository;

import au.com.edimoto.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

/**
 * Created by edicson on 12/3/17.
 */
@SuppressWarnings("JpaQueryApiInspection")
public class UserRepositoryImpl implements UserRepositoryOperations {

    @PersistenceContext()
    private EntityManager em;

    @Override
    public User findBySSO(String userName) {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public List<User> listAllFamilyNames() {
        return em.createNamedQuery("listAllFamilyNames").getResultList();
    }

    @Override
    public User listUser(String firstName, String lastName) {
        StoredProcedureQuery storedProcedure = em.createNamedStoredProcedureQuery("listUser").setParameter("p_firstName", firstName).setParameter("p_lastName", lastName);
        return (User) storedProcedure.getSingleResult();
    }
}
