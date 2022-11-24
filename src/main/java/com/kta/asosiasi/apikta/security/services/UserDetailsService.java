package com.kta.asosiasi.apikta.security.services;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.kta.asosiasi.apikta.security.services.UserDetailsService;

public interface UserDetailsService {
    UserDetailsService loadUserByUsername(String username) throws UsernameNotFoundException;
}
