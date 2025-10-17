package com.jpalearning.ecommerce.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_products" , schema = "ecommerce" , uniqueConstraints = {
        @UniqueConstraint(name = "sku_unique",columnNames = "sku")
})
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "product_sequence")
    @SequenceGenerator(name = "product_sequence", sequenceName = "product_sequence_name", allocationSize = 1)
    private long id;
    @Column(name = "product_name", nullable = false)
    private String name;
    @Column(name = "stock_keeping_unit",nullable = false)
    private String sku;
    private String description;
    private BigDecimal price;
    private boolean active;
    private String imageurl;

    @CreationTimestamp
    private String created;
    @UpdateTimestamp
    private String lastupdated;


}
