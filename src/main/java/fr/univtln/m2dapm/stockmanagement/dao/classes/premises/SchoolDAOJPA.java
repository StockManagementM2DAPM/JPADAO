package fr.univtln.m2dapm.stockmanagement.dao.classes.premises;

import fr.univtln.m2dapm.stockmanagement.dao.classes.AbstractCrud;
import fr.univtln.m2dapm.stockmanagement.dao.interfaces.premises.ISchoolDAO;
import fr.univtln.m2dapm.stockmanagement.entities.classes.premises.School;
import fr.univtln.m2dapm.stockmanagement.entities.interfaces.premises.ISchool;

import javax.persistence.EntityManager;

/**
 * Created by Maxime Gajovski on 18/12/2016.
 */
public class SchoolDAOJPA extends AbstractCrud<Long, ISchool,School>
        implements ISchoolDAO{

    public SchoolDAOJPA(EntityManager entityManager) {
        super(entityManager);
    }

}
