package com.coolshop.service;

import com.coolshop.common.ServerResponse;
import com.coolshop.pojo.User;

public interface IUserService {
   ServerResponse<User> login(String username, String password);
}
