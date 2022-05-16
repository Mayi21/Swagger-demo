package com.xaohii.swaggerdemo.controller;

import com.xaohii.swaggerdemo.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author xaohii
 * @Date 2022/5/16 21:45
 */
@RestController
@Api(tags = "用户操作")
public class UserController {
	// 模拟数据库
	public static ArrayList<User> users = new ArrayList<>();
	static {
		users.add(new User("xiaoming","123456"));
		users.add(new User("xiaoli","13579"));
	}
	@ApiOperation(value = "用来获取用户列表", notes = "用来获取所有的用户信息")
	@GetMapping("/users")
	public Object index(){
		HashMap<String, List<User>> map = new HashMap<>();
		map.put("users", users);
		return users;
	}
	@ApiOperation(value = "添加用户", notes = "添加用户信息")
	@PostMapping("/user")
	public Object add(User user){
		return users.add(user);
	}
	@ApiOperation(value = "删除用户")
	@DeleteMapping("/user/{id}")
	public void delete(@PathVariable int id){
		users.remove(id);
	}


}
