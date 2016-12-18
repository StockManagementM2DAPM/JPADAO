package fr.univtln.m2dapm.stockmanagement.dao.classes.equipments;

import fr.univtln.m2dapm.stockmanagement.dao.classes.AbstractCrud;
import fr.univtln.m2dapm.stockmanagement.dao.interfaces.equipments.IComputerDAO;
import fr.univtln.m2dapm.stockmanagement.entities.classes.equipments.Computer;
import fr.univtln.m2dapm.stockmanagement.entities.interfaces.equipments.IComputer;

import javax.persistence.EntityManager;

/**
 * Created by Maxime Gajovski on 18/12/2016.
 */

public class ComputerDAOJPA extends AbstractCrud<Long, IComputer,Computer>
        implements IComputerDAO {

    public ComputerDAOJPA (EntityManager entityManager) {
        super(entityManager);
    }

}
