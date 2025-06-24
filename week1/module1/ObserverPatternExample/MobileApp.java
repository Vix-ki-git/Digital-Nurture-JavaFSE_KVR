public class MobileApp implements Observer {
    private String appname;
    public MobileApp(String s) {
        this.appname = s;
    }

    public void update(String sname, double price) {
        System.out.println(appname + " Stock Name:"+sname+" Price:"+price+"USD");
    }
}