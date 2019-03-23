package com.strive.api.deployment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: DeploymentController
 * @Auther: Karl.Zhang
 * @Date: 2019/3/23 16:22
 * @Description: TODO
 */
@RestController
public class DeploymentController {
    private static Logger logger = LoggerFactory.getLogger(DeploymentController.class);

    @PostMapping("/deployment/hello")
    public void hello() {
        logger.info("进入hello方法");
    }
}
