package com.sprints.SpringBoot_Fundamentals.Implementations;

import com.sprints.SpringBoot_Fundamentals.Services.TimeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("mockTimeService")
public class MockTimeService implements TimeService {


    @Override
    public String getCurrentTime() {
        return "2025-07-30T00:00:00";
    }
}
