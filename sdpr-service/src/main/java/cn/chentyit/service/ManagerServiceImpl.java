package cn.chentyit.service;

import cn.chentyit.mapper.SDPRManagerMapper;
import cn.chentyit.pojo.Manager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Resource
    private SDPRManagerMapper sdprManagerMapper;

    @Override
    public Manager findManagerByNameAndPassword(String managerName, String managerPassword) {
        return sdprManagerMapper.findManagerByNameAndPassword(managerName, managerPassword);
    }
}
