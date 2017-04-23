package edu.infsci2560;

import edu.infsci2560.models.InfoArm;
// import edu.infsci2560.models.InfoArm.TicketType;
import edu.infsci2560.repositories.InfoArmRepository;
import edu.infsci2560.models.Orgnization;
import edu.infsci2560.models.Course;
import edu.infsci2560.repositories.CourseRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.net.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import edu.infsci2560.models.User;
import edu.infsci2560.models.User.Gender;
import edu.infsci2560.models.User.Role;
import edu.infsci2560.repositories.UserRepository;
import edu.infsci2560.services.UserServiceImp;

@SpringBootApplication
@ComponentScan({"edu.infsci2560"})
public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);

        InfoArmRepository repository = ctx.getBean(InfoArmRepository.class);

        // InfoArm infoArm1 = new InfoArm("install firewall", TicketType.Network_Security);
        InfoArm infoArm1 = new InfoArm("install firewall", "Network Security", "We recommend to install modern firwall");
        Orgnization orgnization = new Orgnization("IT", "2000", "Industry Professionals", infoArm1);
        infoArm1.setOrgnization(orgnization);
        repository.save(infoArm1);

        // InfoArm infoArm2 = new InfoArm("Batch the bugs", TicketType.Software_Security);
        InfoArm infoArm2 = new InfoArm("Batch the bugs", "Software Security", "Not yet");
        orgnization = new Orgnization("Military", "10000", "Goverment", infoArm2);
        infoArm2.setOrgnization(orgnization);
        repository.save(infoArm2);

        // InfoArm infoArm3 = new InfoArm("Update PLC", TicketType.Hardware_Security);
        InfoArm infoArm3 = new InfoArm("Update PLC", "Hardware Security", "Not yet");
        orgnization = new Orgnization("Hospital", "5000", "Health Insurance", infoArm3);
        infoArm3.setOrgnization(orgnization);
        repository.save(infoArm3);

        CourseRepository courseRepository = ctx.getBean(CourseRepository.class);
        try{
            URL link1 = new URL("https://www.youtube.com/embed/DoRoMLPDneo");
            // URL link1 = new URL("DoRoMLPDneo");
            // URL link2 = new URL("https://www.youtube.com/watch?v=vg9cNFPQFqM");
            URL link2 = new URL("https://www.youtube.com/embed/vg9cNFPQFqM");
            // String link1 ="https://www.youtube.com/embed/DoRoMLPDneo";
            // String link2 ="https://www.youtube.com/embed/vg9cNFPQFqM";
            courseRepository.save(new Course(1L, "Beginner Ethical Hacking", "Good Ethical Hacking", link1));
            courseRepository.save(new Course(2L, "Advance Ethical Hacking", "Really good start of ethical hacking", link2));
        }catch (MalformedURLException e) {
            e.printStackTrace();
        }

        UserRepository userRepository = ctx.getBean(UserRepository.class);
        UserServiceImp userService = ctx.getBean(UserServiceImp.class);

        User user1 = new User("Faris", "Pitt", Gender.Male, "user", "password");
        userService.saveUser(user1, new ArrayList<Role>(){
            {
                add(Role.ADMIN);
                add(Role.USER);
            }
        });

        User user2 = new User("FOA5", "Pitt", Gender.Female, "user1", "password1");
        userService.saveUser(user2, new ArrayList<Role>(){
            {
                add(Role.USER);
            }
        });

        log.info("\n ****************************************[Insertion of data is done] **********************************");
    }


//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }
//    @Bean
//    public CommandLineRunner databaseDemo(CustomerRepository repository) {
//        return (args) -> {
//            // save a couple of customers
//            repository.save(new Customer("Jack", "Bauer"));
//            repository.save(new Customer("Chloe", "O'Brian"));
//            repository.save(new Customer("Kim", "Bauer"));
//            repository.save(new Customer("David", "Palmer"));
//            repository.save(new Customer("Michelle", "Dessler"));
//            repository.save(new Customer("Billy", "Bean"));
//
//            // fetch all customers
//            log.info("[Database Demo] Customers found with findAll():");
//            log.info("[Database Demo] -------------------------------");
//            for (Customer customer : repository.findAll()) {
//                log.info("[Database Demo] " + customer.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//            Customer customer = repository.findOne(1L);
//            log.info("[Database Demo] Customer found with findOne(1L):");
//            log.info("[Database Demo] --------------------------------");
//            log.info("[Database Demo] " + customer.toString());
//
//            // fetch customers by last name
//            log.info("[Database Demo] Customer found with findByLastName('Bauer'):");
//            log.info("[Database Demo] --------------------------------------------");
//            for (Customer bauer : repository.findByLastName("Bauer")) {
//                log.info("[Database Demo] " + bauer.toString());
//            }
//        };
//    }
}