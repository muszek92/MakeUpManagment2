
public class Client{

    private String name;
    private int phone;
    private String adress;
    private String otherInfo;


    public Client (String name, int phone, String adress, String otherInfo){
        this.name = name;
        this.phone = phone;
        this.adress = adress;
        this.otherInfo = otherInfo;
    }

    public Client (){

    }

    public String getName() {
        if (name == null){
            System.out.println("Musisz podać Imię i nazwisko.");;
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {

        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }
}
