package com.strive.common.response;

/**
 * @ClassName TokenResponse
 * @auther Karl.Zhang
 * @Date 2019/3/27 22:35
 * @Version 1.0
 * @Description 登录成功后，返回token
 */
public class TokenResponse extends BaseResponse{

    /** token */
    private String token;

    public TokenResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
