package started.local.startedjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import started.local.startedjava.entity.authentication.InvalidatedToken;

public interface InvalidatedTokenRepository extends JpaRepository<InvalidatedToken, String> {
}
