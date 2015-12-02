/**
 * 
 */
package com.jgolubenko.ms.server.config.controllers

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class InfoController
{
  @Value('${spring.application.name}')
  private String appName = "";
  
  @RequestMapping("/info")
  public @ResponseBody Map<String, Object> info()
  {
    def resp = ["spring-application-name":appName];
    
    return resp;
  }
}
