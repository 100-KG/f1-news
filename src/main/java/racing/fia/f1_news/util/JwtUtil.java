// package racing.fia.f1_news.util;

// import java.util.Date;

// import javax.crypto.SecretKey;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.stereotype.Component;
// import io.jsonwebtoken.Claims;
// import io.jsonwebtoken.Jwts;
// import io.jsonwebtoken.security.Keys;
// import racing.fia.f1_news.model.User;

// @Component
// public class JwtUtil {

//     private Logger logger = LoggerFactory.getLogger(this.getClass());

//     private final String SECRET = "23fs12dfasf2jWFGHfjk43513lsdifF";
//     private final long expiration_ms = 900000;

//     private SecretKey getSigningKey() {
//         return Keys.hmacShaKeyFor(SECRET.getBytes());
//     }

//     public String generateToken(String username, String role, User user) {
//         return Jwts.builder()
//                 .claim("authUser", user)
//                 .issuedAt(new Date())
//                 .expiration(new Date(System.currentTimeMillis() + expiration_ms))
//                 .signWith(getSigningKey())
//                 .compact();
//     }

//     public String getUsername(String token) {
//         String s = getClaims(token).getSubject();
//         logger.info("Getting from token username: {}", s);
//         return s;
//     }

//     public String getRole(String token) {
//         String s = getClaims(token).get("role", String.class);
//         logger.info("Getting from token role: {}", s);
//         return s;
//     }

//     public User getUser(String token){
//         User authUser = getClaims(token).get("user", User.class);
//         logger.info("Getting from token user: {}", authUser.getUsername());
//         return authUser;
//     }

//     public boolean isTokenValid(String token) {
//         try {
//             logger.info("Token validating...");
//             getClaims(token);
//             return true;
//         } catch (Exception e) {
//             logger.warn("Token is not valid");
//             return false;
//         }
//     }

//     private Claims getClaims(String token) {
//         return Jwts.parser()
//                 .verifyWith(getSigningKey())
//                 .build()
//                 .parseSignedClaims(token)
//                 .getPayload();
//     }
// }
