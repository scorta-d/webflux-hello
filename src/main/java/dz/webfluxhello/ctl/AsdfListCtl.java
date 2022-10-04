package dz.webfluxhello.ctl;

import static java.lang.String.format;

import java.util.Iterator;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dz.webfluxhello.db.Asdf;
import dz.webfluxhello.db.AsdfRepo;
import reactor.core.publisher.Flux;

@RestController
public class AsdfListCtl {
	private AsdfRepo mRepo;

	@Autowired
	public AsdfListCtl(AsdfRepo repo) {
		mRepo = repo;
	}

	@GetMapping(value = "/list")
	public Flux<Asdf> getList() {
		return mRepo.getAll();
	}

	public static class Decorator implements Function<Asdf, String> {
		@Override
		public String apply(Asdf item) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			return format("<div>id = %d name = %s</div>", item.getAsdf(), item.getName());
		}
	}

	@GetMapping(value = "/liststr")
	public Flux<String> getListOfStrings() {
		Function<Asdf, String> decorator = new Decorator();
		return Flux.zip(
				mRepo.getAll().map(decorator), //
				mRepo.getAll().map(decorator),//
				(a,b)->a.concat(b) //
		);
	}

	@GetMapping(value = "/liststre", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<String> getListOfEvents() {
		return getListOfStrings();
	}

}
