package fr.univtln.m2dapm.stockmanagement.dao.classes.premises;

import fr.univtln.m2dapm.stockmanagement.dao.classes.AbstractCrud;
import fr.univtln.m2dapm.stockmanagement.dao.interfaces.premises.IClassroomDAO;
import fr.univtln.m2dapm.stockmanagement.entities.classes.premises.ClassRoom;
import fr.univtln.m2dapm.stockmanagement.entities.interfaces.premises.IClassRoom;

import javax.persistence.EntityManager;

/**
 * Created by Maxime Gajovski on 17/12/2016.
 */


public class ClassroomDAOJPA extends AbstractCrud<Long, IClassRoom,ClassRoom>
        implements IClassroomDAO{

    public ClassroomDAOJPA(EntityManager entityManager) {
        super(entityManager);
    }

}
