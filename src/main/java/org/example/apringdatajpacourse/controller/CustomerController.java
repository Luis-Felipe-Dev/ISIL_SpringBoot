package org.example.apringdatajpacourse.controller;

import org.example.apringdatajpacourse.entity.Customer;
import org.example.apringdatajpacourse.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public String helloController() {
        return "Hola Mundo";
    }

    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

    @GetMapping("/getall")
    public List<Customer> getall() {
        return customerService.getall();
    }

    @GetMapping("/getbyname")
    public List<Customer> findByName(@RequestParam String name) {
        return customerService.findByName(name);
    }

    @GetMapping("/getbyemail")
    public Customer findByEmail(@RequestParam String email) {
        return customerService.findCustomerByEmail(email);
    }

    @PostMapping("/updatecustomer")
    public void updateCustomer(@RequestParam String email, @RequestBody Customer customer) {
        customerService.updateCustomer(customer, email);
    }
}
