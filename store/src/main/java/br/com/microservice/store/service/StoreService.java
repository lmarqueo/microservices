package br.com.microservice.store.service;

import br.com.microservice.store.controller.dto.StoreDTO;
import br.com.microservice.store.service.dto.SupplierDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StoreService {

    private final RestTemplate client;

    @Autowired
    public StoreService(RestTemplate client) {
        this.client = client;
    }

    public void makePurchase(StoreDTO store) {
        ResponseEntity<SupplierDTO> supplierDTOResponseEntity =
                client.exchange("http://supplier:8081/info/" + store.getAddress().getState(),
                    HttpMethod.GET, null, SupplierDTO.class);
        System.out.println(supplierDTOResponseEntity.getBody().getAddress());
    }

}
