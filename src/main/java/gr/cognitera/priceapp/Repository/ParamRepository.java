package gr.cognitera.priceapp.Repository;

import gr.cognitera.priceapp.model.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParamRepository extends JpaRepository<Param, Long> {
}