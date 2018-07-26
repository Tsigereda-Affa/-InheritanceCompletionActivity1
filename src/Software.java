public class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;//windos 10,

    public Software() {
        super();
        System.out.println("       This is the software application");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
String finish = "The end of the code";
        return os + "\n " + finish ;
    }

    public void setOs(String os) {
        this.os = os;

    }
}

