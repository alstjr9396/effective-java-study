package me.minseok.effectivejava.chapter02;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

//@Builder
//@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Member {

    private String name;

    private String loginId;

    private String loginPwd;

    private String email;

    private String phoneNumber;

    private String address;

    public Member() {}

    public Member(String name) {
        this.name = name;
    }

    public Member(String name, String loginId) {
        this.name = name;
        this.loginId = loginId;
    }

    public Member(String name, String loginId, String loginPwd) {
        this.name = name;
        this.loginId = loginId;
        this.loginPwd = loginPwd;
    }

    public Member(String name, String loginId, String loginPwd,
                  String phoneNumber) {
        this(name, loginId, loginPwd, phoneNumber, null);
    }

    public Member(String name, String loginId, String loginPwd,
                  String phoneNumber, String address) {
        this.name = name;
        this.loginId = loginId;
        this.loginPwd = loginPwd;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Member(Builder builder) {
        name = builder.name;
        loginId = builder.loginId;
        loginPwd = builder.loginPwd;
        email = builder.email;
        phoneNumber = builder.phoneNumber;
        address = builder.address;
    }

    public static class Builder {
        private String name;

        private String loginId = "";

        private String loginPwd = "";

        private String email = "";

        private String phoneNumber = "";

        private String address = "";

        public Builder(String name) {
            this.name = name;
        }

        public Builder loginId(String val) {
            this.loginId = val;
            return this;
        }

        public Builder loginPwd(String val) {
            this.loginPwd = val;
            return this;
        }

        public Builder email(String val) {
            this.email = val;
            return this;
        }

        public Builder phoneNumber(String val) {
            this.phoneNumber = val;
            return this;
        }

        public Builder address(String val) {
            this.address = val;
            return this;
        }

        public Member build() {
            return new Member(this);
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
