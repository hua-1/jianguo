package huating;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("huating.biz.dao.*")
public class SpringBootApplicationStartUp {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationStartUp.class,args);
    }
}
