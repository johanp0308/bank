package co.edu.uts.bank.repositories.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.Date;

import org.hibernate.annotations.CollectionId;


@Entity
@Table(name = "creditos")
@Data
public class CreditoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private Integer numCuotas;

    @Column(nullable = true)
    private Double monto;

    @Column(nullable = true,name = "fecha_soliitud")
    private Date fechaSolicitud;

    @Column(nullable = true,name="tasa_interes")
    private Double tasaInteres;

    @Column(nullable = true)
    private String estado;

    @ManyToOne
    @JoinColumn(name="cliente_id")
    private ClienteEntity cliente;
}
