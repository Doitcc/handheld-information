package com.cx.search.service;

import com.cx.model.common.dtos.ResponseResult;
import com.cx.model.search.dtos.UserSearchDto;

public interface ApAssociateWordsService {

    /**
     * 搜索联想词
     * @param dto
     * @return
     */
    public ResponseResult search(UserSearchDto dto);
}
