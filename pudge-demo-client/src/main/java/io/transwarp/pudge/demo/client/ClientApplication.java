package io.transwarp.pudge.demo.client;

import io.transwarp.pudge.spring.annotation.EnablePudgeClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 18-2-12 created by zado
 */
@SpringBootApplication
@EnablePudgeClient
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
