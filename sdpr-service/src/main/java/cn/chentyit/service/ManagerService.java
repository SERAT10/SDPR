package cn.chentyit.service;

import cn.chentyit.pojo.Manager;

public interface ManagerService {

    /**
     * 判断登录的用户是否存在
     * @param managerName
     * @param managerPassword
     * @return
     */
    public Manager findManagerByNameAndPassword(String managerName, String managerPassword);
}
