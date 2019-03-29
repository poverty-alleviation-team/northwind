package com.strive.common.util;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

/**
 * @ClassName JwtTokenUtil
 * @auther Karl.Zhang
 * @Date 2019/3/29 13:58
 * @Version 1.0
 * @Description JwtToken工具类
 */
public class JwtTokenUtil {
    public static String SECRET = "Karl.Zhang";

    public static String createToken() {

        // 设置Header信息
        Map<String, Object> headerClaims = new HashMap<>();

        // 设置签名算法 默认HS256
        headerClaims.put("alg", "HS256");

        // 设置令牌类型
        headerClaims.put("typ", "JWT");

        // 设置过期时间
        Calendar nowTime = Calendar.getInstance();

        nowTime.add(Calendar.MINUTE, 1);

        Date   expiresDate = nowTime.getTime();
        String token       = JWT.create().withHeader(headerClaims)

        // 签发时间
        .withIssuedAt(new Date())

        // 签发人
        .withIssuer("SYSTEM")

        // 生效时间
        .withNotBefore(new Date())

        // 过期时间
        .withExpiresAt(expiresDate).sign(Algorithm.HMAC256(SECRET));

        return token;
    }

    public static void main(String[] args) {
        System.out.println(JwtTokenUtil.createToken());
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
