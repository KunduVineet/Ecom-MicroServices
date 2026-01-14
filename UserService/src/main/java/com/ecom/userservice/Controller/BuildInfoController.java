package com.ecom.userservice.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/build-info")
public class BuildInfoController {

    @Value("${build.id}")
    private String buildId;

    @Value("${build.version}")
    private String buildVersion;

    @Value("${build.name}")
    private String buildName;

    @Value("${build.type}")
    private String buildType;

    @GetMapping
    private String getBuildInfo(){
        return "Build Id"+ buildId + " , Build Version" + buildVersion + " , Build Name" + buildName + " , Build Type" + buildType;
    }

}
