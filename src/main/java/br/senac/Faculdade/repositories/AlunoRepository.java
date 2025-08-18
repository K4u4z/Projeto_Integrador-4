package br.senac.Faculdade.repositories;

import br.senac.Faculdade.Entidade.Aluno;
import br.senac.Faculdade.Entidade.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Integer> {

}
