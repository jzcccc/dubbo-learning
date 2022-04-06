package com.jzcccc.dubbo.provider.service.impl;

import com.jzcccc.dubbo.consumer.api.SayHelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DubboService
public class SayHelloServiceImpl implements SayHelloService {
  private static final Logger logger = LoggerFactory.getLogger(SayHelloServiceImpl.class);

  @Override
  public String sayHello(String name) {
    logger.info("echo receive :{}", name);
    return "hello --- "+name;
  }
}
