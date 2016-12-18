package fr.univtln.m2dapm.stockmanagement.dao.classes.equipments;

import fr.univtln.m2dapm.stockmanagement.dao.classes.AbstractCrud;
import fr.univtln.m2dapm.stockmanagement.dao.interfaces.equipments.IChalkBoxDAO;
import fr.univtln.m2dapm.stockmanagement.entities.classes.equipments.ChalkBox;
import fr.univtln.m2dapm.stockmanagement.entities.interfaces.equipments.IChalkBox;


import javax.persistence.EntityManager;

/**
 * Created by Maxime Gajovski on 18/12/2016.
 */
public class ChalkBoxDAOJPA extends AbstractCrud<Long, IChalkBox,ChalkBox>
        implements IChalkBoxDAO {

    public ChalkBoxDAOJPA (EntityManager entityManager) {
        super(entityManager);
    }

}
