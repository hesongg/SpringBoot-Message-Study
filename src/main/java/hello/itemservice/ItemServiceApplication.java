package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	// 스프링 부트에서 자동으로 MessageSource 를 빈으로 등록해준다.
	/*
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new				ResourceBundleMessageSource();
		messageSource.setBasenames("messages", "errors");
		messageSource.setDefaultEncoding("utf-8");
		return messageSource;
	}
	*/

}
