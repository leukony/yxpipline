package com.yunxi.common.pipeline.impl.stage;

import com.yunxi.common.pipeline.PipelineContext;

/**
 * 代表Pipeline中的步骤
 * 
 * @author <a href="mailto:leukony@yeah.net">leukony</a>
 * @version $Id: Stage.java, v 0.1 2024年5月17日 下午3:26:04 leukony Exp $
 */
public interface Stage<T> {
    
    /**
     * 执行步骤
     * 
     * @param context
     * @throws Exception
     */
    void invoke(PipelineContext<T> context) throws Exception;
}
