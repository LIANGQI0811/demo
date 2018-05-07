package com.kgeek.cn.demo.Repository;

import com.kgeek.cn.demo.Entity.AppEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppRepository extends JpaRepository<AppEntity,Integer> {
    List<AppEntity> findAllByAppName(String appName);

}
