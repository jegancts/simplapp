package com.example.gateway;

import java.net.URI;


        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;
        import java.net.URI;

@RestController
@RequestMapping("/gateway")
public class GatewayRestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/info1")
    public ResponseEntity<String> showOrderInfo() {
        return ResponseEntity.ok("FROM ORDER SERVICE, Port# is: " + port);

    }

    @GetMapping("/redirect1")
    public ResponseEntity<String> redirect() {
        System.out.println("geteway routing redirect");

        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("https://123214324324")).build();
    }


}
