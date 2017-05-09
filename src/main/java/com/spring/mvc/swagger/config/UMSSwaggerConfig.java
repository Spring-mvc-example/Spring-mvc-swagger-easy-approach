package com.spring.mvc.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;

@Configuration
@EnableSwagger2
@ComponentScan("com.spring.mvc.swagger.*")
public class UMSSwaggerConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}

	private Predicate<String> postPaths() {
		return or(regex("/service/.*"), regex("/service.*"));
	}

	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("USER CURD API")
				.description("Sample API Generateed Using SWAGGER")
				.termsOfServiceUrl("www.Java_Gyan_Mantra.com")
				.contact("Basant Kumar Hota")
				.license("java.gyan.mantra@gmail.com")
				.licenseUrl("https://www.facebook.com/groups/919464521471923/")
				.version("1.0").build();
	}

}