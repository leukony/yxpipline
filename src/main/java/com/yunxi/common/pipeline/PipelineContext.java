package com.yunxi.common.pipeline;

/**
 * Pipeline上下文
 * 
 * @author <a href="mailto:leukony@yeah.net">leukony</a>
 * @version $Id: PipelineContext.java, v 0.1 2024年5月20日 上午9:18:28 leukony Exp $
 */
public class PipelineContext<T> {

    /** Pipeline参数 */
    private T param;
    
    /**
      * Getter method for property <tt>param</tt>.
      * 
      * @return property value of param
      */
    public T getParam() {
        return param;
    }
    
    /**
      * Setter method for property <tt>param</tt>.
      * 
      * @param param value to be assigned to property param
      */
    public void setParam(T param) {
        this.param = param;
    }

    /**
     * 中断Pipeline
     */
    public void breakPipeline() {
        
    }
}
