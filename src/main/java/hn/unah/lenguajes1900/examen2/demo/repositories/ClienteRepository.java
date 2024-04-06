package hn.unah.lenguajes1900.examen2.demo.repositories;

import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.examen2.demo.entities.Cliente;

import org.springframework.data.repository.CrudRepository;
@Repository
public interface ClienteRepository extends CrudRepository<Cliente,String>{
    
}
