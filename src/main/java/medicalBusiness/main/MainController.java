package medicalBusiness.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/biodex4")
	public String biodex4() {
		return "biodex4";
	}
	@GetMapping("/balance")
	public String balance() {
		return "balance";
	}
}
