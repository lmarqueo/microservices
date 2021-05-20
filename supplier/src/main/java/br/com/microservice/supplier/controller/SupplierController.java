package br.com.microservice.supplier.controller;

import br.com.microservice.supplier.service.SupplierService;
import br.com.microservice.supplier.service.dto.SupplierDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class SupplierController {

    private final SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("/{state}")
    public ResponseEntity<SupplierDTO> getSupplierInfoByState(@PathVariable("state") String state) {
        return ResponseEntity.ok(supplierService.getSupplierInfoByState(state));
    }

}
