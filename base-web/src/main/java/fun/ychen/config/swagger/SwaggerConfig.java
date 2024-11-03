package fun.ychen.config.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("ychen 的 API")
                        .contact(new Contact().name("ychen").email("2317413623@qq.com"))
                        .version("1.0.0")
                        .description("ychen 的 API 接口文档")
                        .license(new License().name("Apache 2.0").url("http://doc.xiaominfo.com")));
    }
}
