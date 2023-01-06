package com.example.Proje.controller;

import com.example.Proje.dto.CityDto;
import com.example.Proje.entity.City;
import com.example.Proje.service.CityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "city")
public class CityController {
    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }
    @PostMapping("/createCity")
    public City save(@RequestBody City city){
        return cityService.save(city);
    }
    @GetMapping("/getCity")
    public List<City> getCity(){
        return cityService.getCity();
    }
    @DeleteMapping("/deleteCity/{id}")
    public void delete(@PathVariable("id") Long id){
        cityService.delete(id);
    }
    @PatchMapping("/patchCity/{id}")
    public ResponseEntity<CityDto> updateCity(@RequestBody CityDto cityDto, @PathVariable("id") Long id){
        if (id == cityDto.getId()){
            return ResponseEntity.ok(cityService.update(cityDto, id));
        }
        else{
            throw new IllegalArgumentException("ID'LER EŞLEŞMİYOR");
        }
    }
}
