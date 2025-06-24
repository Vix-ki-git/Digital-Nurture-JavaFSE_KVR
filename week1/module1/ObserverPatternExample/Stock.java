public interface Stock {
    public void register(Observer o);
    public void deregister(Observer o);
    public void notifyObservers();
}