package br.senac.Faculdade.services;

import br.senac.Faculdade.Entidade.Aluno;
import br.senac.Faculdade.Entidade.Pessoa;
import br.senac.Faculdade.repositories.AlunoRepository;
import br.senac.Faculdade.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Service
public class DBService {
@Autowired
    private AlunoRepository alunoRepository;

@Autowired
    private PessoaRepository pessoaRepository;

@Bean
public String instaciarDB() {
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    Aluno aluno1 = new Aluno("Kauã Diodato",
            LocalDateTime.parse("01/08/2003 08:22", formato));
    alunoRepository.saveAll(Arrays.asList(aluno1));

    Aluno aluno2 = new Aluno("Kauã Diodato3",
            LocalDateTime.parse("01/08/2003 08:22", formato));
    alunoRepository.saveAll(Arrays.asList(aluno2));


    Pessoa pessoa1 = new Pessoa("Kauã Diodato3","kauadiodato@outlook.com","321222123",
            LocalDateTime.parse("01/08/2003 08:22", formato));
    pessoaRepository.saveAll(Arrays.asList(pessoa1));

        return "";
}}
