package net.json.ajax;

import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

import net.json.ajax.DataStructure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class JsonController {

	@RequestMapping(value="restcontroller.json", method=RequestMethod.GET)
	public List<DataStructure> json(){
		
		List<DataStructure> list = new ArrayList<DataStructure>();
		DataStructure dataStructure = new DataStructure();
		
		dataStructure.setName("Set");
		dataStructure.setDescription("데이터를 중복없이 저장해서 빠르게 검색하도록 하는 자료구조");
		list.add(dataStructure);
		
		dataStructure.setName("Map");
		dataStructure.setDescription("데이터를 키와 값 쌍으로 저장해서 키를 이용해서 데이터를 검색하는 자료구조");
		list.add(dataStructure);
		
		dataStructure.setName("Tree");
		dataStructure.setDescription("Linked List의 변형으로 데이터를 빠르게 검색하기 위해서 순서대로 배치");
		list.add(dataStructure);
		
		return list;
	}


}
