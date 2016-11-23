package com.github.yuriy27;

import com.github.yuriy27.domain.Link;
import com.github.yuriy27.repository.LinkRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LinkerApplicationTests {

	@Autowired
	private LinkRepository linkRepository;

	@Test
	public void contextLoads() {

	}

	@Test
	public void testLinkRepository() {
		Link key1 = linkRepository.findByKey("key1");
		System.out.println(key1);
		Link l = new Link();
		l.setKey("key1");
		l.setUrl("value1");
		l.setId(1);
		System.out.println(l);
		assertEquals(l, key1);
	}

}
