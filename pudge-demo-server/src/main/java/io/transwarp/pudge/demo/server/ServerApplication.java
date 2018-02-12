package io.transwarp.pudge.demo.server;

import io.transwarp.pudge.spring.annotation.EnablePudgeServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 18-2-11 created by zado
 */
@SpringBootApplication
@EnablePudgeServer
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}
