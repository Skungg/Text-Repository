package com.example.Proje.service;

import com.example.Proje.dto.CustomerDto;
import com.example.Proje.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer save (Customer customer);

    List<Customer> getCustomer();

    void delete(Long Id);

    CustomerDto update(CustomerDto customerDto, Long id);
}
