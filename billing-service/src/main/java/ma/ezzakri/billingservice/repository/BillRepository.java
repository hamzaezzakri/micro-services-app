package ma.ezzakri.billingservice.repository;

import ma.ezzakri.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
