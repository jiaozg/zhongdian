package com.three.zhongdian.author.entity;

import lombok.Data;

/**
 * Created by 任梦杭 on 2017/08/10.
 */
@Data
public class Author {
    private Integer aid;
    private String authorNname;
    private String newPassword;
    private String repeatPassword;
    private String email;
    private String QQ;
    private String realName;
    private String sex;
    private String cardtype;
    private String cardId;
    private String tel_pre;
    private String province;
    private String address;
    private Integer productionCount;
    private Integer WordsCount;
    private Integer writeDays;
    private String grade;
    private Integer uid;
}
