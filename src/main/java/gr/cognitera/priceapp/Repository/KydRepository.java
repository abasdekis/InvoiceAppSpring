package gr.cognitera.priceapp.Repository;

import gr.cognitera.priceapp.model.Kyd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KydRepository extends JpaRepository<Kyd, Long> {

}