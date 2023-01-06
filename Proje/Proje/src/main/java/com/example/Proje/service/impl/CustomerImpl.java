package com.example.Proje.service.impl;

import com.example.Proje.config.CustomerDtoMapper;
import com.example.Proje.dto.CustomerDto;
import com.example.Proje.entity.Customer;
import com.example.Proje.repository.CityRepository;
import com.example.Proje.repository.CustomerRepository;
import com.example.Proje.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerDtoMapper customerDtoMapper;

    public CustomerImpl(CustomerRepository customerRepository, CustomerDtoMapper customerDtoMapper) {
        this.customerRepository = customerRepository;
        this.customerDtoMapper = customerDtoMapper;
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getCustomer() {
        List<Customer> customers = customerRepository.findAll();
        return customers;
    }

    @Override
    public void delete(Long Id) {
        customerRepository.deleteById(Id);
    }

    @Override
    public CustomerDto update(CustomerDto customerDto, Long id) {
        Customer customer1 = customerRepository.findById(id).get();
        customerDtoMapper.partialUpdate(customer1, customerDto);
        return customerDtoMapper.toDto(customerRepository.save(customer1));
    }
}
