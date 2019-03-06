package com.saxo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * @author lotey
 * @date 2017/3/21 16:32
 * @desc 启动抓取服务器
 */
public class ServerStart {

    private static Logger logger = LogManager.getLogger(ServerStart.class);

    public static void main(String []args) {
        try {
            //启动spring容器
         //   logger.info("============================={}服务器启动开始=============================");
            new ClassPathXmlApplicationContext("spring-context.xml","spring-redis.xml","mq-consumer.xml").start();
            //启动netty服务器
           // WebSocketServer.serverStart();
        } catch (Exception e) {
            e.printStackTrace();
         //   logger.error("============================={}服务器启动出现异常,详细信息：{}=============================", CommonUtil.getCurrentDateTimeStr(),e);
        }
    }
}