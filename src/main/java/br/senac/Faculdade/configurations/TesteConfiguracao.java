package br.senac.Faculdade.configurations;

import br.senac.Faculdade.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("teste")
public class TesteConfiguracao {
    @Autowired
    DBService dbService;

    private boolean isntaciar() throws ParseException{
        this.dbService.instaciarDB();
        return true;
    }
}
