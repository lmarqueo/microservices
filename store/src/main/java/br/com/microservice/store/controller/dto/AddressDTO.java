package br.com.microservice.store.controller.dto;

public class AddressDTO {

    private String street;
    private int number;
    private String state;

    public AddressDTO(String street, int number, String state) {
        this.street = street;
        this.number = number;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getState() {
        return state;
    }

}
