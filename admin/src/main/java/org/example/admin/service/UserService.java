package org.example.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.admin.dao.entity.UserDO;
import org.example.admin.dto.req.UserLoginReqDTO;
import org.example.admin.dto.req.UserRegisterReqDTO;
import org.example.admin.dto.req.UserUpdateReqDTO;
import org.example.admin.dto.resp.UserLoginRespDTO;
import org.example.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     */
    UserRespDTO getUserByUsername(String username);

    /**
     * 查询用户是否存在
     * @return 用户名存在返回 True 不存在返回 False
     */
    boolean hasUsername(String username);

    /**
     * 用户注册
     */
    void register(UserRegisterReqDTO requestParam);

    /**
     * 用户修改信息
     */
    void update(UserUpdateReqDTO requestParam);

    /**
     * 用户登录
     * @return 返回用户的token
     */
    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    /**
     * 检查用户名是否存在
     */
    Boolean checkLogin(String username, String token);

    /**
     * 用户退出登录
     */
    void logout(String username, String token);
}
