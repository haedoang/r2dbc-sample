package io.haedoang.r2dbcsample.user.application;

import io.haedoang.r2dbcsample.user.domain.User;
import io.haedoang.r2dbcsample.user.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * author : haedoang
 * date : 2022/05/09
 * description :
 */
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Flux<User> findAll() {
        return userRepository.findAll();
    }

    public Mono<User> save(User user) {
        return userRepository.save(user);
    }
}
