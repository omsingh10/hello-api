package human_1.hello_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApiOsvApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApiOsvApplication.class, args);
        System.out.println("🚀 Student Management API is running on http://localhost:8080");
    }
}
