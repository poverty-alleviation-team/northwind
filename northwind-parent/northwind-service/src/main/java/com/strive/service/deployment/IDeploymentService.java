package com.strive.service.deployment;

import org.flowable.bpmn.model.BpmnModel;

import java.io.InputStream;
import java.util.zip.ZipInputStream;

/**
 * @author Karl.Zhang
 * @ClassName: IDeploymentService
 * @Date: 2018/12/9 23:04
 * @Description: flyable流程部署方法接口类
 */
public interface IDeploymentService {
    /**
     * @Description 部署流程(addInputStream方式)
     * @Title: addInputStream
     * @param category 流程定义的分类
     * @param resourceName 资源名称(资源名称必须以.bpmn20.xml或者.bpmn作为后缀)
     * @param inputStream 流程文件输入流
     * @return: java.lang.String
     * @auther: Karl.Zhang
     * @date: 2018/12/11 21:23
     */
    String addInputStream(String category, String resourceName, InputStream inputStream);

    /**
     * @Description 部署流程(addString方式)
     * @Title: addString
     * @param category 流程定义的分类
     * @param resourceName 资源名称(资源名称必须以.bpmn20.xml或者.bpmn作为后缀)
     * @param text bpmn文件内容
     * @return: java.lang.String
     * @auther: Karl.Zhang
     * @date: 2018/12/11 21:32
     */
    String addString(String category, String resourceName, String text);

    /**
     * @Description 部署流程(zipInputStream方式)
     * @Title: addZipInputStream
     * @param category 流程定义的分类
     * @param zipInputStream 流程文件zip输入流
     * @return: java.lang.String
     * @auther: Karl.Zhang
     * @date: 2018/12/11 21:37
     */
    String addZipInputStream(String category, ZipInputStream zipInputStream);

    /**
     * @Description 部署流程(bpmnMpdel方式)
     * @Title: addBpmnModel
     * @param category 流程定义的分类
     * @param resourceName 资源名称(资源名称必须以.bpmn20.xml或者.bpmn作为后缀)
     * @param bpmnModel bpmnModel对象
     * @return: java.lang.String
     * @auther: Karl.Zhang
     * @date: 2019/1/18 22:37
     */
    String addBpmnModel(String category, String resourceName, BpmnModel bpmnModel);
}
