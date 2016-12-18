package fr.univtln.m2dapm.stockmanagement.dao.classes.equipments;

import fr.univtln.m2dapm.stockmanagement.dao.classes.AbstractCrud;
import fr.univtln.m2dapm.stockmanagement.dao.interfaces.equipments.IEquipmentDAO;
import fr.univtln.m2dapm.stockmanagement.entities.classes.equipments.AbstractEquipment;
import fr.univtln.m2dapm.stockmanagement.entities.interfaces.equipments.IEquipment;

import javax.persistence.EntityManager;

/**
 * Created by Maxime Gajovski on 18/12/2016.
 */
public class EquipmentDAOJPA extends AbstractCrud<Long, IEquipment, AbstractEquipment>
        implements IEquipmentDAO{

    public EquipmentDAOJPA(EntityManager entityManager) {
        super(entityManager);
    }

}
