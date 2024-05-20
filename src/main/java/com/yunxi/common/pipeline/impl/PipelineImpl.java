package com.yunxi.common.pipeline.impl;

import com.alibaba.citrus.service.pipeline.PipelineInvocationHandle;
import com.yunxi.common.pipeline.Pipeline;
import com.yunxi.common.pipeline.PipelineContext;
import com.yunxi.common.pipeline.PipelineInvocation;
import com.yunxi.common.pipeline.impl.stage.Stage;

/**
 * 对<code>Pipeline</code>的实现
 * 
 * @author <a href="mailto:leukony@yeah.net">leukony</a>
 * @version $Id: PipelineImpl.java, v 0.1 2024年5月20日 下午1:57:39 leukony Exp $
 */
public class PipelineImpl implements Pipeline {

    /** 步骤列表 */
    private Stage<?>[] stages;
    
    /** 
     * @see com.yunxi.common.pipeline.Pipeline#newInvocation()
     */
    @Override
    public PipelineInvocation newInvocation() {
        return null;
    }

    /** 
     * @see com.yunxi.common.pipeline.Pipeline#newInvocation(com.yunxi.common.pipeline.PipelineContext)
     */
    @Override
    public PipelineInvocation newInvocation(PipelineContext<?> parentContext) {
        return null;
    }
    
    /**
      * Getter method for property <tt>stages</tt>.
      * 
      * @return property value of stages
      */
    public Stage<?>[] getStages() {
        return stages;
    }
    
    /**
      * Setter method for property <tt>stages</tt>.
      * 
      * @param stages value to be assigned to property stages
      */
    public void setStages(Stage<?>[] stages) {
        this.stages = stages;
    }
    
    
    private final class PipelineContextImpl implements PipelineContext, PipelineInvocation {
        
    }
}
