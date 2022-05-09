package io.haedoang.r2dbcsample.user.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.UUID;

import static lombok.AccessLevel.PROTECTED;

/**
 * author : haedoang
 * date : 2022/05/09
 * description :
 */
@Getter
@RequiredArgsConstructor
public class User {
    @Id
    private UUID id;

    private String name;

    private int age;


    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static User valueOf(String name, int age) {
        return new User(name, age);
    }
}
