package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.po.User;

import javax.servlet.http.HttpSession;

public interface IUserService {
    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str,String type);

    ServerResponse<String> forgetGetQuestion(String username);

    ServerResponse<String> forgetCheckAnswer(String username,String question,String answer);

    ServerResponse<String> forgetResetPassword(String username,String passwordNew,String forgetToken);

    ServerResponse<String> resetPassword(User user, String passwordOld, String passwordNew);

    ServerResponse<User> updateInformation(User user);

    ServerResponse<User> getInformation(Integer userId);

    ServerResponse checkAdminRole(User user);
}
