package io.helioanacronista.DesafioORM.entities;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "tb_bloco")
public class Bloco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant inicio;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant fim;

    /*
    UML mostra que a entidade bloco pode ter muitos, porem ativiade apenas 1
    então o bloco é responsavel por criar o id de atividade por sua entidade.
    */
    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividades;

}
