package com.lishuai.service.imple;

import com.lishuai.mapper.DeptMapper;
import com.lishuai.pojo.Dept;
import com.lishuai.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lishuai
 * @date 2022/7/27
 */
@Service
public class DeptServiceImple implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean DeptAdd(Dept dept) {
        return deptMapper.DeptAdd(dept);
    }

    @Override
    public Dept QueryById(long id) {
        return deptMapper.QueryById(id);
    }

    @Override
    public List<Dept> QueryAll() {
        return deptMapper.QueryAll();
    }
}
