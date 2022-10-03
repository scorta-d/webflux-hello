package dz.webfluxhello.db;

import org.springframework.data.annotation.Id;

public class Asdf {

	private Long mAsdf;
	private String mName;

	public Asdf() {

	}

	public Asdf(long asdf, String name) {
		mAsdf = asdf;
		mName = name;
	}

	@Id
	public Long getAsdf() {
		return mAsdf;
	}

	public void setAsdf(Long asdf) {
		mAsdf = asdf;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}
}
