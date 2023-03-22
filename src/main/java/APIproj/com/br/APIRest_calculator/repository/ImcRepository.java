package APIproj.com.br.APIRest_calculator.repository;

import APIproj.com.br.APIRest_calculator.model.Imc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImcRepository extends JpaRepository <Imc, Integer>{



}
