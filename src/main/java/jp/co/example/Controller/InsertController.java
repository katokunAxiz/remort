package jp.co.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import jp.co.example.service.InsertService;

@Controller
public class InsertController {

	@Autowired
//	private UserInfo userInfo;
//	private InsertService insertService;




	@RequestMapping( "/insert")
	public String form() {


		return "insert";
	}

	@RequestMapping( value="/insert",method=RequestMethod.POST)
	public String form2(@RequestParam("name") String name,
						@RequestParam("tel") String tel,
						@RequestParam("pass") String pass,

						Model model) {


		model.addAttribute("name", name);
		model.addAttribute("tel",tel);
		model.addAttribute("pass","pass");
//		userInfo.setPassword(pass);

		return "insertConfirm";
	}

//
//	public String insert(@RequestParam("name") String data,
//			@RequestParam("tel") String tel,
//			@RequestParam("pass") String pass,
//			Model model) {
//
//	}



}
