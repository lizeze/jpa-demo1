package org.example;


import org.apache.servicecomb.foundation.common.utils.BeanUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@EnableJpaRepositories(value = "org.example.dao")
public class Main {
    public static void main(String[] args) {
        BeanUtils.init();
    }
}