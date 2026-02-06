package racing.fia.f1_news.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import racing.fia.f1_news.interceptor.AdminInterceptor;
import racing.fia.f1_news.interceptor.AuthInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    AuthInterceptor authIn;

    @Autowired
    AdminInterceptor adminIn;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authIn)
                .addPathPatterns("/**")
                .excludePathPatterns(
                        "/",
                        "/login",
                        "/auth/**",
                        "/css/**",
                        "/js/**",
                        "/images/**");

        registry.addInterceptor(adminIn)
                .addPathPatterns("/admin/**");
    }
}
