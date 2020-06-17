package io.swagger;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerSpringBootApplication.class, args);
	}

	//select method to get builder object
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("io.swagger"))
				.build()
				.apiInfo(apiDetails());
	}
	
	private ApiInfo apiDetails() {
		
		return new ApiInfo
				("Address Book API", "Sample API For Swagger UI", "1.0", "Free to use",
		new springfox.documentation.service.Contact("Dinesh","dineshchand.live", "a@a.com"),"Open Source", "GitHUB", Collections.emptyList());
				
				
	}
}
