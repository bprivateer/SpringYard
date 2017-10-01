package com.example.customer.service;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;
import com.example.customer.repository.CustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Transactional
    @Override
    public void add(Customer customer) {

    }
    @Transactional
    @Override
    public void update(Customer customer) {

    }

    @Override
    public void getByID(int id) {

    }

    @Override
    public List<Customer> get() {
        return null;
    }
    @Transactional
    @Override
    public void deleteById(int id) {

    }
}
