package io.transwarp.pudge.demo.server.service;

import io.transwarp.pudge.demo.entity.PudgeDemoException;
import io.transwarp.pudge.demo.entity.PudgeDemoParam;
import io.transwarp.pudge.demo.entity.PudgeDemoResult;
import io.transwarp.pudge.demo.iface.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 18-2-11 created by zado
 */
@Service
public class DemoServiceImpl implements DemoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public void callVoid() {
        // do nothing and just logger something on server
        LOGGER.info("I feel someone call me");
    }

    @Override
    public PudgeDemoResult callParamAndReturn(PudgeDemoParam param) {
        PudgeDemoResult result = null;

        if (param != null) {
            result = new PudgeDemoResult();
            result.setPang("return ping: " + param.getPing() + " with pang");
        }

        return result;
    }

    @Override
    public void callException() {
        throw new PudgeDemoException("FBI WARNING");
    }
}
