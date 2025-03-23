package com.ecom.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CartItem {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;
    @ManyToOne
    @JsonIgnore
    private Cart cart;
    @ManyToOne
    private Product product;

    private String size;

    private int quantity = 1;

    private Integer mrpPrice;

    private Integer sellingPrice;

    private long userId;

}
