package jp.co.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.example.form.UserInfo;
import jp.co.example.service.UserService;
//import jp.co.example.service.InsertService;

@Controller
public class InsertController {

	@Autowired
	private UserInfo userInfo;
	@Autowired
	private UserService userService;

	@RequestMapping("/insert")
	public String form() {

		return "insert";
	}

	@RequestMapping(value = "/insertConfirm", method = RequestMethod.POST)
	public String form2(@RequestParam("name") String name,
			@RequestParam("tel") String tel,
			@RequestParam("pass") String pass,

			Model model) {

		if (name == null || name.isEmpty() || tel == null || tel.isEmpty() || pass == null || pass.isEmpty()) {
			return "insert";
		} else {

			userInfo.setUserName(name);
			userInfo.setTelephone(tel);
			userInfo.setPassword(pass);
			model.addAttribute("name", name);
			model.addAttribute("tel", tel);
			return "insertConfirm";
		}
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String form3(@RequestParam("rePass") String rePass,
			Model model) {
		if (rePass.equals(userInfo.getPassword())) {
			System.out.println(userInfo.getPassword());
			userService.register(userInfo.getUserName(), userInfo.getTelephone(), userInfo.getPassword());

			return "insertResult";
		} else {
			String name = userInfo.getUserName();
			String tel = userInfo.getTelephone();

			model.addAttribute("name", name);
			model.addAttribute("tel", tel);
			model.addAttribute("errmsg", "前画面で入力したパスワードと一致しません");

			return "insertConfirm";

		}
	}
}
