
public class Logger {
    private static Logger main_logger;
    //note: for thread safe implementation just do: private static final Logger main_logger = new Logger();
    private Logger() {

    }

    public static Logger getLogger() {
        if(main_logger == null) 
            main_logger = new Logger();
        
        return main_logger;
    }

    public static void log(int n) {
        System.out.println("Logging..."+n);
    }

}