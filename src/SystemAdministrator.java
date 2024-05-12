public class SystemAdministrator {
    String password="qwerty";
    String login="admin";
    public boolean verification(String password,String login){
        if(this.password.equals(password) && this.login.equals(login)){
            return true;
        }else{
            return false;
        }
    }
}
