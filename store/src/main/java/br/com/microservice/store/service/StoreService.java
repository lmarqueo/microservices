package br.com.microservice.store.service;

import br.com.microservice.store.controller.dto.StoreDTO;
import br.com.microservice.store.service.dto.SupplierDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StoreService {

    public void makePurchase(StoreDTO store) {
        RestTemplate client = new RestTemplate();
        ResponseEntity<SupplierDTO> supplierDTOResponseEntity =
                client.exchange("http://localhost:8081/info" + store.getAddress().getState(),
                    HttpMethod.GET, null, SupplierDTO.class);
        System.out.println(supplierDTOResponseEntity.getBody().getAddress());
    }

}
