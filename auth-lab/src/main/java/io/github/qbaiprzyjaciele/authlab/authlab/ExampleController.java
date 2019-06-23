package io.github.qbaiprzyjaciele.authlab.authlab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/example")
public class ExampleController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

}
