package model;


import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private int id;

    private String email;

    private String nome;

    private String shippingaddress;

    private List<OrderItem> itens;

    private BigDecimal precoTotal;

    private FormaPagamento formaPagamento;

    private LocalDateTime dataPedido;

    private String statusPedido;
}
