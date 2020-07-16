package com.linda.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class PostRepository {
	
	public static List<Post> findAll(){
		List<Post> posts = new ArrayList<Post>();
		for (int i = 1; i < 11; i++) {
			Post p = new Post(1, "제목"+i, "내용"+i);
			posts.add(p);
		}
		return posts;
	}

}
