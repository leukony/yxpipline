package com.yunxi.common.pipeline;

/**
 * 代表一次pipeline的执行
 * 
 * @author <a href="mailto:leukony@yeah.net">leukony</a>
 * @version $Id: PipelineInvocation.java, v 0.1 2024年5月20日 下午1:54:02 leukony Exp $
 */
public interface PipelineInvocation {

    /**
     * 执行pipeline。
     *
     */
    void invoke();
}
