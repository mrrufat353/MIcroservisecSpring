package Config;

import Dto.Response.UserResponse;
import Entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    @Bean
    public static ModelMapperConfig getMapper(User user, Class<UserResponse> userResponseClass){
        return new ModelMapperConfig();

    }

    public UserResponse map(User user, Class<UserResponse> userResponseClass) {
        return null;
    }
}