package sample.web.ui;

import java.util.concurrent.atomic.AtomicLong;
import java.net.InetAddress;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

@Controller
public class HealthCheckController {

    @Autowired
    Environment environment;

    @GetMapping("/health")
    @ResponseBody
    public String checkHealth() {
        RestTemplate restTemplate = new RestTemplate();
        String port = environment.getProperty("local.server.port");
        String host = "";

        try {
            host = InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            host = "localhost";
        }
        
        String result = restTemplate.getForObject("http://" +  host +":" + port + "/actuator/health", String.class);
        System.out.println("Host: " + host);
        System.out.println("Port: " + port);
    
        return result;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello() {
        String host = "";
        try {
            host = InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            host = "localhost";
        }

        return new String("Hello from " + host);
    }
}
