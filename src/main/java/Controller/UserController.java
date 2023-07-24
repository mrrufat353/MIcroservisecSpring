package Controller;

import Dto.Response.UserResponse;
import Services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserServices userService;

    @GetMapping
    public ResponseEntity<List<UserResponse>> findAll(){
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);

    }
    @GetMapping("/{userId}")
    public ResponseEntity<UserResponse> findById(@PathVariable Long userId){
        return new ResponseEntity<>(userService.findById(userId),HttpStatus.OK);
    }

}