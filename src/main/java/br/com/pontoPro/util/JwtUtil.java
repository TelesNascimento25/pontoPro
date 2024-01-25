//package br.com.pontoPro.util;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jws;
//import io.jsonwebtoken.JwtBuilder;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//import java.security.Key;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//public class JwtUtil {
//    private static final String SECRET_KEY = "seuSegredo";
//    private static final long EXPIRATION_TIME = 864000000; 
//
//    private static Key getSigningKey() {
//        return io.jsonwebtoken.security.Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
//    }
//
//    public static String generateToken(String username) {
//        Map<String, Object> claims = new HashMap<>();
//        JwtBuilder builder = Jwts.builder();
//        return Jwts.builder()
//                .setClaims(claims)
//                .setSubject(username)
//                .setIssuedAt(new Date(System.currentTimeMillis()))
//                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
//                .signWith(getSigningKey(), SignatureAlgorithm.HS256)
//                .compact();
//    }
//
//    public static boolean validateToken(String token, String username) {
//        Jws<Claims> claimsJws = Jwts.parserBuilder()
//                .setSigningKey(getSigningKey())
//                .build()
//                .parseClaimsJws(token);
//
//        Claims claims = claimsJws.getBody();
//        String subject = claims.getSubject();
//        return subject.equals(username) && !isTokenExpired(token);
//    }
//
//    private static boolean isTokenExpired(String token) {
//        Date expirationDate = Jwts.parserBuilder()
//                .setSigningKey(getSigningKey())
//                .build()
//                .parseClaimsJws(token)
//                .getBody()
//                .getExpiration();
//
//        return expirationDate.before(new Date());
//    }
//}
