package com.sprints.SpringBoot_Fundamentals.Implementations;

import com.sprints.SpringBoot_Fundamentals.Services.TimeService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service

@Primary
public class SystemTimeService implements TimeService {

    @Override
    public String getCurrentTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
}
