package cn.ce.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.ce.feign.service.UserService;
import cn.ce.feign.vo.User;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.POST)
	public String updateUser(@PathVariable("id") int userId) {
		
		User user = userService.get(1);
		
		user.setAge(user.getAge() + 1); //又长大了一岁 :（

		//TODO 保存到数据库  代码省略
		
		return "OK";
	}
}
