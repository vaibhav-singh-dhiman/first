package Deployement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
			@GetMapping("/home")
			public String GET() {
				return 
						"this is its content";
			}
}
