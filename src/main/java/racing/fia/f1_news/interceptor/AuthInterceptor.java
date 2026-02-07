package racing.fia.f1_news.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Component
public class AuthInterceptor implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handle) throws Exception {

        logger.info("Interceptor: Catching the request from user");
        HttpSession session = request.getSession();

        if (session == null || session.getAttribute("loggedUser") == null) {
            logger.warn("Interceptor: User is not logged, redirecting request to login page");
            response.sendRedirect("/login");
            return false;
        }

        logger.info("Interceptor: User is logged in, continuing the request");
        return true;
    }
}
