package huating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class CommonSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonSpringBootApplication.class,args);
    }

}
