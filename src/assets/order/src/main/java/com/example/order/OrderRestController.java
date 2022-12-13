package com.example.order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.URI;

@RestController
@RequestMapping("/order")
public class OrderRestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/info")
    public ResponseEntity<String> showOrderInfo() {
        return ResponseEntity.ok("FROM ORDER SERVICE, Port# is: " + port);
    }

    @GetMapping("/redirect")
    public ResponseEntity<Void> redirect() {

        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("https://123214324324")).build();
    }


}