package grandcircus.co.deliverablespringLab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String homePage() {
		return ("home");

	}

	@RequestMapping("/results")
	public String returnPage(@RequestParam(name="str",required= true)String str,@RequestParam(name="count",required= true) Integer count, Model model) {
  
		
		str = str.repeat(count);
		
		model.addAttribute("str", str);
		model.addAttribute("count", count);

		return ("/results");

	}

}
