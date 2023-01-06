package com.example.Proje.entity;

import javax.persistence.*;


@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "plate_code")
    private Long plateCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPlateCode() {
        return plateCode;
    }

    public void setPlateCode(Long plateCode) {
        this.plateCode = plateCode;
    }
}
