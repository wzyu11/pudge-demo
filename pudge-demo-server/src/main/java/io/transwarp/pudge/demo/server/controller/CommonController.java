package io.transwarp.pudge.demo.server.controller;

import io.transwarp.pudge.demo.iface.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * Provide common rest api still could inject DemoService
 *
 * 18-2-11 created by zado
 */
@RestController
@RequestMapping(value = "/api/v1/demos")
public class CommonController {

    @Resource
    private DemoService demoService;

    @RequestMapping(value = "/void", method = RequestMethod.GET)
    public void call() {
        demoService.callVoid();
    }
}
