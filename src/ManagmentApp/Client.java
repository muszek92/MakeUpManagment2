package ManagmentApp;

/**
 * klasa modelowa klienta
 */
public class Client {

    private int id;
    private String clientName;
    private String clientSurename;
    private String clientEmail;
    private String clientPhone;
    Address adres;

    //settery i gettery
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public String getClientSurename() {
        return clientSurename;
    }
    public void setClientSurename(String clientSurename) {
        this.clientSurename = clientSurename;
    }
    public String getClientEmail() {
        return clientEmail;
    }
    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }
    public String getClientPhone() {
        return clientPhone;
    }
    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }


    // kontruktor bezparametrowy
    public Client() {
    }

    //kostruktor wszystkie parametry
    public Client(int id, String clientName, String clientSurename, String clientEmail, String clientPhone) {
        this.id = id;
        this.clientName = clientName;
        this.clientSurename = clientSurename;
        this.clientEmail = clientEmail;
        this.clientPhone = clientPhone;
    }



}



