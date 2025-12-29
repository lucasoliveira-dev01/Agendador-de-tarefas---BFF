package com.javanauta.bff_agendador_tarefas.infrastructure.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class FeingConfig {

    @Bean
    public com.javanauta.bffagendadortarefas.infrastructure.client.config.FeignError feignError(){
        return new com.javanauta.bffagendadortarefas.infrastructure.client.config.FeignError();
    }
}
