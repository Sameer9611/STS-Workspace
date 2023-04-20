package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.google.common.base.Predicate;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication//this has 3 internal annotations
@EnableSwagger2
@EnableTransactionManagement
public class Spring2ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring2ExampleApplication.class, args);
	}
	@Bean//swagger copy/paste in BasePackage Class 
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2).select()
		.apis((Predicate<RequestHandler>)RequestHandlerSelectors.any())
		.paths((Predicate<String>)PathSelectors.any()).build();
	}

}
/*@springbootapplication:considers this class as base-package and applies to all other derived packages 
 * @SpringBootConfiguration:does the configuration,we had 3 files in spring MVC for configuration it is done by this
 *  @EnableAutoConfiguration:does it automatic 
 *  @ComponentScan:scans for all pojo classes from all derived packages which creates there beans
*/


/*annotations related to Swagger2
 * @EnableSwagger2
 *@EnableTransactionManagement
 */