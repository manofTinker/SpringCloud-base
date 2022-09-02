package com.lishuai.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author lishuai
 * @date 2022/7/25
 */
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long dept_id;
    private String dept_name;
    private  String dept_source;

    public Dept(String dept_name) {
        this.dept_name = dept_name;
    }
}
