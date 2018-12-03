package com.zqh.example.service.impl;

import com.zqh.example.mapper.TestMapper;
import com.zqh.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public String now() {
        return testMapper.now();
    }
}
