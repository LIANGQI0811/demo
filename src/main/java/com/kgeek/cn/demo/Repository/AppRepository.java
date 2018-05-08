package com.kgeek.cn.demo.Repository;

import com.kgeek.cn.demo.Entity.AppEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface AppRepository extends JpaRepository<AppEntity,Integer> {

    List<AppEntity> findAllByAppName(String appName);

    @Modifying
    @Transactional
    @Query(name = "update app_t set app_name=:name where id=:id")
    int updateName(@Param("name") String name, @Param("id") int id);
}
