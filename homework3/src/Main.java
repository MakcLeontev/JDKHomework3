public class Main {
    public static void main(String[] args) {
        Client client = new Client("Вася",14);
        Client client1 = new Client("Женя",32);
        ClientRepository clientRepository = new ClientRepository();
        clientRepository.create(client);
        clientRepository.create(client1);
        clientRepository.printAll();
        System.out.println(clientRepository.getById(2));
        clientRepository.delete(client);
        clientRepository.printAll();

    }
}