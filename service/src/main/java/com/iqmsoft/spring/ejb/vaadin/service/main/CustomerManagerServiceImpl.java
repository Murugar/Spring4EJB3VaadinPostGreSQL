package com.iqmsoft.spring.ejb.vaadin.service.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ejb.interceptor.SpringBeanAutowiringInterceptor;

import com.iqmsoft.spring.ejb.vaadin.common.Customer;
import com.iqmsoft.spring.ejb.vaadin.service.repos.CustomerRepository;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import java.util.List;

/**
 * Implementation of {@link CustomerManagerService}
 */
@Stateless(name = "CustomerManagerService")
@Interceptors(SpringBeanAutowiringInterceptor.class)
public class CustomerManagerServiceImpl implements CustomerManagerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public void update(Customer customer) {
        customerRepository.save(customer);
    }
    
    @Override
    public void delete(Customer customer) {
        customerRepository.delete(customer);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }
}
