package lab.concert.app;

import org.springframework.data.repository.CrudRepository;
import lab.concert.app.domain.Concert;

public interface ConcertRepository extends CrudRepository<Concert, Long> {
    Concert findByTitle(String title);
}