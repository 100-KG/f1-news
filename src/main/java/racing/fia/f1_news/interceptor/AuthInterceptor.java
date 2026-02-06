package racing.fia.f1_news.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Component
public class AuthInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handle) throws Exception {

        HttpSession session = request.getSession();

        if (session == null || session.getAttribute("loggedUser") == null) {
            response.sendRedirect("/login");
            return false;
        }

        return true;
    }
}
