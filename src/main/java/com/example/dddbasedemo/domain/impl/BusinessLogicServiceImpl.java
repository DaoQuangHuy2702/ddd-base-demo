package com.example.dddbasedemo.domain.impl;

import com.example.dddbasedemo.domain.service.BusinessLogicService;
import org.springframework.stereotype.Service;

@Service
public class BusinessLogicServiceImpl implements BusinessLogicService {
    @Override
    public void performBusinessLogic() {
        System.out.println("This is complex logic of business");
    }
}
