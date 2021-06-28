package br.com.luizpereira.myinvest.resources;

import br.com.luizpereira.myinvest.domain.Investimento;
import br.com.luizpereira.myinvest.repository.InvestimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investimentos")
@CrossOrigin(origins = "http://localhost:3000")
public class InvestimentoResource {

    @Autowired
    private InvestimentoRepository investimentoRepository;

    @GetMapping
    public List<Investimento> listarTodos(){
        return investimentoRepository.findAll();
    }

    @GetMapping("/{codigo}")
    public Investimento buscarPeloCodigo(@PathVariable Long codigo){
        return investimentoRepository.findById(codigo).orElse(null);
    }

    @DeleteMapping("/{codigo}")
    public void remover(@PathVariable Long codigo){
        investimentoRepository.deleteById(codigo);
    }

    @PostMapping
    public Investimento cadastrar(@RequestBody Investimento investimento){
        return investimentoRepository.save(investimento);
    }
}
