package com.iqmsoft.spring.ejb.vaadin.service.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iqmsoft.spring.ejb.vaadin.common.Customer;

/**
 * Repository for {@link Customer} class.
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
