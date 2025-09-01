package br.senac.Faculdade.repositories;

import br.senac.Faculdade.Entidade.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Integer> {


    @Query("Select alunos FROM Alunos alunos" +
            "WHERE alunos.ativos=true ORDER BY alunos.nome")


    List<Aluno> listarTodosAbertos();
}


