package login;

import java.util.Date;
public  class Login  extends ActionSupport {
public String execute() throws Exception {
  System.out.println("Validating login");
  if(!getUsername().equals("Admin") || !getPassword().equals("Admin")){
  addActionError("Invalid user name or password! Please try again!");
  return ERROR;
  }else{
  return SUCCESS;
  }
  }private String username = null;
  public String getUsername() {
  return username;
  }

public void setUsername(String value) {
  username = value;
  }
  private String password = null;
  public String getPassword() {
  return password;
  }
  public void setPassword(String value) {
  password = value;
  }

}