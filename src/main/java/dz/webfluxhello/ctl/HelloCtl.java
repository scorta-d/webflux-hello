package dz.webfluxhello.ctl;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import reactor.core.publisher.Mono;

@Component
public class HelloCtl {

	@GetMapping(path = "/")
	public Mono<String> getIndex() {
		return Mono.just("<hr>");
	}

}
