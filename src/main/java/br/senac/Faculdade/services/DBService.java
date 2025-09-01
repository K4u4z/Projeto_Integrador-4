package br.senac.Faculdade.services;

import br.senac.Faculdade.Entidade.Aluno;
import br.senac.Faculdade.Entidade.Pessoa;
import br.senac.Faculdade.repositories.AlunoRepository;
import br.senac.Faculdade.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

@Service
public class DBService {
@Autowired
    private AlunoRepository alunoRepository;

@Autowired
    private PessoaRepository pessoaRepository;

@Bean
public String instaciarDB() throws ParseException {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    Aluno aluno1 = new Aluno("Kauã Diodato", formato.parse("01/02/2020"),true);
    Aluno aluno2 = new Aluno("Kauã Diodato2", formato.parse("01/02/2021"),true);
    alunoRepository.saveAll(Arrays.asList(aluno1,aluno2));




        return "";
}}
