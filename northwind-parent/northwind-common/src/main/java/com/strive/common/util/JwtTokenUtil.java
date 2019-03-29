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
 * @Description JwtToken������
 */
public class JwtTokenUtil {
    public static String SECRET = "Karl.Zhang";

    public static String createToken() {

        // ����Header��Ϣ
        Map<String, Object> headerClaims = new HashMap<>();

        // ����ǩ���㷨 Ĭ��HS256
        headerClaims.put("alg", "HS256");

        // ������������
        headerClaims.put("typ", "JWT");

        // ���ù���ʱ��
        Calendar nowTime = Calendar.getInstance();

        nowTime.add(Calendar.MINUTE, 1);

        Date   expiresDate = nowTime.getTime();
        String token       = JWT.create().withHeader(headerClaims)

        // ǩ��ʱ��
        .withIssuedAt(new Date())

        // ǩ����
        .withIssuer("SYSTEM")

        // ��Чʱ��
        .withNotBefore(new Date())

        // ����ʱ��
        .withExpiresAt(expiresDate).sign(Algorithm.HMAC256(SECRET));

        return token;
    }

    public static void main(String[] args) {
        System.out.println(JwtTokenUtil.createToken());
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
