package com.pratham.springboot.Controllers;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("messages")
public class MessageProperties {
    
   private String greeting="Welcome ";

   public String getGreeting(){
    return greeting;
   }

public void setGreeting(String greeting) {
    this.greeting = greeting;
}


}