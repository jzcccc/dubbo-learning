package com.jzcccc.dubbo.consumer.controller;

import com.jzcccc.dubbo.consumer.service.TestRemoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class TestRemoteController {

  @Resource
  private TestRemoteService remoteService;

  @GetMapping("/echo")
  public String echo(String msg){
    return remoteService.remoteEcho(msg);
  }
  @GetMapping("/hello")
  public String sayHello(String name){
    return remoteService.remoteSayHello(name);
  }
}
