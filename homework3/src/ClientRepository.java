import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientRepository implements IRepository<Client, Integer> {
    List<Client>clients = new ArrayList<>();
    @Override
    public void create(Client item) {
        clients.add(item);
        System.out.println("Запись в базу данных");
    }


    @Override
    public void delete(Client item) {
        clients.remove(item);
        System.out.println("Удаление из базы данных");
    }

    @Override
    public Client getById(Integer id) {
        for (Client client: clients) {
            if (id == client.getId()){
                return client;
            }
        }
        return null;
    }
    public void printAll(){
        for (Client client:clients) {
            System.out.println(client);
        }
    }
}
