package com.kn.ttuexample.container;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by xubuntu on 02.04.15.
 */
@Service
@Transactional(readOnly = true)
public class ContainerService {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(Container container) {
        entityManager.persist(container);
        return;
    }
}
