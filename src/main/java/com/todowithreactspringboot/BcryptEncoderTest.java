package com.todowithreactspringboot;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderTest {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        for (int i = 0; i < 10; i++){
            String encoderString = encoder.encode("P@ss!@#$123");
            System.out.println(encoderString);
        }

    }
}
