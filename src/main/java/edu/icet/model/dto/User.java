package edu.icet.model.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private  String UserId;
    private  String UserName;
    private String password;
    private  String role;
}
