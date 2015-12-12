package com.jgolubenko.ms.server.config.controllers

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController

@RestController
class AlexController
{
  @RequestMapping("/alex")
  public @ResponseBody Map<String, Object> test()
  {
    Map<String, Object> resp = new HashMap<>();
    resp.put("This is key", new Date());
    
    return resp;
  }
  
  @RequestMapping("/alex2")
  public @ResponseBody Map<String, Object> alex2()
  {
    ["this is key" : new Date()]
  }
}