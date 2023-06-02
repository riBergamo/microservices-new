package com.programmingtechie.orderservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "t_order_line_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineItems {//itens de linha de pedido

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;//Um código SKU é um código exclusivo dedicado a um SKU específico (produto/item/material). Uma empresa atribui seus próprios códigos SKU aos SKUs.
    private BigDecimal price;
    private Integer quantity;

}
