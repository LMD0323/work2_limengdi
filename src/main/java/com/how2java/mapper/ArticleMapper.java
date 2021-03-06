package com.how2java.mapper;

import com.how2java.model.Article;

import java.util.List;

public interface ArticleMapper {
    public List<Article> articlelist();//查询有评论的文章列表
    public List<Article> articlelistno();//查询没有评论的文章列表
    public Article searcharticle(int articleid);//根据编号查询文章详情
    public List<Article> searcharticlebyname(String articleauthor);//根据作者查询文章
    public List<Article> searcharticleuser(String articleauthor);//查询用户文章
    /*
    删除文章
    1.先删除评论
    2.删除文章
     */
    public int deletediscuss(int articleid);
    public int deletearticle(int articleid);
    //编辑文章
    public int updatearticle(Article article);
    //增加文章
    public int addarticles(Article article);
}
