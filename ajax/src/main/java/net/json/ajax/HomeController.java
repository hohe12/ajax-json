package net.json.ajax;

import java.util.ArrayList;
import java.util.List;

import net.json.ajax.DataStructure;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

	@RequestMapping(value="responsebody.json", method = RequestMethod.GET)
	public @ResponseBody List<DataStructure> responseBody() {
		List<DataStructure> list = new ArrayList<DataStructure>();
		
		DataStructure dataStructure = new DataStructure();
		dataStructure.setName("Array(배열)");
		dataStructure.setDescription("데이터를 연속적으로 크기를 변경시킬 수 없는 공간에 저장");
		list.add(dataStructure);
		dataStructure.setName("ArrayList(Vector)");
		dataStructure.setDescription("데이터를 물리적으로 연속해서 크기를 변경시킬 수 있는 공간에 저장");
		list.add(dataStructure);
		dataStructure.setName("LinkedList(연결리스트)");
		dataStructure.setDescription("데이터를 논리적으로 연속해서 크기를 변경시킬 수 있는 공간에 저장");
		list.add(dataStructure);
			
		System.out.println(list);
		return list;
	}
	
	@RequestMapping(value="jacksonview.json", method=RequestMethod.GET)
	public String jacksonview(Model model) {
		List<DataStructure> list = new ArrayList<DataStructure>();
		
		DataStructure dataStructure = new DataStructure();
		dataStructure.setName("Strack");
		dataStructure.setDescription("LIFO - Last Input First Out");
		list.add(dataStructure);
		dataStructure.setName("Queue");
		dataStructure.setDescription("FIFO - First Input First Out");
		list.add(dataStructure);
		dataStructure.setName("Deque");
		dataStructure.setDescription("Stack 과 Queue의 조합으로 양쪽으로 삽입과 삭제가 가능한 구조");
		list.add(dataStructure);
		
		model.addAttribute("list", list);
		
		return "json";
	}
	
	
	
}
