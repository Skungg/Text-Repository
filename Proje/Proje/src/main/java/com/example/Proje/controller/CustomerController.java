package com.example.Proje.controller;

import com.example.Proje.dto.CustomerDto;
import com.example.Proje.entity.Customer;
import com.example.Proje.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @PostMapping("/createCustomer")
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }
    @GetMapping("/getCustomer")
    public List<Customer> getCustomer(){
        return customerService.getCustomer();
    }
    @DeleteMapping("/deleteCustomer/{id}")
    public void delete(@PathVariable("id") Long id){
        customerService.delete(id);
    }
    @PatchMapping("/patchCustomer/{id}")
    public ResponseEntity<CustomerDto> uptadeCustomer(@RequestBody CustomerDto customerDto, @PathVariable Long id) {
        if (id == customerDto.getId()) {
            return ResponseEntity.ok(customerService.update(customerDto, id));
        }
        else {
            throw new IllegalArgumentException("ID'LER EŞLEŞMİYOR");
        }
    }
}
