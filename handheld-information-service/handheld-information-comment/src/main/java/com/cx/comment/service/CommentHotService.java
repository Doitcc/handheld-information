package com.cx.comment.service;


import com.cx.comment.pojos.ApComment;

public interface CommentHotService {

    /**
     * 计算热点评论
     * @param entryId  文章id
     * @param apComment 当前评论对象
     */
    public void findHotComment(Long entryId, ApComment apComment);
}
