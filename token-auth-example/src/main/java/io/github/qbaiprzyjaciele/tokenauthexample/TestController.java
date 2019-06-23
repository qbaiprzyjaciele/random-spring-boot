package io.github.qbaiprzyjaciele.tokenauthexample;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/secured")
public class TestController {

    @GetMapping("/test")
    public String test() {
        TokenAuthentication tokenAuth = (TokenAuthentication) SecurityContextHolder.getContext().getAuthentication();
        System.out.println("TestController.test" + tokenAuth.getName());
        return "OK";
    }




}
