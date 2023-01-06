package com.example.Proje.service.impl;

import com.example.Proje.config.CityDtoMapper;
import com.example.Proje.dto.CityDto;
import com.example.Proje.entity.City;
import com.example.Proje.repository.CityRepository;
import com.example.Proje.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityImpl implements CityService {
    private final CityRepository cityRepository;
    private final CityDtoMapper cityDtoMapper;

    public CityImpl(CityRepository cityRepository, CityDtoMapper cityDtoMapper) {
        this.cityRepository = cityRepository;
        this.cityDtoMapper = cityDtoMapper;
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public List<City> getCity() {
        List<City> cities = cityRepository.findAll();
        return cities;
    }

    @Override
    public void delete(Long Id) {
        cityRepository.deleteById(Id);
    }

    @Override
    public CityDto update(CityDto cityDto, Long id) {
        City city1 = cityRepository.findById(id).get();
        cityDtoMapper.partialUpdate(city1, cityDto);
        return cityDtoMapper.toDto(cityRepository.save(city1));
    }
}
