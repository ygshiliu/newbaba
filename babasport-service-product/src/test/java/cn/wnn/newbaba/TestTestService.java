package cn.wnn.newbaba;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.wnn.newbaba.core.service.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:application-context.xml"})
public class TestTestService {
	
	@Autowired
	private TestService testService;
	
	@Test
	public void testAddTest() {
		
		cn.wnn.newbaba.core.pojo.Test test = new cn.wnn.newbaba.core.pojo.Test();
		test.setName("妞妞");
		test.setAge(5);
		
		testService.addTest(test);
		
	}

}
