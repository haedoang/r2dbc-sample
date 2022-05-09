package io.haedoang.r2dbcsample.user.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * author : haedoang
 * date : 2022/05/09
 * description :
 */
@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @DisplayName("사용자를 생성한다")
    public void create() {
        // given
        final User user = User.valueOf("haedoang", 34);

        // when
        final User actual = userRepository.save(user).block();

        // then
        assertThat(actual.getId()).isNotNull();
        assertThat(actual.getName()).isEqualTo("haedoang");
        assertThat(actual.getAge()).isEqualTo(34);
    }

    @Test
    @DisplayName("사용자를 조회한다")
    public void search() {
        // when
        final List<User> users = userRepository.findAll().collectList().block();

        // then
        assertThat(users).hasSize(8);
    }
}