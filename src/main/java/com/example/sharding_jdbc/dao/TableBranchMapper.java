package com.example.sharding_jdbc.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * 分表操作-接口
 */
public interface TableBranchMapper {

    @Insert(" insert into table_branch (status) values (#{status})")
    int insertTableBranch(@Param("status") String status);
}
