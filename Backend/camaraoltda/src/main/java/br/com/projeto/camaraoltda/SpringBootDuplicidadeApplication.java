package br.com.projeto.camaraoltda;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.projeto.camaraoltda"})
@EnableJpaRepositories
public class SpringBootDuplicidadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDuplicidadeApplication.class, args);
	}

}


