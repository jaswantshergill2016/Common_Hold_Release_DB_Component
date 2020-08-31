package org.reactivestax;

import org.reactivestax.domain.HoldRelease;
import org.reactivestax.service.HoldReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.LocalDateTime;

@SpringBootApplication
@ComponentScan({"org.reactivestax", "com.reactivestax"})
@EntityScan("org.reactivestax.domain")
@EnableJpaRepositories("org.reactivestax.repository")
public class App implements CommandLineRunner
{
    @Autowired
    private HoldReleaseService holdReleaseService;

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
        /*
        System.out.println( "Hello World!" );
        */
        /*
        Integer transactionId = 1;
        String reason = "DIRECT_PASS";
        String nextStep = "REPROCESS_CANDIDATE";
        LocalDateTime timeProcessed = LocalDateTime.now();
        HoldRelease holdRelease = new HoldRelease(transactionId, reason, nextStep, "Test jsonMessage", timeProcessed);
        HoldReleaseService holdReleaseService = new HoldReleaseService();
        holdReleaseService.saveHoldReleaseInfo(holdRelease);
        System.out.println("SUCCESS");
        */
    }

    @Override
    public void run(String... args) throws Exception {
        //holdReleaseService.getHoldReleaseRepository();
        /*
        Integer transactionId = 1;
        String reason = "DIRECT_PASS";
        String nextStep = "REPROCESS_CANDIDATE";
        LocalDateTime timeProcessed = LocalDateTime.now();
        HoldRelease holdRelease = new HoldRelease(transactionId, reason, nextStep, "Test jsonMessage", timeProcessed);
        holdReleaseService.saveHoldReleaseInfo(holdRelease);
        System.out.println("SUCCESS");
        */
    }
}
