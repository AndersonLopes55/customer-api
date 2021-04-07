package br.com.mystore.customer.service;

import br.com.mystore.customer.entity.Customer;
import br.com.mystore.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Customer addCustomerEntity(Customer customer) {

        return repository.save(customer);

    }

    public List<Customer> listCustomers() {

        return repository.findAll();
    }

    public void deleteCustomer(Customer customer) {
        repository.delete(customer);

    }

    public Optional<Customer> listById(Long id) {
        return repository.findById(id);
    }
}
