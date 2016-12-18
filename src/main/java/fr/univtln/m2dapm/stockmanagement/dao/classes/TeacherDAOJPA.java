package fr.univtln.m2dapm.stockmanagement.dao.classes;

import fr.univtln.m2dapm.stockmanagement.dao.interfaces.ITeacherDAO;
import fr.univtln.m2dapm.stockmanagement.entities.classes.actors.Teacher;
import fr.univtln.m2dapm.stockmanagement.entities.interfaces.actors.ITeacher;

import javax.persistence.EntityManager;

/**
 * Created by Maxime Gajovski on 17/12/2016.
 */

public class TeacherDAOJPA extends AbstractCrud<Long, ITeacher,Teacher>
        implements ITeacherDAO{

    public TeacherDAOJPA(EntityManager entityManager) {
        super(entityManager);
    }

}
