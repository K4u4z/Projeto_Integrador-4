package br.senac.Faculdade.services;

import br.senac.Faculdade.Entidade.Aluno;
import br.senac.Faculdade.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FaculdadeService {
@Autowired
    AlunoRepository alunoRepository;
public Aluno findById(Integer ra){
    Optional<Aluno> aluno = alunoRepository.findById(ra);
    return aluno.orElse(null);
}
}
