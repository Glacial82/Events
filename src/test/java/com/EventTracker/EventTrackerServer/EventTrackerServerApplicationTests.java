package com.EventTracker.EventTrackerServer;

import com.EventTracker.EventTrackerServer.SpringServer.model.User.User;
import com.EventTracker.EventTrackerServer.SpringServer.model.User.UserDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EventTrackerServerApplicationTests {

	@Autowired
	private UserDAO userDAO;
	@Test
	void addUserTest() {
		User user = new User();
		user.setUser_name("TestName");
		user.setUser_password("TestPassword");
		user.setUser_email_address("TestEmailAddress");
		user.setUser_DOB("1222-32-12");
		user.setUser_rep(4);
		userDAO.save(user);
	}

}
