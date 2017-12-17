package com.toby.scaffolding.configure;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Toby
 */

@Configuration
@MapperScan("com.toby.scaffolding.mapper")
public class MapperScanConfigure {
}
