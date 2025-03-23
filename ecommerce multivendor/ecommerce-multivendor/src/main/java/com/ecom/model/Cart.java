package com.ecom.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Cart {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;
    @OneToOne
    private User user;
@OneToMany(mappedBy = "cart" , cascade =CascadeType.ALL,orphanRemoval = true )
    private Set<CartItem> cartItems = new HashSet<>();

    private double totalSellingPrice;

    private int totalMrpPrice;

    private int discount;

    private String couponCode;





}
