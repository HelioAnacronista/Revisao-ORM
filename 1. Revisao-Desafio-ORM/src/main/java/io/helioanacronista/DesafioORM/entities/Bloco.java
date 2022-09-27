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
    o bloco está como responsavel pela a entidade atividade
    bloco recebe muitas atividades
    */
    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividades;

}
