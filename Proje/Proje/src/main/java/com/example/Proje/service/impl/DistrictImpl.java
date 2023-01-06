package com.example.Proje.service.impl;

import com.example.Proje.config.DistrictDtoMapper;
import com.example.Proje.dto.DistrictDto;
import com.example.Proje.entity.District;
import com.example.Proje.repository.DistrictRepository;
import com.example.Proje.service.DistrictService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictImpl implements DistrictService {
    private final DistrictRepository districtRepository;
    private final DistrictDtoMapper districtDtoMapper;

    public DistrictImpl(DistrictRepository districtRepository, DistrictDtoMapper districtDtoMapper) {
        this.districtRepository = districtRepository;
        this.districtDtoMapper = districtDtoMapper;
    }
    @Override
    public District save(District district) {
        return districtRepository.save(district);
    }

    @Override
    public List<District> getDistrict() {
        List<District> districts = districtRepository.findAll();
        return districts;
    }

    @Override
    public void delete(Long Id) {
        districtRepository.deleteById(Id);
    }

    @Override
    public DistrictDto update(DistrictDto districtDto, Long id) {
        District district1 = districtRepository.findById(id).get();
        districtDtoMapper.partialUpdate(district1, districtDto);
        return districtDtoMapper.toDto(districtRepository.save(district1));
    }
}
