package com.springboot.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    public List<SoftwareEngineer> getEngineers(){
        return List.of(
                new SoftwareEngineer(1,"SreeRaj","js,node,react"),
                new SoftwareEngineer(2,"ReshuSree",",java,C#,js,node,react")
        );
    };

}
