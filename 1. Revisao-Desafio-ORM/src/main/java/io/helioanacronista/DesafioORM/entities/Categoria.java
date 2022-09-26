package io.helioanacronista.DesafioORM.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;


    /*

    Quem fica de criar a tabela é o atividade por isso usamos o Mappedby
    dentro desse relacionamento

    e recebendo uma lista de atividadeds
     */
    @OneToMany(mappedBy = "categorias")
    private List<Atividade> atividades = new ArrayList<>();

}
