package browser;

public class FactoryBrowser {

    public static IBrowser make(String browserType){
        IBrowser browser;

        switch (browserType.toLowerCase()){
            case "chrome":
                browser=new Chrome();
                break;
            case "firefox":
                browser= new FireFox();
                break;
            default:
                browser= new Safari();
                break;
        }
        return browser;
    }
}
