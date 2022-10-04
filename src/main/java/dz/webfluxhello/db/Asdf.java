package dz.webfluxhello.db;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

public class Asdf {
	@Id
	@Column ("asdf")
	private Long mAsdf;
	@Column ("name")
	private String mName;

	public Asdf() {

	}

	public Asdf(long asdf, String name) {
		mAsdf = asdf;
		mName = name;
	}

	
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
