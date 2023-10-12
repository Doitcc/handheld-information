package com.cx.user.service;


import com.cx.model.common.dtos.ResponseResult;
import com.cx.model.user.dtos.UserRelationDto;



public interface ApUserRelationService {
    /**
     * 用户关注/取消关注
     * @param dto
     * @return
     */
    public ResponseResult follow(UserRelationDto dto);
}