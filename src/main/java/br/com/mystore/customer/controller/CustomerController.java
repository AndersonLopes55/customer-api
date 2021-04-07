package br.com.mystore.customer.controller;

import br.com.mystore.customer.entity.Customer;
import br.com.mystore.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping("/adicionar")
    public Customer addCustomer(@RequestBody Customer customer) {

        return service.addCustomerEntity(customer);
    }

    @GetMapping("/listar")
    public List<Customer> listCustomer() {
        return service.listCustomers();
    }

    @DeleteMapping("/deletar")
    public void deleteCustomer(Customer customer) {
        service.deleteCustomer(customer);
    }

    @GetMapping("/listar/{id}")
    public Optional<Customer> listById(@PathVariable("id") Long id) {
        return service.listById(id);
    }
}
