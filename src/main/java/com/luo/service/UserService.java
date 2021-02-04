package com.luo.service;

import java.util.List;
import com.luo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UserService extends IService<User>{


    int batchInsert(List<User> list);

    int insertOrUpdate(User record);

    int insertOrUpdateSelective(User recordsssssssssssssssssssssssssssss);

}
