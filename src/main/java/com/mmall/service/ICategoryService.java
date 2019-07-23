package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.po.User;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface ICategoryService {

    ServerResponse addCategory(String categoryName,Integer parentId);

    ServerResponse setCategoryName(String categoryName, Integer categoryId);

    ServerResponse<List<Integer>> getChildParallelCategory(Integer categoryId);

    ServerResponse<List<Integer>> getChildDeepCategory(Integer categoryId);
}
