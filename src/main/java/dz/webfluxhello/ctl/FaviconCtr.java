package dz.webfluxhello.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FaviconCtr {
	@GetMapping(value = "/favicon.ico")
	@ResponseBody
	public void getNoFavicon() {
		System.out.println("favicon");
	}

}
