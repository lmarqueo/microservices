package br.com.microservice.store.controller.dto;

import java.util.List;

public class StoreDTO {

    private List<PurchaseItemDTO> items;
    private AddressDTO address;

    public StoreDTO(List<PurchaseItemDTO> items, AddressDTO address) {
        this.items = items;
        this.address = address;
    }

    public List<PurchaseItemDTO> getItems() {
        return items;
    }

    public AddressDTO getAddress() {
        return address;
    }

}
