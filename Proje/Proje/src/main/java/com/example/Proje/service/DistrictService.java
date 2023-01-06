package com.example.Proje.service;

import com.example.Proje.dto.DistrictDto;
import com.example.Proje.entity.District;

import java.util.List;

public interface DistrictService {
    District save(District district);

    List<District> getDistrict();

    void delete(Long Id);

    DistrictDto update(DistrictDto districtDto, Long id);
}
