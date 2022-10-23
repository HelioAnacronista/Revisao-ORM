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
    Atividade terar um coluna com id da categoria
    então seguindo a UML @ManyToOne e adicionamos a coluna @JoinColumn(name = "categoria_id")

    Como sabemos que temos uma relação muitos para muitos precisamos criar uma tabela de id para a modelagem.
    Nesse caso a entidade participante terar que criar essa tabela de mutiplos id.
    portanto usando o mappedBy
    */
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categorias;

    @ManyToMany(mappedBy = "atividades")
    private Set<Participante> participantes = new HashSet<>();
}
