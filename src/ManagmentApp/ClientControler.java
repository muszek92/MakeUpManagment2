package ManagmentApp;


public class ClientControler  {

    //metoda tworząca nowego klienta
    public static Client newClient(int id, String clientName,String clientSurename, String clientEmail, String clientPhone){
        return new Client(id,clientName, clientSurename, clientEmail, clientPhone);
    }

    //metoda usuwająca klienta
    public static void deleteClient(){


    }

    //metoda modyfikująca klienta
    public static Client correctClient(int id, String clientName,String clientSurename, String clientEmail, String clientPhone){

        return new Client(id,clientName, clientSurename, clientEmail, clientPhone);
    }

}
