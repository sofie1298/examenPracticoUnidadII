package hn.unah.lenguajes1900.examen2.demo.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name="cuentas")
@Data
public class Cuentas {
    @Id
    @Column(name="numerocuenta")
    private String numeroCuenta;

    private double saldo;

    @Column(name = "fechaapertura")
    private LocalDate fechaApertura;

    private boolean estado;
     private boolean sobregiro;

     @JsonBackReference
     @ManyToOne
     @JoinColumn(name="dni",referencedColumnName = "dni")
     private Cliente cliente;

     @JsonManagedReference
     @OneToMany
     private List<Movimientos> movimientos;

}
