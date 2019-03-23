package model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Pagamento {

    private int idTransacao;
    private double numeroCartao;
    private String validadeCartao;
    private String bandeira;
}
