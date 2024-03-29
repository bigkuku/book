package com.bx.book.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
    //@EnableTransactionManagement
    @Configuration
    @MapperScan("com.bx.book.mapper*")
    public class MybatisPlusConfig {

        /**
         * 分页插件
         */
        @Bean
        public PaginationInterceptor paginationInterceptor() {
            PaginationInterceptor paginationInterceptor =new PaginationInterceptor();
            return paginationInterceptor;
        }
    }

