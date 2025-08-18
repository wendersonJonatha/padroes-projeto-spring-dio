package padroes_projeto_spring.padroes_projeto_spring.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import padroes_projeto_spring.padroes_projeto_spring.model.Endereco;


public interface ViaCepService {
    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
