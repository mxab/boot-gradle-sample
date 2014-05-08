package sample.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@ResponseBody
	@RequestMapping(value = "/stuff", method = RequestMethod.GET)
	public String index() {
		return "hello world";
		// Sample sample = new Sample();
		// return sample.foo();
	}

}