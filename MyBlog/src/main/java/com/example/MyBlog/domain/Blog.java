package com.example.MyBlog.domain;

import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Document(indexName = "blog")
@XmlRootElement
public class Blog implements Serializable {

    @Id
    private String id;

    private String title;

    private String content;

    protected Blog() {  // JPA 的规范要求无参构造函数；设为 protected 防止直接使用
    }

    public Blog(String name, String content) {
        this.title = name;
        this.content = content;
    }

    public Blog(String id, String name, String content) {
        this.id = id;
        this.title = name;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%s, title='%s', content='%s']",
                id, title, content);
    }
}
