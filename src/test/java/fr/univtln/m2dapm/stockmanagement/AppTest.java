package fr.univtln.m2dapm.stockmanagement;

import fr.univtln.m2dapm.stockmanagement.dao.classes.TeacherDAOJPA;
import fr.univtln.m2dapm.stockmanagement.dao.exceptions.DAOException;
import fr.univtln.m2dapm.stockmanagement.dao.interfaces.ITeacherDAO;
import fr.univtln.m2dapm.stockmanagement.entities.classes.actors.Teacher;
import junit.framework.TestCase;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{

    public static EntityManagerFactory EMF;
    private EntityManager em;
    private EntityTransaction transac;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }



    @org.junit.Test
    public void testApp() throws DAOException {
        EMF = Persistence
                .createEntityManagerFactory("hibernate-h2-stock");

        em = EMF.createEntityManager();
        transac = em.getTransaction();

        ITeacherDAO teacherDAO = new TeacherDAOJPA(em);

        transac.begin();

        teacherDAO.add(new Teacher.Builder()
                .setFirstName("Mourad")
                .setLastName("Beau gosse")
                .build());
        transac.commit();


    }
}
