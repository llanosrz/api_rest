package com.example.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.entities.Producto;

public interface ProductoService {
    
    public List<Producto> findAll(Sort sort); // Sort de spring framework data domain
    public Page<Producto> findAll(Pageable peageable); //Pageable del mismo
    public Producto findById(long id);
    public Producto save(Producto producto);
    public void delete(Producto producto);
}
