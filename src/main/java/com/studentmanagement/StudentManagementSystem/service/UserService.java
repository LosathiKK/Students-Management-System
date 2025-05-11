package com.studentmanagement.StudentManagementSystem.service;

import com.studentmanagement.StudentManagementSystem.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO createUser(UserDTO userDTO);

    UserDTO getUserById(Integer id);

    UserDTO getUserByUsername(String username);

    UserDTO getUserByEmail(String email);

    List<UserDTO> getAllUsers();

    List<UserDTO> getUsersByRole(String role);

    UserDTO updateUser(Integer id, UserDTO userDTO);

    void deleteUser(Integer id);

    void activateUser(Integer id);

    void deactivateUser(Integer id);

    boolean isUsernameExists(String username);

    boolean isEmailExists(String email);
}
