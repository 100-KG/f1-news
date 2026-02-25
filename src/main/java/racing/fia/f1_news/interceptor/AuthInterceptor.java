package racing.fia.f1_news.interceptor;

import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import racing.fia.f1_news.model.User;
// import racing.fia.f1_news.util.JwtUtil;

@Component
public class AuthInterceptor implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // @Autowired
    // private JwtUtil jwt;

    // prehandle for session authorization

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

    // @Override
    // public boolean preHandle(
    // HttpServletRequest request,
    // HttpServletResponse response,
    // Object handler) throws Exception {
    // String authHeader = request.getHeader("Authorization");

    // if (authHeader != null && authHeader.startsWith("Bearer ")) {
    // String token = authHeader.substring(7);

    // if (jwt.isTokenValid(token)) {
    // // String username = jwt.getUsername(token);
    // // String role = jwt.getRole(token);
    // // request.setAttribute("username", username);
    // // request.setAttribute("role", role);

    // User authUser = jwt.getUser(token);
    // request.setAttribute("authUser", authUser);
    // logger.info("Interceptor: Valid token for user : {}",
    // authUser.getUsername());

    // return true;
    // }
    // }
    // logger.warn("Interceptor: Invalid/missing token");
    // response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
    // return false;
    // }
    // Basic Authorization

    // @Override
    // public boolean preHandle(HttpServletRequest request, HttpServletResponse
    // response, Object handler) {
    // String authHeader = request.getHeader("Authorization");
    // if (authHeader != null && authHeader.startsWith("Basic ")) {
    // // 1. Decode the header
    // String base64Credentials = authHeader.substring(6);
    // byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
    // String credentials = new String(decodedBytes); // format is
    // "username:password"

    // // 2. Split into parts
    // final String[] values = credentials.split(":", 2);
    // String username = values[0];
    // String password = values[1];
    // // 3. Check database (EVERY REQUEST)
    // User user = userService.checkLogin(username, password);
    // if (user != null) {
    // return true; // Authorized
    // }
    // }
    // // 4. If failed, trigger the browser popup
    // response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
    // response.setHeader("WWW-Authenticate", "Basic realm=\"F1 News Realm\"");
    // return false;
    // }
}
