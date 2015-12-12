/**
 * 
 */
package com.jgolubenko.ms.server.config

import groovy.util.logging.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

import com.jgolubenko.ms.server.config.MsServerConfigApplication;

/**
 * Spring Cloud Configuration Server 
 * @author golubenko_y
 */
@SpringBootApplication
@EnableConfigServer
@EnableAutoConfiguration
@Configuration
@Slf4j
class MsServerConfigApplication 
{
  static main(args) 
  {
    SpringApplication.run(MsServerConfigApplication.class, args)
    
    if(log?.infoEnabled)
    {
      log.info("Spring cloud configuration server initialized")
    }
  }
}
