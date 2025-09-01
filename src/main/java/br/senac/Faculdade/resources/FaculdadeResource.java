package br.senac.Faculdade.resources;

import br.senac.Faculdade.Entidade.Aluno;
import br.senac.Faculdade.services.FaculdadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/faculdade")



public class FaculdadeResource {
    @Autowired
    private FaculdadeService faculdadeService;

    @GetMapping(value = "/{ra}")
    public ResponseEntity<Aluno> findByid(@PathVariable Integer ra){
      Aluno aluno = faculdadeService.findById(ra);
      return ResponseEntity.ok().body(aluno);
    }

    //Pesquisa todos alunos ativos
    @GetMapping(value = "/abertos")
    public ResponseEntity<List<Aluno>> listarAbertos(){
        List <Aluno> alunos =
                faculdadeService.listarTodosAbertos();
        return ResponseEntity.ok().body(alunos);
    }




}
