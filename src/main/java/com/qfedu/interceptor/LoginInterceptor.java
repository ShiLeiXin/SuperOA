package com.qfedu.interceptor;

import com.qfedu.entity.User;
import com.qfedu.utils.StrUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);

        User user = (User) request.getSession().getAttribute(StrUtils.LOGIN_USER);

        if (user == null) {

            String header = request.getHeader("X-Requested-With");
            if (header != null && header.equals("XMLHttpRequest")) {
                response.getWriter().write("{\"code\":0,\"data\":\"未登录\"}");
            } else {
                response.sendRedirect(request.getContextPath() + "/after/user/login.html");
            }
            return false;
        } else {
            return true;
        }
    }
}
