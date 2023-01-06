package com.example.Proje.service.impl;

import com.example.Proje.config.AddressDtoMapper;
import com.example.Proje.dto.AddressDto;
import com.example.Proje.entity.Address;
import com.example.Proje.repository.AddressRepository;
import com.example.Proje.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressImpl implements AddressService {
    private final AddressRepository addressRepository;
    private final AddressDtoMapper addressDtoMapper;

    public AddressImpl(AddressRepository addressRepository, AddressDtoMapper addressDtoMapper) {
        this.addressRepository = addressRepository;
        this.addressDtoMapper = addressDtoMapper;
    }

    @Override
    public Address save(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> getAddress() {
        List<Address> addresses = addressRepository.findAll();
        return addresses;
    }

    @Override
    public void delete(Long Id) {
        addressRepository.deleteById(Id);
    }

    @Override
    public AddressDto update(AddressDto addressDto, Long id) {
        Address address1 = addressRepository.findById(id).get();
        addressDtoMapper.partialUpdate(address1, addressDto);
        return addressDtoMapper.toDto(addressRepository.save(address1));
    }
}
