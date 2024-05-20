package com.yunxi.common.pipeline;

/**
 * Pipeline
 * 
 * @author <a href="mailto:leukony@yeah.net">leukony</a>
 * @version $Id: Pipeline.java, v 0.1 2024年5月17日 下午3:22:39 leukony Exp $
 */
public interface Pipeline {

    /**
     * 创建一次新的执行
     * 
     * @return
     */
    PipelineInvocation newInvocation();

    /**
     * 创建一次新的执行，并将此次执行看作另一个执行的子过程
     * 
     * @param parentContext
     * @return
     */
    PipelineInvocation newInvocation(PipelineContext<?> parentContext);

}
