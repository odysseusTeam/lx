package aode.lx.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
*@author: 黄柏樟
*@date: 2015/6/19
*@explain:
*/
@Entity
@Table(name = "product_type")
public class ProductType {
    private Long id;
    /*类型名称*/
    private String name;
    /*类型简介*/
    private String introduction;
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
