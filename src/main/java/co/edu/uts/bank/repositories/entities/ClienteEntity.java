package co.edu.uts.bank.repositories.entities;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private String nombre;

    @Column(nullable = true)
    private String apellidos;

    @Column(nullable = true, unique = true)
    private String document;

    @Column(nullable = true, unique = true)
    private String email;

    @Column(nullable = true)
    private String celular;

    @Column(nullable = true)
    private String dirreciones;



    @OneToMany(mappedBy = "cliente")
    private List<CreditoEntity> creditos;
}
