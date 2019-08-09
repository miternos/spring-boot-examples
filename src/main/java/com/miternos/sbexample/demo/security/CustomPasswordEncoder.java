package com.miternos.sbexample.demo.security;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class CustomPasswordEncoder implements PasswordEncoder {



    @Override
    public String encode(CharSequence rawPassword) {

        if (rawPassword == null) {
            return null;
        }
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encryptedPassword) {
        if ( !encryptedPassword.isEmpty() ){
            String decodedPassword = encode(encryptedPassword);
            return rawPassword.equals(decodedPassword);
        } else {
            return false ;
        }
    }
}