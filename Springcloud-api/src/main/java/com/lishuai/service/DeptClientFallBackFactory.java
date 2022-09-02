package com.lishuai.service;

import com.lishuai.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lishuai
 * @date 2022/7/28
 * 服务降级
 */
@Component
public class DeptClientFallBackFactory implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean DeptAdd(Dept dept) {
                return false;
            }

            @Override
            public Dept QueryById(long id) {
                return new Dept().setDept_id(id)
                        .setDept_name("id->" + id + "对应的id已被降级")
                        .setDept_source("没有数据库");
            }

            @Override
            public List<Dept> QueryAll() {
                return null;
            }
        };
    }
}
