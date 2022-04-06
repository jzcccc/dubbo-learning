package com.jzcccc.dubbo.consumer.service;


import com.jzcccc.dubbo.consumer.api.EchoService;
import com.jzcccc.dubbo.consumer.api.SayHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class TestRemoteService {

  @DubboReference()
  private EchoService echoService;
  @DubboReference()
  private SayHelloService sayHelloService;

  public String remoteEcho(String msg) {
    return echoService.echo(msg);
  }

  public String remoteSayHello(String name) {
    return sayHelloService.sayHello(name);
  }

}
