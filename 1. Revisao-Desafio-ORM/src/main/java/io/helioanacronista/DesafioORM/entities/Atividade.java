package io.helioanacronista.DesafioORM.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_atividade")
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String descricao;

    private Double preco;

    /*
    A classe Ativadade tem relacionamento com as classes de Categoria e Participantes.

    # Fazemos a pergunta na classe que estamos

    -Categoria é de 1 para *(muitos)

    - Participantes é de Muitos para Muitos
    */
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categorias;

    @ManyToMany(mappedBy = "atividades")
    private Set<Participante> participantes = new HashSet<>();
}
