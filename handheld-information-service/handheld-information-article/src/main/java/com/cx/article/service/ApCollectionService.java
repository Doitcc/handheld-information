package com.cx.article.service;

import com.cx.model.article.dtos.CollectionBehaviorDto;
import com.cx.model.common.dtos.ResponseResult;

public interface ApCollectionService {

    /**
     * 收藏
     * @param dto
     * @return
     */
    public ResponseResult collection(CollectionBehaviorDto dto);
}
