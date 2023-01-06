package com.example.Proje.controller;

import com.example.Proje.config.AddressDtoMapper;
import com.example.Proje.dto.AddressDto;
import com.example.Proje.entity.Address;
import com.example.Proje.service.AddressService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "address")
public class AddressController {
    private final AddressService addressService;
    private final AddressDtoMapper addressDtoMapper;

    public AddressController(AddressService addressService, AddressDtoMapper addressDtoMapper) {
        this.addressService = addressService;
        this.addressDtoMapper = addressDtoMapper;
    }
    @PostMapping("/createAddress")
    public Address save(@RequestBody Address address) {
        return addressService.save(address);
    }
    @GetMapping("/getAddress")
    public List<Address> getAddress() {
        return addressService.getAddress();
    }
    @DeleteMapping("/deleteAddress/{id}")
    public void delete(@PathVariable("id") Long id) {
        addressService.delete(id);
    }
    @PatchMapping("/patchAddress/{id}")
    public ResponseEntity<AddressDto> updateAddress(@RequestBody AddressDto addressDto, @PathVariable("id") Long id) {
        if (id == addressDto.getId()) {
            return ResponseEntity.ok(addressService.update(addressDto, id));
        } else {
            throw new IllegalArgumentException("ID'LER EŞLEŞMİYOR");
        }

    }
}