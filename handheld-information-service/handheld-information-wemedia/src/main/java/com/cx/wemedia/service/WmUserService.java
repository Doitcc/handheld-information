package com.cx.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.model.common.dtos.ResponseResult;
import com.cx.model.wemedia.dtos.WmLoginDto;
import com.cx.model.wemedia.pojos.WmUser;

public interface WmUserService extends IService<WmUser> {

    /**
     * 自媒体端登录
     * @param dto
     * @return
     */
    public ResponseResult login(WmLoginDto dto);

}