package br.com.luizpereira.myinvest.repository;

import br.com.luizpereira.myinvest.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
