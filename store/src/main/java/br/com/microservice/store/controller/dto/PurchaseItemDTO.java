package br.com.microservice.store.controller.dto;

public class PurchaseItemDTO {

    private long id;
    private int quantity;

    public PurchaseItemDTO(long id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

}
