package jp.te4a.spring.boot.myapp1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Taro Desu!
 *
 */
@RestController
public class TaroController 
{
	@RequestMapping("/")
	public String index() {
		return "Hello, Spring Boot!";
	}
    @RequestMapping("/taro")
	public String taro() {
		return "taro desu!";
	}
}
