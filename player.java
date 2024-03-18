package player;

public class player {
    private String name;
    private char symbol;
    private String address;
    private String contactnumber;
    private String emailid;
    private int age;

    public void setPlayerDetails(String name, char symbol, String address, String contactnumber, String emailid,
            int age) {
        this.name = name;
        this.symbol = symbol;
        this.address = address;
        this.contactnumber = contactnumber;
        this.emailid = emailid;
        this.age = age;
    }

    public void setPlayerNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPlayerNameSymbolEmailidAge(String name, char symbol, String emailid, int age) {
        this.name = name;
        this.symbol = symbol;
        this.emailid = emailid;
        this.age = age;
    }

    public void changeSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setPlayerNameAndSymbol(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getPlayerName() {
        return this.name;
    }

    public char getPlayerSymbol() {
        return this.symbol;
    }

    // for showing all details
    public void getPlayerDetails() {
        System.out.println("Player Name:" + this.name);
        System.out.println("Player Symbol:" + this.symbol);
        System.out.println("Player EmailId:" + this.emailid);
        System.out.println("Player Age:" + this.age);
        System.out.println("Player ContactNumber:" + this.contactnumber);
        System.out.println("Player address:" + this.address);

    }

}
