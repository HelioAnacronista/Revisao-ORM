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

    Criamos um tabale para evitar o mutiplos id na tabela
     */
    @ManyToMany
    @JoinTable(
            name = "tb_participante_atividade",
            joinColumns = @JoinColumn(name = "participante_id"),
            inverseJoinColumns = @JoinColumn(name = "atividade_id")
    )
    private List<Atividade> atividades = new ArrayList<>();
}
