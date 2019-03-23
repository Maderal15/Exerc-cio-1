package model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    private int id;

    private String name;

    private double preco;

}
