package com.example.customer.service;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CustomerService {


    void add(Customer customer);

    void update(Customer customer);

    void getByID(int id);

    List<Customer> get();

    void deleteById(int id);
}
