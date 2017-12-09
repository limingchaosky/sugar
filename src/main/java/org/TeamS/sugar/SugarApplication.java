package org.TeamS.sugar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.TeamS.sugar.mapper")
public class SugarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SugarApplication.class, args);
	}
}
