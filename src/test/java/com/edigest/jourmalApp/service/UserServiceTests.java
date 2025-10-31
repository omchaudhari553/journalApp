//package com.edigest.jourmalApp.service;
//
//import com.edigest.jourmalApp.entity.User;
//import com.edigest.jourmalApp.repository.UserRepository;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ArgumentsSource;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.jupiter.params.provider.ValueSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//public class UserServiceTests {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private UserService userService;
//
//
//    @ParameterizedTest
////    @ValueSource(strings = {
////            "ram",
////            "shyam",
////            "om"
////    })
//    @ArgumentsSource(UserArgumentsProvider.class)
//    public void testSaveNewUser(User user) {
////        assertEquals(4, 2 + 2);
////        assertNotNull(userRepository.findByUsername(name),"failed for: "+name);
//        assertTrue(userService.saveNewEntry(user));
//    }
//    @Disabled
//    @ParameterizedTest
//    @CsvSource({
//            "1,1,2",
//            "2,10,12",
//            "3,3,9"
//    })
//    public void test(int a,int b,int expected){
//        assertEquals(expected,a + b);
//    }
//}
