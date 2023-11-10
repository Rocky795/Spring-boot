package com.pratham.springboot.Controllers;

import java.util.concurrent.CompletableFuture;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;



import com.pratham.springboot.Model.User;
import com.pratham.springboot.Service.LookupService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class LookupRunner implements CommandLineRunner{
    private static final Logger logger=LoggerFactory.getLogger(LookupRunner.class);
    
    @Autowired
    private LookupService lookupService;

    @Override
public void run(String... args) throws Exception {
    CompletableFuture<User> info1 = lookupService.findUser("Pytorch");
    CompletableFuture<User> info2 = lookupService.findUser("Tenserflow");
    CompletableFuture<User> info3 = lookupService.findUser("Scikit-learn");
    CompletableFuture<User> info4 = lookupService.findUser("spring-security");

    CompletableFuture.allOf(info1, info2, info3, info4).join();

    logger.info("--> " + info1.get());
    logger.info("--> " + info2.get());
    logger.info("--> " + info3.get());
    logger.info("--> " + info4.get());
}


}
