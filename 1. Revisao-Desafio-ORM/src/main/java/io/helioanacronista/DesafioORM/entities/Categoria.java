package io.helioanacronista.DesafioORM.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;


    /*
    Quem fica por criar a tabela ou "responsavel por fazer ela sera a entidade ativiades"

    Assim usando o mappedBy
    quando for na entidade Atividade Chammos pelo nome dado pelo mappedBy. que seria o "categorias"
     */
    @OneToMany(mappedBy = "categorias")
    private List<Atividade> atividades;
}
