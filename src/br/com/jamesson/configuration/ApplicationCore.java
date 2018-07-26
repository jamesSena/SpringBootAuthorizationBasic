package br.com.jamesson.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.com.jamesson.controllers.TestController;


@SpringBootApplication
@ComponentScan(basePackageClasses = TestController.class)
public class ApplicationCore extends SpringBootServletInitializer implements WebMvcConfigurer{
 
    public static void main(String[] args) {
        SpringApplication.run(ApplicationCore.class, args);
    }
 
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    	
        return application.sources(ApplicationCore.class);
    }
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
          registry.addInterceptor(new ApplicationManager()).addPathPatterns("/**");
    }
}
