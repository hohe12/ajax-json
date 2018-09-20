package net.json.ajax;

import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	@RequestMapping(value="tools.json", method = RequestMethod.GET)
	public List<Map<String, Object>> tools(){
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
			
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "Programming Language - Java");
		map.put("description", "사람의 생각을 컴퓨터에서 실행하기 위한 도구");
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("name", "IDE - Eclipse");
		map.put("description", "소스 코드를 작성하고 컴파일하고 실행할 수 있는 도구");
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("name", "Web Server - Apache Web Server");
		map.put("description", "URL을 가지고 요청하면 필요한 자원을 찾아주는 도구");
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("name", "WAS - tomcat");
		map.put("description", "Web Server가 URL을 가지고 요청하면 필요한 객체를 가지고 작업을 수행한 후 결과를 전달해주는 도구");
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("name", "Database - Oracle");
		map.put("description", "데이터를 반영구적으로 저장하고 편리하게 관리해주는 도구");
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("name", "Framework - Spring, MyBatis, Hibernate");
		map.put("description", "프로그램 개발을 빠르고 쉽게 해주는 도구");
		list.add(map);
		
        return list;
		
	}

}
