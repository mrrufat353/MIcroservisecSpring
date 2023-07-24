package Services;

import Config.ModelMapperConfig;
import Entity.User;
import Repository.UserRepository;
import Dto.Response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserServices {
    public final UserRepository userRepository;
    public final ModelMapperConfig modelMapper;

    public List<UserResponse> findAll(){
                return userRepository
                .findAll()
                .stream()
                .map(user -> modelMapper.map(user, UserResponse.class))
                .collect(Collectors.toList());

    }
    public UserResponse findById(long userId){
        User user = userRepository.findById(userId).orElseThrow(()-> new RuntimeException(
                String.format("User not found by id -%s",userId)
        ) );
        return modelMapper.map(user, UserResponse.class);
    }
}
