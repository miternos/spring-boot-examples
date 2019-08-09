package com.miternos.sbexample.demo.cassandra;

import com.miternos.sbexample.demo.security.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicReference;


@Service
public class CassandraUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        String password = null;
        String role = null;

        UserEntity user = userRepository.findByUser(userName).get(0) ;

        role = user.getRole();
        password = user.getPassword();

        /*
        userRepository.findById(userName).ifPresent(user -> {
            password.set(user.getPassword());
            role.set(user.getRole());

        });
        */

        return new UserDetailsImpl(userName,password,role);
    }

}
