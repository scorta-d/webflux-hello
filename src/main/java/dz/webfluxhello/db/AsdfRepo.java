package dz.webfluxhello.db;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import reactor.core.publisher.Flux;

public interface AsdfRepo extends ReactiveCrudRepository<Asdf, Long> {

	@Query("SELECT * FROM asdf")
	Flux<Asdf> getAll();

}