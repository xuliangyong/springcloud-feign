package cn.ce.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ce.feign.vo.User;


@FeignClient("service-provider-user")
public interface UserService {
	
	@RequestMapping("/user/{userId}")
	public User get(@PathVariable("userId") Integer userId);
}
