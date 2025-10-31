//package com.edigest.jourmalApp.service;
//
//import com.edigest.jourmalApp.entity.User;
//import com.edigest.jourmalApp.repository.UserRepository;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.ArgumentMatchers;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//
//import static org.mockito.Mockito.*;
//
//public class UserServiceImplTests {
//
//    @InjectMocks
//    private UserDetailsServiceImpl userDetailsService;
//
//    @Mock
//    private UserRepository userRepository;
//
//    @BeforeEach
//    void setUp(){
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    void loadUserByUsernameTests(){
//        when(userRepository.findByUsername(ArgumentMatchers.anyString())).thenReturn(User.builder().username("om").password("hsbdbdgtjab").roles(new ArrayList<>()).build());
//        UserDetails user = userDetailsService.loadUserByUsername("om");
//        Assertions.assertNotNull(user);
//    }
//}
