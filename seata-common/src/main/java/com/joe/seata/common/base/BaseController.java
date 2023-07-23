package com.joe.seata.common.base;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 * @ClassName BaseController
 * @Description:
 * @Author huangjian
 * @Date 2023/7/8
 **/
@Controller
public abstract class BaseController<T> {

    @Autowired
    public abstract IService<T> getService();
}
