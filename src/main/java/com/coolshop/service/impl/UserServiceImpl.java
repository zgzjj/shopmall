package com.coolshop.service.impl;

import com.coolshop.common.ServerResponse;
import com.coolshop.dao.UserMapper;
import com.coolshop.pojo.User;
import com.coolshop.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iUserService")
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public ServerResponse<User> login(String username, String password) {
        int resultCount=userMapper.checkUsername(username);
        if(resultCount==0){
            return ServerResponse.createByErrorMessage("用户名不存在！");
        }
        //todo密码登录MD5
        User user =userMapper.selectLogin(username,password);
            if(username==null){
                return ServerResponse.createByErrorMessage("密码错误");
            }
            user.setPassword(StringUtils.EMPTY);
            return ServerResponse.createBySuccess("登录成功",user);

    }
}
