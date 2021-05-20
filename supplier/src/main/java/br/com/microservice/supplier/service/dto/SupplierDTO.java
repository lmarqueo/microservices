package br.com.microservice.supplier.service.dto;

public class SupplierDTO {

    private Long id;
    private String name;
    private String state;
    private String address;

    public SupplierDTO(Long id, String name, String state, String address) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getAddress() {
        return address;
    }

}
