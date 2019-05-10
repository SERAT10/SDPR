package cn.chentyit.mapper;

import cn.chentyit.pojo.Manager;
import org.apache.ibatis.annotations.Param;

public interface SDPRManagerMapper {

    /**
     * 判断登录的用户是否存在
     * @param managerName
     * @param managerPassword
     * @return
     */
    public Manager findManagerByNameAndPassword(
            @Param("managerName") String managerName,
            @Param("managerPassword") String managerPassword
    );
}
