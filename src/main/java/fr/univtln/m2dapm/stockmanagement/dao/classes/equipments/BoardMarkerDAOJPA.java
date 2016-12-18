package fr.univtln.m2dapm.stockmanagement.dao.classes.equipments;

import fr.univtln.m2dapm.stockmanagement.dao.classes.AbstractCrud;
import fr.univtln.m2dapm.stockmanagement.dao.interfaces.equipments.IBoardMarkerDAO;
import fr.univtln.m2dapm.stockmanagement.entities.classes.equipments.BoardMarker;
import fr.univtln.m2dapm.stockmanagement.entities.interfaces.equipments.IBoardMarker;

import javax.persistence.EntityManager;

/**
 * Created by Maxime Gajovski on 18/12/2016.
 */

public class BoardMarkerDAOJPA extends AbstractCrud<Long, IBoardMarker,BoardMarker>
        implements IBoardMarkerDAO {

    public BoardMarkerDAOJPA (EntityManager entityManager) {
        super(entityManager);
    }

}
