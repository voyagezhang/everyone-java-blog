/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zuoxiaolong.blog.cache.service;

import com.zuoxiaolong.blog.model.persistent.ArticleCategory;
import com.zuoxiaolong.blog.service.ArticleCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文章类别服务类
 *
 * @author goozi
 * @create 2016-05-17 19:21
 * @since 1.0.0
 */
@Service
public class ArticleCategoryServiceManager {

    @Autowired
    ArticleCategoryService articleCategoryService;

    /**
     * 查询所有的文章类别
     *
     * @return 所有的文章类别信息
     */
    public List<ArticleCategory> getAllArticleCategory() {
        return articleCategoryService.getAllArticleCategory();
    }

}
