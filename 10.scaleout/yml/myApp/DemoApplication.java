package com.example.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

        @RequestMapping("/myapp")
        public String myapp(){
            return "myApp : Hello World!";
        }

        @RequestMapping("/mytest")
        public String mytest(){
            String value = "";
            double dval = 0.001;
            for(int i = 0; i < 10000; i++)
            {
                dval = Math.sqrt(dval);
                value += "test"; 
            } 
            return String.format("%.0f", dval); //"myApp : Hello World! - test ";
        }
}
