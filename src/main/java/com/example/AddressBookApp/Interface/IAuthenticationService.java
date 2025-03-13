package com.example.AddressBookApp.Interface;


import com.example.AddressBookApp.dto.AuthUserDTO;
import com.example.AddressBookApp.model.AuthUser;
public interface IAuthenticationService {
    AuthUser register(AuthUserDTO userDTO) throws Exception;

}