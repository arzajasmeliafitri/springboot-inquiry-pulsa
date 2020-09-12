package id.project.spring.springbootinquirypulsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(
		scanBasePackages = {
				"id.project.spring"
		}
)

@ComponentScan(
		basePackages = {
				"id.project.spring.springbootinquirypulsa.controller",
				"id.project.spring.springbootinquirypulsa.model",
				"id.project.spring.springbootinquirypulsa.repository"
		}
)

@EnableJpaRepositories(
		basePackages = {
				"id.project.spring.springbootinquirypulsa.repository"
		}
)
@EntityScan(
		basePackages = {
				"id.project.spring.springbootinquirypulsa.model"
		}
)
@EnableSwagger2
public class SpringbootInquiryPulsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootInquiryPulsaApplication.class, args);
	}

}
