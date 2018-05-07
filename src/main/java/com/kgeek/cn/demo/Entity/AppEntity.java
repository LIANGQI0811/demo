package com.kgeek.cn.demo.Entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "app_t")
public class AppEntity {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "app_name")
    private String appName;
    @Column(name = "check")
    private int check;
    @Column(name = "redire_url")
    private String redireUrl;
    @Column(name = "link_man")
    private String linkMan;
    @Column(name = "phone")
    private String phone;
}
