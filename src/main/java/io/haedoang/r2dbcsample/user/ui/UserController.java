package io.haedoang.r2dbcsample.user.ui;

import io.haedoang.r2dbcsample.user.application.UserService;
import io.haedoang.r2dbcsample.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * author : haedoang
 * date : 2022/05/09
 * description :
 */
@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @GetMapping
    public Flux<User> list() {
        return userService.findAll();
    }

    @PostMapping
    public Mono<User> save(@RequestBody User user) {
        return userService.save(user);
    }

}
