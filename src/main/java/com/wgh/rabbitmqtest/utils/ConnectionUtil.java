package com.wgh.rabbitmqtest.utils;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @author: tribe
 * @time: 2022/2/7 11:30
 */
public class ConnectionUtil {

    private static final String HOST_IP = "127.0.0.1";
    private static final int HOST_PORT = 5672;
    /**
     * 建立与RabbitMQ的连接
     *
     * @return
     * @throws Exception
     */
    public static Connection getConnection() throws Exception {
        //定义连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //设置服务地址
        factory.setHost(HOST_IP);
        //端口
        factory.setPort(HOST_PORT);
        //设置账号信息，用户名、密码、vhost
        factory.setVirtualHost("/wgh");//设置虚拟机，一个mq服务可以设置多个虚拟机，每个虚拟机就相当于一个独立的mq
        factory.setUsername("wgh");
        factory.setPassword("123456");
        // 通过工厂获取连接
        Connection connection = factory.newConnection();
        return connection;
    }
}
