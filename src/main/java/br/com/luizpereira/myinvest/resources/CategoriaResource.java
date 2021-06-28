package br.com.luizpereira.myinvest.resources;

import br.com.luizpereira.myinvest.domain.Categoria;
import br.com.luizpereira.myinvest.domain.Investimento;
import br.com.luizpereira.myinvest.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "http://localhost:3000")
public class CategoriaResource {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> listarTodas(){
        return categoriaRepository.findAll();
    }

    @GetMapping("/{codigo}")
    public Categoria buscarPeloCodigo(@PathVariable Long codigo){
        return categoriaRepository.findById(codigo).orElse(null);
    }

    @DeleteMapping("/{codigo}")
    public void remover(@PathVariable Long codigo){
        categoriaRepository.deleteById(codigo);
    }

    @PostMapping
    public Categoria criar(@RequestBody Categoria categoria){
        return categoriaRepository.save(categoria);
    }
}
