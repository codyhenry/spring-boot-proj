package com.cody.advisor.calendar;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.cody.advisor.calendar.config.ContentCalendarProperties;
import com.cody.advisor.calendar.model.Content;
import com.cody.advisor.calendar.model.Status;
import com.cody.advisor.calendar.model.Type;
import com.cody.advisor.calendar.repository.ContentRepository;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	// Can add data to database here
	// @Bean
	// CommandLineRunner clr(ContentRepository repository) {
	// // return args -> System.out.println("Hello after everything");
	// // insert data into db
	// return args -> {
	// Content content = new Content(
	// null,
	// "Hello jdbc data",
	// "Now using jdbc data",
	// Status.IDEA,
	// Type.VIDEO,
	// LocalDateTime.now(),
	// null,
	// "");
	// repository.save(content);
	// };
	// }

}
