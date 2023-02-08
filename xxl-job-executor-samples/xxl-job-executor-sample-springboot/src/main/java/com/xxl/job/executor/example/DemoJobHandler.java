package com.xxl.job.executor.example;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

@Component
public class DemoJobHandler {

    @XxlJob("LiuHuanJobHandler")
    public void LiuHuanJobHandler() throws Exception {
        XxlJobHelper.log("XXL-JOB, Hello World by Liu Huan.");
    }
}
