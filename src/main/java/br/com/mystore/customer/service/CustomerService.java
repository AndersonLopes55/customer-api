package br.com.mystore.customer.service;

import br.com.mystore.customer.entity.Customer;
import br.com.mystore.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Customer addCustomerEntity(Customer customer) {

        return repository.save(customer);

    }
}
