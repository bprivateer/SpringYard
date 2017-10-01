package com.example.customer.repository;

import com.example.customer.model.Customer;

import java.util.List;

public interface CustomerRepository {

     void add(Customer customer);

    void update(Customer customer);

    Customer getByID(int id);

    List<Customer> get();

    void deleteById(int id);
}
