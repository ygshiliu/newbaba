package cn.wnn.newbaba.core.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wnn.newbaba.core.dao.TestDao;
import cn.wnn.newbaba.core.pojo.Test;
import cn.wnn.newbaba.core.service.TestService;

@Service("testService")
@Transactional
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDao testDao;

	@Override
	public int addTest(Test test) {
		return testDao.insertTest(test);
	}

}
