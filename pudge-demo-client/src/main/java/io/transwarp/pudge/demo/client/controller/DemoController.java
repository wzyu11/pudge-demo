package io.transwarp.pudge.demo.client.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.transwarp.pudge.demo.client.controller.response.SimpleResp;
import io.transwarp.pudge.demo.entity.PudgeDemoException;
import io.transwarp.pudge.demo.entity.PudgeDemoParam;
import io.transwarp.pudge.demo.entity.PudgeDemoResult;
import io.transwarp.pudge.demo.iface.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * 'Inject' remote DemoService implementation
 *
 * 18-2-12 created by zado
 */
@Api(value = "DemoController", description = "Hook the meat")
@RestController
@RequestMapping("/api/v1/demos")
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @Resource
    private DemoService demoService;

    @ApiOperation(value = "DemoService.callVoid", notes = "Log a message on server")
    @RequestMapping(value = "/void", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public SimpleResp callVoid() {
        demoService.callVoid();
        return SimpleResp.success("Check server log for console output");
    }

    @ApiOperation(value = "DemoService.callParamAndReturn", notes = "Return a pang")
    @RequestMapping(value = "/ping", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public PudgeDemoResult callParamAndReturn(@RequestParam String ping) {
        PudgeDemoParam param = new PudgeDemoParam();
        param.setPing(ping);

        return demoService.callParamAndReturn(param);
    }

    @ApiOperation(value = "DemoService.callException", notes = "Output the exception")
    @RequestMapping(value = "/exception", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public SimpleResp callException() {
        try {
            demoService.callException();
            return SimpleResp.success("Should not happen(actual failed)");
        } catch (PudgeDemoException e) {
            LOGGER.error("Catch the PudgeDemoException", e);
            return SimpleResp.fail("Catch exception:" + e.getMessage());
        }
    }

}
