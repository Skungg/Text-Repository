package com.example.Proje.service;

import com.example.Proje.dto.CityDto;
import com.example.Proje.entity.City;

import java.util.List;

public interface CityService {
    City save(City city);

    List<City> getCity();

    void delete(Long Id);

    CityDto update(CityDto cityDto, Long id);
}
