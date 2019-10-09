package com.example.sharding_jdbc.controller;

import com.example.sharding_jdbc.service.TableBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api")
public class TableBranchController {

    @Autowired
    private TableBranchService tableBranchService;

    @RequestMapping("/insertTableBranch")
    public void insertTableBranch(@RequestBody(required=false) Map<String,Object> map){
        String status="default";
        status=(String) map.get("status");
        tableBranchService.insertTableBranch(status);
    }

}
