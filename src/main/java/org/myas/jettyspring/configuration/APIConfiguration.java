package org.myas.jettyspring.configuration;

import org.myas.jettyspring.controllers.IncomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mykhailo Yashchuk
 */
@Configuration
public class APIConfiguration {
    @Bean
    public IncomeController incomeController() {
        return new IncomeController();
    }
}
