package pe.edu.cibertec.apirestventascibertec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ApiRestVentascibertecApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestVentascibertecApplication.class, args);
	}

}
