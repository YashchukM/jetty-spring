package org.myas.jettyspring.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Mykhailo Yashchuk
 */
@Configuration
@Import({ MVCConfiguration.class, APIConfiguration.class })
public class RootConfiguration {

}
