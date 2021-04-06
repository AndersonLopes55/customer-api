package br.com.mystore.customer.controller;

import br.com.mystore.customer.entity.Customer;
import br.com.mystore.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping("/adicionar-cliente")
    public Customer addCustomer(@RequestBody Customer customer) {

        return service.addCustomerEntity(customer);
    }
}
