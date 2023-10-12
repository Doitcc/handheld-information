package com.cx.apis.article.fallback;

import com.cx.apis.article.IArticleClient;
import com.cx.model.article.dtos.ArticleDto;
import com.cx.model.common.dtos.ResponseResult;
import com.cx.model.common.enums.AppHttpCodeEnum;
import org.springframework.stereotype.Component;

@Component
public class IArticleClientFallback implements IArticleClient {
    @Override
    public ResponseResult saveArticle(ArticleDto dto) {
        return ResponseResult.errorResult(AppHttpCodeEnum.SERVER_ERROR,"获取数据失败");
    }
}
