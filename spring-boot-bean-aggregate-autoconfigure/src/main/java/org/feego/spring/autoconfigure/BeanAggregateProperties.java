package org.feego.spring.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author lvyahui (lvyahui8@gmail.com,lvyahui8@126.com)
 * @since 2019/5/31 23:50
 */
@ConfigurationProperties(prefix = "org.feego.spring")
@Data
public class BeanAggregateProperties {
    String baseBackpages;
}