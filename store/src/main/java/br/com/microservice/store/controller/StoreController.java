package br.com.microservice.store.controller;

import br.com.microservice.store.controller.dto.StoreDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
public class StoreController {

    @PostMapping
    public void makePurchase(@RequestBody StoreDTO store) {

    }

}
