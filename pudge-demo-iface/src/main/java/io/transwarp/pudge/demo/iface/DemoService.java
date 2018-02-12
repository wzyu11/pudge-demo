package io.transwarp.pudge.demo.iface;

import io.transwarp.pudge.core.annotation.PudgeMethod;
import io.transwarp.pudge.core.annotation.PudgeService;
import io.transwarp.pudge.demo.entity.PudgeDemoParam;
import io.transwarp.pudge.demo.entity.PudgeDemoResult;

/**
 * 18-2-11 created by zado
 */
@PudgeService(name = "pudge-demo-svc")
public interface DemoService {

    @PudgeMethod(name = "void")
    void callVoid();

    PudgeDemoResult callParamAndReturn(PudgeDemoParam param);

    void callException();
}
