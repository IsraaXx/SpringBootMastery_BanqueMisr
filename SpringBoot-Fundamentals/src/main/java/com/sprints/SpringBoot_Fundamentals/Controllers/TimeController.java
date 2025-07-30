package com.sprints.SpringBoot_Fundamentals.Controllers;

import com.sprints.SpringBoot_Fundamentals.Services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TimeController {

    @Autowired
    private TimeService timeService;

    @Autowired
    @Qualifier("mockTimeService")
    private TimeService mockTimeService;

    @GetMapping("/time")
    public ResponseEntity<String> getCurrentTime() {
        String CurrentTime = timeService.getCurrentTime();
        return ResponseEntity.ok(CurrentTime);
    }




}
