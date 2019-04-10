package contacts;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")//直接从"localhost:8080/"就能访问
public class ContactController {

	@Autowired
	private ContactRepository repository;
	
	/**
	 * 查找全部的contact，并在页面显示
	 * @param model
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET)
	public String home(Map<String, Object> model) {
		List<Contact> contacts = repository.findAll();
		model.put("contacts", contacts);
		return "home";
	}
	
	/**
	 * 存储一个contact，并重定向到主页
	 * @param contact
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST)
	public String submit(Contact contact) {
		repository.save(contact);
		return "redirect:/";
	}
}
