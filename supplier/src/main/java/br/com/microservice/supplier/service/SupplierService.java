package br.com.microservice.supplier.service;

import br.com.microservice.supplier.model.Supplier;
import br.com.microservice.supplier.repository.SupplierRepository;
import br.com.microservice.supplier.service.dto.SupplierDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {

    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    public SupplierDTO getSupplierInfoByState(String state) {
        return toDTO(supplierRepository.findByState(state));
    }

    private SupplierDTO toDTO(Supplier supplier) {
        return new SupplierDTO(supplier.getId(), supplier.getName(), supplier.getState(), supplier.getAddress());
    }

}
