package com.example.gamershopbackend.controller;

import com.example.gamershopbackend.model.Producto;
import com.example.gamershopbackend.repository.ProductoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin("*")
public class ProductoController {
    private final ProductoRepository repo;

    //Constructor del repositorio
    public ProductoController(ProductoRepository repo) {
        this.repo = repo;
    }

    //Listar
    @GetMapping
    public List<Producto> listar() {
        return repo.findAll();
    }

    //Guardar
    @PostMapping
    public Producto guardar(@RequestBody Producto producto) {
        return repo.save(producto);
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
