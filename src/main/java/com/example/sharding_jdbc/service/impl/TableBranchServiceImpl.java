package com.example.sharding_jdbc.service.impl;

import com.example.sharding_jdbc.dao.TableBranchMapper;
import com.example.sharding_jdbc.service.TableBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableBranchServiceImpl implements TableBranchService {

    @Autowired
    private TableBranchMapper tableBranchMapper;

    @Override
    public void insertTableBranch(String status) {
        tableBranchMapper.insertTableBranch(status);
    }
}
