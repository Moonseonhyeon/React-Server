package com.linda.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //이 컨트롤러가 데이터만 반환할거면 그냥 Controller아니고 RestController어노테이션. 그럼 어노테이션 ResponseBody 안적어도 됨.
	public class PostController {
	
	@Autowired
	private PostRepository repo;
	
	@CrossOrigin	//이 정책이 있음. 이 서버 
	@GetMapping("/post")
	public List<Post> getPosts() {
		return repo.findAll();
	}
}
