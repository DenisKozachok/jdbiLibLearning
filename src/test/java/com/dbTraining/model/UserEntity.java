package com.dbTraining.model;

public class UserEntity {

        private int id;
        private String login;
        private String full_name;
        private String password;
        private int access_level;
        private int company_id;
        private String password_expired;
        private Boolean blocked;
        private int deleted;
        private int allow_change_pwd;
        private String account_expired;
        private String locale;
        private String new_password;
        private Boolean is_two_factor_enabled;
        private String two_factor_secret;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getLogin() {
                return login;
        }

        public void setLogin(String login) {
                this.login = login;
        }

        public String getFull_name() {
                return full_name;
        }

        public void setFull_name(String full_name) {
                this.full_name = full_name;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public int getAccess_level() {
                return access_level;
        }

        public void setAccess_level(int access_level) {
                this.access_level = access_level;
        }

        public int getCompany_id() {
                return company_id;
        }

        public void setCompany_id(int company_id) {
                this.company_id = company_id;
        }

        public String getPassword_expired() {
                return password_expired;
        }

        public void setPassword_expired(String password_expired) {
                this.password_expired = password_expired;
        }

        public Boolean getBlocked() {
                return blocked;
        }

        public void setBlocked(Boolean blocked) {
                this.blocked = blocked;
        }

        public int getDeleted() {
                return deleted;
        }

        public void setDeleted(int deleted) {
                this.deleted = deleted;
        }

        public int getAllow_change_pwd() {
                return allow_change_pwd;
        }

        public void setAllow_change_pwd(int allow_change_pwd) {
                this.allow_change_pwd = allow_change_pwd;
        }

        public String getAccount_expired() {
                return account_expired;
        }

        public void setAccount_expired(String account_expired) {
                this.account_expired = account_expired;
        }

        public String getLocale() {
                return locale;
        }

        public void setLocale(String locale) {
                this.locale = locale;
        }

        public String getNew_password() {
                return new_password;
        }

        public void setNew_password(String new_password) {
                this.new_password = new_password;
        }

        public Boolean getIs_two_factor_enabled() {
                return is_two_factor_enabled;
        }

        public void setIs_two_factor_enabled(Boolean is_two_factor_enabled) {
                this.is_two_factor_enabled = is_two_factor_enabled;
        }

        public String getTwo_factor_secret() {
                return two_factor_secret;
        }

        public void setTwo_factor_secret(String two_factor_secret) {
                this.two_factor_secret = two_factor_secret;
        }

        @Override
        public String toString() {
                return "UserEntity{" +
                        "id=" + id +
                        ", login='" + login + '\'' +
                        ", full_name='" + full_name + '\'' +
                        ", password='" + password + '\'' +
                        ", access_level=" + access_level +
                        ", company_id=" + company_id +
                        ", password_expired='" + password_expired + '\'' +
                        ", blocked=" + blocked +
                        ", deleted=" + deleted +
                        ", allow_change_pwd=" + allow_change_pwd +
                        ", account_expired='" + account_expired + '\'' +
                        ", locale='" + locale + '\'' +
                        ", new_password='" + new_password + '\'' +
                        ", is_two_factor_enabled=" + is_two_factor_enabled +
                        ", two_factor_secret='" + two_factor_secret + '\'' +
                        '}';
        }


}
