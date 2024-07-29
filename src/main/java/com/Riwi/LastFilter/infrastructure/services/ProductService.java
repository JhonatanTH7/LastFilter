package com.Riwi.LastFilter.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.Riwi.LastFilter.domain.repositories.ProductRepository;
import com.Riwi.LastFilter.infrastructure.abstract_services.IProductService;
import com.Riwi.LastFilter.infrastructure.abstract_services.ProductResponse;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService implements IProductService {

    @Autowired
    private final ProductRepository productRepository;
    
    @Override
    public Page<ProductResponse> getAll(int page, int size) {
        if(page < 0){
            page = 0;
        }

        PageRequest pagination = PageRequest.of(page, size);
        return this.productRepository.findAll(pagination).map(this.productMapper::toResponse);
    }
    

    
}
