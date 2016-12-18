package fr.univtln.m2dapm.stockmanagement.dao.classes.equipments;

import fr.univtln.m2dapm.stockmanagement.dao.classes.AbstractCrud;
import fr.univtln.m2dapm.stockmanagement.dao.interfaces.equipments.ISlideProjectorDAO;
import fr.univtln.m2dapm.stockmanagement.entities.classes.equipments.SlideProjector;
import fr.univtln.m2dapm.stockmanagement.entities.interfaces.equipments.ISlideProjector;

import javax.persistence.EntityManager;

/**
 * Created by Maxime Gajovski on 18/12/2016.
 */
public class SlideProjectorDAOJPA extends AbstractCrud<Long, ISlideProjector,SlideProjector>
        implements ISlideProjectorDAO {

    public SlideProjectorDAOJPA (EntityManager entityManager) {
        super(entityManager);
    }

}
