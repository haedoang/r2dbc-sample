package io.haedoang.r2dbcsample.user.domain;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

/**
 * author : haedoang
 * date : 2022/05/09
 * description :
 */
public interface UserRepository extends ReactiveCrudRepository<User, UUID> {
}
