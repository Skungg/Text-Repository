package com.example.Proje.dto;

public class CustomerDto {
    private Long id;
    private String tckn;
    private String firstName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
