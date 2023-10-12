package com.cx.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.model.common.dtos.ResponseResult;
import com.cx.model.user.dtos.LoginDto;
import com.cx.model.user.pojos.ApUser;

public interface ApUserService extends IService<ApUser> {
    /**
     * app端登录功能
     * @param dto
     * @return
     */
    public ResponseResult login(LoginDto dto);
}
