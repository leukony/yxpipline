package com.yunxi.common.pipeline.impl.stage;

import com.yunxi.common.pipeline.PipelineContext;

/**
 * Pipeline中通用的业务步骤
 * 
 * @author <a href="mailto:leukony@yeah.net">leukony</a>
 * @version $Id: NormalStage.java, v 0.1 2024年5月20日 上午10:21:10 leukony Exp $
 */
public abstract class NormalStage<T> extends AbstractStage<T> {

    /** 
     * @see com.yunxi.common.pipeline.impl.stage.AbstractStage#doInvoke(com.yunxi.common.pipeline.PipelineContext)
     */
    @Override
    void doInvoke(PipelineContext<T> context) throws Exception {
        process(context.getParam());
    }
    
    /**
     * 执行业务逻辑
     * 
     * @param param
     * @throws Exception
     */
    abstract void process(T param) throws Exception ;
}
