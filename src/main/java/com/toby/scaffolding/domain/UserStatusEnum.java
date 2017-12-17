package com.toby.scaffolding.domain;

/**
 * Created by Toby on 2017/12/17.
 */
public enum UserStatusEnum {
    OPEN("0"),

    CLOSE("1");

    private String status;

    UserStatusEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
