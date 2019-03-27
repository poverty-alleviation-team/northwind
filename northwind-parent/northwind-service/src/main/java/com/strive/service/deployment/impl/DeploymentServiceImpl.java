package com.strive.service.deployment.impl;

import com.strive.service.deployment.IDeploymentService;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.repository.Deployment;
import org.flowable.engine.repository.DeploymentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;
import java.util.zip.ZipInputStream;

/**
 * @ClassName DeploymentServiceImpl
 * @author Karl.Zhang
 * @Date 2018/12/9 23:05
 * @Description flowable流程部署方法实现类
 */
@Service
public class DeploymentServiceImpl implements IDeploymentService {
    private final RepositoryService repositoryService;

    @Autowired
    public DeploymentServiceImpl(RepositoryService repositoryService) {
        this.repositoryService = repositoryService;
    }

    @Override
    public String addInputStream(String category, String resourceName, InputStream inputStream) {
        DeploymentBuilder deploymentBuilder = repositoryService.createDeployment().category(category).addInputStream(resourceName, inputStream);
        Deployment deployment = deploymentBuilder.deploy();
        return deployment.getId();
    }

    @Override
    public String addString(String category, String resourceName, String text) {
        DeploymentBuilder deploymentBuilder = repositoryService.createDeployment().category(category).addString(resourceName, text);
        Deployment deployment = deploymentBuilder.deploy();
        return deployment.getId();
    }

    @Override
    public String addZipInputStream(String category, ZipInputStream zipInputStream) {
        DeploymentBuilder deploymentBuilder = repositoryService.createDeployment().category(category).addZipInputStream(zipInputStream);
        Deployment deployment = deploymentBuilder.deploy();
        return deployment.getId();
    }

    @Override
    public String addBpmnModel(String category, String resourceName, BpmnModel bpmnModel) {
        DeploymentBuilder deploymentBuilder = repositoryService.createDeployment().category(category).addBpmnModel(resourceName, bpmnModel);
        Deployment deployment =  deploymentBuilder.deploy();
        return deployment.getId();
    }
}
