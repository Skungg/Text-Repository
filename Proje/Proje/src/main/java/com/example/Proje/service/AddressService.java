package com.example.Proje.service;

import com.example.Proje.dto.AddressDto;
import com.example.Proje.entity.Address;

import java.util.List;

public interface AddressService {
    Address save(Address address);

    List<Address> getAddress();

    void delete(Long Id);

    AddressDto update(AddressDto addressDto, Long id);
}
