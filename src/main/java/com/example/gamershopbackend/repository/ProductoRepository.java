package com.example.gamershopbackend.repository;

import com.example.gamershopbackend.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
