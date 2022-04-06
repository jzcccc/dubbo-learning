package com.jzcccc.dubbo.provider.service.impl;

import com.jzcccc.dubbo.consumer.api.EchoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@DubboService
public class EchoServiceImpl implements EchoService {
  private static final Logger logger = LoggerFactory.getLogger(EchoServiceImpl.class);

  @Override
  public String echo(String mag) {
    logger.info("echo receive :{}", mag);
    return "echo:--> "+mag;
  }
}
