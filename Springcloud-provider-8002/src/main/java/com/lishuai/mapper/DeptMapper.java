package com.lishuai.mapper;

import com.lishuai.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lishuai
 * @date 2022/7/26
 */
@Mapper
@Repository
public interface DeptMapper {

    public boolean DeptAdd(Dept dept);

    public Dept QueryById(long id);

    public List<Dept> QueryAll();
}
