package cn.wnn.newbaba.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.wnn.newbaba.core.pojo.Test;
import cn.wnn.newbaba.core.service.TestService;

@Controller
public class TestController {
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="index")
	public String test(){
		
		Test test = new Test();
		test.setName("依依");
		test.setAge(24);
		testService.addTest(test);
		
		return "index";
	}

}
