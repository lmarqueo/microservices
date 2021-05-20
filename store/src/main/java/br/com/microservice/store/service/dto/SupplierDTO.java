package br.com.microservice.store.service.dto;

public class SupplierDTO {

    private String address;

    public SupplierDTO(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

}
