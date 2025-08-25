package br.senac.Faculdade;


import br.senac.Faculdade.repositories.AlunoRepository;
import br.senac.Faculdade.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@SpringBootApplication

public class FaculdadeApplication implements CommandLineRunner {
@Autowired
private AlunoRepository alunoRepository;

private PessoaRepository pessoaRepository;

	public static void main(String[] args) {
		SpringApplication.run(FaculdadeApplication.class, args);
	}
@Override
	public void run(String... args) throws Exception{

}
}
