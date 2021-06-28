package br.com.luizpereira.myinvest.repository;

import br.com.luizpereira.myinvest.domain.Investimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {
}
