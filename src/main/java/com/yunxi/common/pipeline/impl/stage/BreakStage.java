package com.yunxi.common.pipeline.impl.stage;

import com.yunxi.common.pipeline.PipelineContext;

/**
 * 用来中断当前pipeline
 * 
 * @author <a href="mailto:leukony@yeah.net">leukony</a>
 * @version $Id: BreakStage.java, v 0.1 2024年5月20日 上午10:06:11 leukony Exp $
 */
public abstract class BreakStage<T> extends AbstractStage<T> {

    /** 
     * @see com.yunxi.common.pipeline.impl.stage.AbstractStage#doInvoke(com.yunxi.common.pipeline.PipelineContext)
     */
    @Override
    void doInvoke(PipelineContext<T> context) throws Exception {
        if (isBreak(context.getParam())) {
            context.breakPipeline();
        }
    }

    /**
     * 是否中断Pipline
     * 
     * @param param
     * @return
     * @throws Exception
     */
    abstract boolean isBreak(T param) throws Exception;
}
