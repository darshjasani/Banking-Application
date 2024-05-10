package net.javaguides.banking.repository;
import net.javaguides.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

// CRUD operations
public interface AccountRepository extends JpaRepository<Account, Long> {

}
