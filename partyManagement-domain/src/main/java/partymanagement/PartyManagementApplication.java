package partymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.ApplicationContext;
import partymanagement.config.kafka.KafkaProcessor;

@SpringBootApplication
@EnableBinding(KafkaProcessor.class)
@EnableFeignClients
public class PartyManagementApplication {

    public static ApplicationContext applicationContext;

    public static void main(String[] args) {

        System.out.println("####################으아");
        System.out.println("####################으아");
        System.out.println("####################으아");
        System.out.println("####################으아");
        System.out.println("####################으아");
        applicationContext =
            SpringApplication.run(PartyManagementApplication.class, args);
    }
}
