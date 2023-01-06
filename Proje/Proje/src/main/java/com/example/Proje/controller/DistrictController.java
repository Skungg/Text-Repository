package com.example.Proje.controller;

import com.example.Proje.dto.DistrictDto;
import com.example.Proje.entity.District;
import com.example.Proje.repository.DistrictRepository;
import com.example.Proje.service.DistrictService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "district")
public class DistrictController {
    private final DistrictService districtService;

    public DistrictController(DistrictService districtService) {
        this.districtService = districtService;
    }
    @PostMapping("/createDistrict")
    public District save(District district){
        return districtService.save(district);
    }
    @GetMapping("/getDistrict")
    public List<District> getDistrict() {
        return districtService.getDistrict();
    }

    @DeleteMapping("/deleteDistrict/{id}")
    public void delete(@PathVariable("id") Long id) {
        districtService.delete(id);
    }

    @PatchMapping("/patchDistrict/{id}")
    public ResponseEntity<DistrictDto> updateDistrict(@RequestBody DistrictDto districtDto, @PathVariable("id") Long id) {
        if (id == districtDto.getId()) {
            return ResponseEntity.ok(districtService.update(districtDto, id));
        } else {
            throw new IllegalArgumentException("ID'LER EŞLEŞMİYOR");
        }

    }
}
