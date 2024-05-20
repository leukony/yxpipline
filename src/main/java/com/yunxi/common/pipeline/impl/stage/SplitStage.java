package com.yunxi.common.pipeline.impl.stage;

import java.util.Collection;

import org.springframework.util.CollectionUtils;

import com.yunxi.common.pipeline.PipelineContext;

/**
 * 用来将一个大任务的Pipline拆分成多个子Pipline
 * 
 * @author <a href="mailto:leukony@yeah.net">leukony</a>
 * @version $Id: SplitStage.java, v 0.1 2024年5月20日 上午10:29:51 leukony Exp $
 */
public abstract class SplitStage<T, E> extends AbstractStage<T> {

    /** 
     * @see com.yunxi.common.pipeline.impl.stage.AbstractStage#doInvoke(com.yunxi.common.pipeline.PipelineContext)
     */
    @Override
    void doInvoke(PipelineContext<T> context) throws Exception {
        T param = context.getParam();
        // 上一批次实体
        Collection<E> preBatch = null;
        // 这一批次实体
        Collection<E> currentBatch = null;
        while (true) {
            // 获取本批次拆分实体
            currentBatch = batchQuery(param, preBatch);
            if (CollectionUtils.isEmpty(currentBatch)) {
                break;
            }
            // 拆分成子Pipline
            splitSubPipline(context, currentBatch);
            // 更新上一批次实体
            preBatch = currentBatch;
        }
    }

    /**
     * 
     * 
     * @param context
     * @param collection
     */
    void splitSubPipline(PipelineContext<T> context, Collection<E> collection) {
        for (E entity : collection) {
            // parentContext
            // subPipline
            // entity -> param
        }
    }

    /**
     * 分批查询拆分实体
     * 
     * @param param 参数
     * @param preCollection 上一批次查询到的实体
     * @return
     */
    abstract Collection<E> batchQuery(T param, Collection<E> preCollection);
    
    abstract Pipeline get
}
