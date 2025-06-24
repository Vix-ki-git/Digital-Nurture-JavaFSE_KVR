public class WebApp implements Observer {
    private String wname;

    public WebApp(String w) {
        this.wname = w;
    }

    public void update(String sname, double price) {
        System.out.println(wname + " Stock Name:"+sname+" Price:"+price+"USD");
    }
}