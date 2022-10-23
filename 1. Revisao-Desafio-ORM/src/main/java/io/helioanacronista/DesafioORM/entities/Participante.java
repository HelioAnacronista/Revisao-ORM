package io.helioanacronista.DesafioORM.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_participante")
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String email;


    /*

    Criamos um tabale para evitar o mutiplos id na tabela.
    como sabemos não aceitamos mutiplos id;


    @JoinTable(
            name = "NOME DA TABLE QUE VAI SER CRIADA",
            joinColumns = @JoinColumn(name = "A COLUNA DA CLASSE QUE ESTAMOS"),
            inverseJoinColumns = @JoinColumn(name = "O ID DA CLASSE estrangeiro")
    )

    @JoinTable Cria um nova tebla entre as 2 entidades
    para a @JoinTable damos o nome dela
    coluna resposavel que seria a classe que estamos,
    inversonJoinColumns sera a classe e seu id estrangeiro
     */
    @ManyToMany
    @JoinTable(
            name = "tb_participante_atividade",
            joinColumns = @JoinColumn(name = "participante_id"),
            inverseJoinColumns = @JoinColumn(name = "atividade_id")
    )
    private List<Atividade> atividades = new ArrayList<>();
}
