package com.miternos.sbexample.demo.security;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {

    private String authority;

    @Override
    public String getAuthority() {
        return authority;
    }

    public Role(String authority){
        this.authority = "ROLE_"+authority;
    }
}
