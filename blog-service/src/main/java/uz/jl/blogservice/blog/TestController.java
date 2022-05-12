package uz.jl.blogservice.blog;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Value("${me}")
    private String me;


    @GetMapping("")
    public String getMe() {
        return me;
    }
}
