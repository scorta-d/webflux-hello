package dz.webfluxhello.ctl;

import static reactor.core.publisher.Mono.just;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HelloCtl {
	@GetMapping(value = "/")
	public Mono<String> getIndex() {
		return just("Dz<hr/>");
	}

}
