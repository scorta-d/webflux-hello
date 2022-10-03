package dz.webfluxhello.ctl;

import org.springframework.beans.factory.annotation.Autowired;
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
}
