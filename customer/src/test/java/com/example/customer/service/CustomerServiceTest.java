package com.example.customer.service;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;
import com.example.customer.repository.CustomerRepositoryImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.stream.Collectors;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {

    @Autowired
    CustomerRepository customerRepository;


    @Test
    public void  testAddGet(){
        Customer customer1 = new Customer();

        customer1.setEmail("EMAIL");
        customer1.setFirstName("Bern");
        customer1.setLastName("Last name");
        customer1.setPhone("770 820 8799");
        customer1.setId(21);

        customerRepository.add(customer1);

        List<Customer> customers = customerRepository.get().stream()
                .filter(customer -> customer.getFirstName() == customer1.getFirstName() && customer.getLastName() == customer1.getLastName())
                .collect(Collectors.toList());

//        Customer customer2 = customers.get(0);
//        Assert.assertNull(customer2);

    }


}
