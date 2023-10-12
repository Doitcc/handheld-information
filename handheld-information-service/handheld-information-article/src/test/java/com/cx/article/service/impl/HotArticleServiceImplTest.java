package com.cx.article.service.impl;

import com.cx.article.service.HotArticleService;
import com.cx.article.ArticleApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ArticleApplication.class)
@RunWith(SpringRunner.class)
public class HotArticleServiceImplTest {

    @Autowired
    private HotArticleService hotArticleService;

    @Test
    public void computeHotArticle() {
        hotArticleService.computeHotArticle();
    }
}