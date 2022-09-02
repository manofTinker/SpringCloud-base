package com.lishuai.service;

import com.lishuai.pojo.Dept;

import java.util.List;

/**
 * @author lishuai
 * @date 2022/7/26
 */
public interface DeptService {

    public boolean DeptAdd(Dept dept);

    public Dept QueryById(long id);

    public List<Dept> QueryAll();

}
