package Dto;

import lombok.Data;

@Data
public class RegisterDto {
    private String userName;
    private String password;
    private String repeatPassword;
    private String email;

}
