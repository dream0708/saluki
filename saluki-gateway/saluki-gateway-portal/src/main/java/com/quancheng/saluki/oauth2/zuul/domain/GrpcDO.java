/*
 * Copyright 2014-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.quancheng.saluki.oauth2.zuul.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * @author liushiming
 * @version GrpcDO.java, v 0.0.1 2018年1月4日 上午10:33:59 liushiming
 */
public class GrpcDO implements Serializable {

  private static final long serialVersionUID = 4715218350028915340L;

  private Long id;

  private String servicePackageName;

  private String serviceName;

  private String methodName;

  private String serviceGroup;

  private String serviceVersion;

  private byte[] protoContext;

  private byte[] protoReq;

  private byte[] protoRep;

  private Timestamp gmtCreate;

  private Timestamp gmtModified;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getServicePackageName() {
    return servicePackageName;
  }

  public void setServicePackageName(String servicePackageName) {
    this.servicePackageName = servicePackageName;
  }

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public String getMethodName() {
    return methodName;
  }

  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  public String getServiceGroup() {
    return serviceGroup;
  }

  public void setServiceGroup(String serviceGroup) {
    this.serviceGroup = serviceGroup;
  }

  public String getServiceVersion() {
    return serviceVersion;
  }

  public void setServiceVersion(String serviceVersion) {
    this.serviceVersion = serviceVersion;
  }

  public byte[] getProtoContext() {
    return protoContext;
  }

  public void setProtoContext(byte[] protoContext) {
    this.protoContext = protoContext;
  }

  public byte[] getProtoReq() {
    return protoReq;
  }

  public void setProtoReq(byte[] protoReq) {
    this.protoReq = protoReq;
  }

  public byte[] getProtoRep() {
    return protoRep;
  }

  public void setProtoRep(byte[] protoRep) {
    this.protoRep = protoRep;
  }

  public Timestamp getGmtCreate() {
    return gmtCreate;
  }

  public void setGmtCreate(Timestamp gmtCreate) {
    this.gmtCreate = gmtCreate;
  }

  public Timestamp getGmtModified() {
    return gmtModified;
  }

  public void setGmtModified(Timestamp gmtModified) {
    this.gmtModified = gmtModified;
  }

  @Override
  public String toString() {
    return "GrpcDO [id=" + id + ", servicePackageName=" + servicePackageName + ", serviceName="
        + serviceName + ", methodName=" + methodName + ", serviceGroup=" + serviceGroup
        + ", serviceVersion=" + serviceVersion + ", protoContext=" + Arrays.toString(protoContext)
        + ", protoReq=" + Arrays.toString(protoReq) + ", protoRep=" + Arrays.toString(protoRep)
        + ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified + "]";
  }


}