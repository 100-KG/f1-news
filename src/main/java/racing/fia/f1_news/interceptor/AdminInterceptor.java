package racing.fia.f1_news.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import racing.fia.f1_news.model.User;

@Component
public class AdminInterceptor implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
   
    // preHandle for session authorizarion
    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handle) throws Exception {

        logger.info("Interceptor: Checking if loggedUser is admin");
        HttpSession session = request.getSession();

        User admin = (User) session.getAttribute("loggedUser");

        if (admin == null) {
            logger.error("Interceptor: user is null");
            return false;
        } else if (admin.getRole().equals("admin")) {
            logger.info("Interceptor: user is admin");
            return true;
        }

        logger.warn("Interceptor: user is not admin");
        return false;
    }


    // @Override
    // public boolean preHandle(
    //     HttpServletRequest request,
    //     HttpServletResponse response,
    //     Object handle
    // ) throws Exception{
    //     // String role = (String) request.getAttribute("role");
    //     User admin = (User) request.getAttribute("authUser");
    //     if("admin".equalsIgnoreCase(admin.getRole())){
    //         logger.info("Inteceptor: user is admin");
    //         return true;
    //     }
    //     logger.info("Interceptor: user is not admin");
    //     return false;
    // }
}

