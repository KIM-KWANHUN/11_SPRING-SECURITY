package com.ohgiraffers.petharmony.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ohgiraffers.petharmony")
@MapperScan(basePackages = "com.ohgiraffers.petharmony", annotationClass = Mapper.class)
public class petConfig {
}
