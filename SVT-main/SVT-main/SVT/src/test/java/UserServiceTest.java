package MyPackage;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;


public class UserServiceTest {


    @Mock
    private UserRepository userRepository;


    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        userService = new UserService(userRepository);
    }


    @Test
    void testFindUserById() {

        User mockUser = new User(1, "Safa");


        when(userRepository.findUserById(1)).thenReturn(mockUser);
        User user = userService.findUserById(1);


        assertEquals("Safa", user.getName());
        verify(userRepository, times(1)).findUserById(1);
    }
}
