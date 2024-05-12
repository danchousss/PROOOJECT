public class curatorOfPractice {
    String password="qwerty";
    String login="curator";
    public boolean verification(String password,String login){
        if(this.password.equals(password) && this.login.equals(login)){
            return true;
        }else{
            return false;
        }
    }
}
