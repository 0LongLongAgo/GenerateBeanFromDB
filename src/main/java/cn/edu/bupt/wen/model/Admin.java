package cn.edu.bupt.wen.model;

public class Admin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.account
     *
     * @mbggenerated Mon Sep 18 13:05:50 CST 2017
     */
    private String account;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.password
     *
     * @mbggenerated Mon Sep 18 13:05:50 CST 2017
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.account
     *
     * @return the value of admin.account
     *
     * @mbggenerated Mon Sep 18 13:05:50 CST 2017
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.account
     *
     * @param account the value for admin.account
     *
     * @mbggenerated Mon Sep 18 13:05:50 CST 2017
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.password
     *
     * @return the value of admin.password
     *
     * @mbggenerated Mon Sep 18 13:05:50 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.password
     *
     * @param password the value for admin.password
     *
     * @mbggenerated Mon Sep 18 13:05:50 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}