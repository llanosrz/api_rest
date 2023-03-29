package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.dao.ProductoDao;
import com.example.entities.Producto;

import jakarta.transaction.Transactional;

@Service //
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao; //para cuando haga falta un objeto de tipo 
                                        // ProductoDao Spring lo inyecta directamente al ponerle @Autowired
                                        //resolucion de dependencias mediante @autowired o tambien mediante
                                        // constructor

    @Override
    public List<Producto> findAll(Sort sort) {
        return productoDao.findAll(sort); //hay que elegir el que recibe un sort
    }

    @Override
    public Page<Producto> findAll(Pageable peageable) {
        return productoDao.findAll(peageable); //lo mismo con pageable
    }

    @Override
    public Producto findById(long id) {
        return productoDao.findById(id);
    }

    @Transactional
    @Override
    public Producto save(Producto producto) {
        return productoDao.save(producto); //devuelve el producto al poner esto
        
    }

    @Transactional
    @Override
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }
    
}
