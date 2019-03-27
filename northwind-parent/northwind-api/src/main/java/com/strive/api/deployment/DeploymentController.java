package com.strive.api.deployment;

import com.strive.service.deployment.IDeploymentService;
import com.strive.service.deployment.impl.DeploymentServiceImpl;
import org.flowable.engine.IdentityService;
import org.flowable.engine.RepositoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: DeploymentController
 * @Auther: Karl.Zhang
 * @Date: 2019/3/23 16:22
 * @Version 1.0
 * @Description: 流程部署控制类
 */
@RestController
public class DeploymentController {
    private static Logger logger = LoggerFactory.getLogger(DeploymentController.class);

    private final IDeploymentService deploymentService;

    @Autowired
    public DeploymentController(IDeploymentService deploymentService) {
        this.deploymentService = deploymentService;
    }

    @PostMapping("/deployment/hello")
    public void hello() {
        System.out.println(deploymentService);
        logger.info("进入hello方法");
    }
}
