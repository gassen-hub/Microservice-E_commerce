package com.example.product.product;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Category {
    @Id
    @GeneratedValue
    private Integer id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCommande;
    @Column(name = "total")
    private Double total;
    @Column(name = "nom_client", nullable = false)
    private String nomClient;
    @Column(name = "statut")
    private String statut;

}
