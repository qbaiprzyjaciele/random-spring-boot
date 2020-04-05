package io.github.qbaiprzyjaciele.websocketex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value=  "/test")
public class TestEndpoint {

    @GetMapping
    public String test() {
        return "test";
    }
}
