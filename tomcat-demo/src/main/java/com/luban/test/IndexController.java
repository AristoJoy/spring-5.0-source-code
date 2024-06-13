package com.luban.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

	@RequestMapping("/home.do")
	public String index() {
		return "xxx";
	}
//	@RequestMapping("/home.do")
//	public Map<String, String> index() {
//		Map<String, String> map = new HashMap<>();
//		map.put("xxx", "zh");
//		return map;
//	}
}
