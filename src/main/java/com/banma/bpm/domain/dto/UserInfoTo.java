package com.banma.bpm.domain.dto;


import com.banma.bpm.utils.Constants;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * <p>统一登录用户信息实体</p>
 *
 * @author rancho
 * @create 2017-09-19 16:55
 **/
public class UserInfoTo extends BaseTo {

    private String username;
    private String department;
    private String departmentId;
    private String userId;
    private String workId;
    private String gender;
    private String email;
    private String deptLevelId;
    private String deptLevelName;
    private String phoneNumber;
    private String tid;
    private String mtid;

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeptLevelId() {
        return deptLevelId;
    }

    public void setDeptLevelId(String deptLevelId) {
        this.deptLevelId = deptLevelId;
    }

    public String getDeptLevelName() {
        return deptLevelName;
    }

    public void setDeptLevelName(String deptLevelName) {
        this.deptLevelName = deptLevelName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getMtid() {
        return mtid;
    }

    public void setMtid(String mtid) {
        this.mtid = mtid;
    }

    public String getFullName() {
        return getUsername() + "-" + getWorkId();
    }


    public static UserInfoTo getCurrentUser() {


        UserInfoTo userInfoTo = null;

        if(RequestContextHolder.getRequestAttributes() == null){
            return null;
        }

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        HttpServletRequest request = attributes.getRequest();

        if(request == null){
            return null;
        }

        return userInfoTo;
    }

    public static UserInfoTo getCurrentUser(HttpServletRequest request) {
        UserInfoTo userInfoTo = (UserInfoTo) request.getSession().getAttribute(Constants.USER_INFO);
        return userInfoTo;
    }

}
