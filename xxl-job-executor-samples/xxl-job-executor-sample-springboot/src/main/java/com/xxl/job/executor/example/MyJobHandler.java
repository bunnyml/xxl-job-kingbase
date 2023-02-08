package com.xxl.job.executor.example;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.IJobHandler;

public class MyJobHandler extends IJobHandler {

    @Override
    public void execute() throws Exception {
        XxlJobHelper.log("XXL-JOB, Hello World by Liu Huan Da Pang.");
    }
}
