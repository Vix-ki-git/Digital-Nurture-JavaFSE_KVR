public class Test {
    public static void main(String args[]) {
        StockMarket market = new StockMarket();

        MobileApp zerodha = new MobileApp("Zerodha");
        WebApp angelOne = new WebApp("Angel One");

        market.register(zerodha);
        market.register(angelOne);

        market.setStock("CTSH", 77.8);
        market.setStock("TCS", 39.9);
        market.setStock("RELIANCE", 20);

        market.deregister(angelOne);
        market.setStock("RELIANCE", 17);
    }
}