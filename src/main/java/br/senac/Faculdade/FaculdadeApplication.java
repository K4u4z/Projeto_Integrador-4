package br.senac.Faculdade;

import br.senac.Faculdade.Entidade.Aluno;
import br.senac.Faculdade.repositories.AlunoRepository;
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

	public static void main(String[] args) {
		SpringApplication.run(FaculdadeApplication.class, args);
	}
@Override
	public void run(String... args) throws Exception{
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	Aluno aluno1 = new Aluno("Kauã Diodato",
			LocalDateTime.parse("01/01/2025 08:30", formato));
			alunoRepository.saveAll(Arrays.asList(aluno1));
}
}
