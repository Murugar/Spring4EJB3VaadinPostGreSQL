package com.iqmsoft.spring.ejb.vaadin.service.main;

import javax.ejb.Local;

import com.iqmsoft.spring.ejb.vaadin.common.Customer;

import java.io.Serializable;
import java.util.List;

/**
 * Business layer service.
 */
@Local
public interface CustomerManagerService extends Serializable {

    /**
     * Get all customers.
     *
     * @return List<Customer>
     */
    List<Customer> getCustomers();

    /**
     * Delete customer.
     *
     * @param customer - source customer
     */
    void delete(Customer customer);

    /**
     * Save customer.
     *
     * @param customer - source customer
     */
    void save(Customer customer);
    
    void update(Customer customer);
}
