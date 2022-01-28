package org.aws.samples.greeting;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author MaheshR
 */
@RestController
public class GreetingController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello from AWS ProServe version3";
    }
    public static void main(String[] args) {

        InetAddress ip;
        String hostname;
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Your current IP address : " + ip);
            System.out.println("Your current Hostname : " + hostname);

        } catch (UnknownHostException e) {

            e.printStackTrace();
        }
}
