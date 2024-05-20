package com.yunxi.common.pipeline.impl.stage;

import com.yunxi.common.pipeline.PipelineContext;

/**
 * 代表Pipeline中的步骤抽象基类
 * 
 * @author <a href="mailto:leukony@yeah.net">leukony</a>
 * @version $Id: AbstractStage.java, v 0.1 2024年5月20日 上午9:21:02 leukony Exp $
 */
public abstract class AbstractStage<T> implements Stage<T> {
    
    /** 
     * @see com.yunxi.common.pipeline.impl.stage.Stage#invoke(com.yunxi.common.pipeline.PipelineContext)
     */
    @Override
    public void invoke(PipelineContext<T> context) throws Exception {
        try {
            beforeInvoke(context.getParam());
            doInvoke(context);
        } finally {
            afterInvoke(context.getParam());
        }
    }
    
    /**
     * 步骤开始执行前逻辑
     * 
     * <p>
     * 仅用于本地化资源的初始化, 不可用于Pipeline流程的控制
     * </p>
     * 
     * @param param
     * @throws Exception
     */
    protected void beforeInvoke(T param) throws Exception {
        
    }
    
    /**
     * 执行
     * 
     * @param context
     * @throws Exception
     */
    abstract void doInvoke(PipelineContext<T> context) throws Exception;
    
    /**
     * 步骤执行结束后逻辑
     * 
     * <p>
     * 仅用于本地化资源的释放, 不可用于Pipeline流程的控制
     * </p>
     * 
     * @param param
     * @throws Exception
     */
    protected void afterInvoke(T param) throws Exception {
        
    }
}
