package dao;


import dto.UserBean;

public interface UserDao 
{
public String registerUser(UserBean bean);
public String LoginUser(UserBean bean);
public String ForgotPass(UserBean bean);
}
