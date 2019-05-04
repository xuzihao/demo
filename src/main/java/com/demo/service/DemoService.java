package com.demo.service;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.DemoUser;
import com.demo.enty.User;
@Service
public class DemoService {
	
	private static final Logger log = Logger.getLogger(DemoService.class);  
	

	@Autowired
	private DemoUser user;
	
	 public String  test(){
		 
//		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		 IUser userMapper = (IUser)context.getBean("userMapper");
//		 User user = userMapper.getUserByID(1);
		 
		 log.debug("--------------start--------------");
		 User user1= user.getUserByID(1);
		 log.debug(user1);
		 log.debug("--------------end--------------");
		return "test";
	 }

}
