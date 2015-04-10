package com.kn.ttuexample.container;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by xubuntu on 02.04.15.
 */
@Service
@Transactional(readOnly = true)
public class ContainerService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void create(Container container) {
        entityManager.persist(container);
        return;
    }

    public void listContainers() {
        TypedQuery<Container> containerTypedQuery =
                entityManager.createQuery("from Container c", Container.class);
        List<Container> resultList = containerTypedQuery.getResultList();

        for (Container container : resultList) {
            System.out.println("container size = " + container.getSize());
            System.out.println("container id = " + container.getInternalId());
        }
    }
}
