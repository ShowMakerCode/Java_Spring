/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author 98tae
 */
public class Usermanagent {

    private String UserName;
    private String PassWord;
    private String Role;

    public Usermanagent() {
    }

    public Usermanagent(String UserName, String PassWord, String Role) {
        this.UserName = UserName;
        this.PassWord = PassWord;
        this.Role = Role;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    
    public void InThongTin(){
        System.out.println("User : "+this.UserName + "Pass: "+this.PassWord + "Role :"+this.Role);
    }
    
}
