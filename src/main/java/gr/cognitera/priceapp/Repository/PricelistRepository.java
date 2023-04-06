package gr.cognitera.priceapp.Repository;

import gr.cognitera.priceapp.model.Pricelist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PricelistRepository extends JpaRepository<Pricelist, Long> {
//    @Query("SELECT new java.lang.Boolean(count(*) > 0) FROM Pricelist P WHERE P.kyd.id = ?1")
//    boolean codeExists(Long id);
}