package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Clinic  {
    private final ArrayList<Client> clients;
    Scanner scanner = new Scanner(System.in);

    public Clinic(){
        this.clients = new ArrayList<>();
    }

    public void add(final Client client) {
        boolean hasSigned = false;
        for (Client CloneClient : clients) {
            if (CloneClient.getClientName().equals(client.getClientName())) {
                System.out.println("Client " + client.getClientName() + " has already signed");
                hasSigned = true;
            }
        }
        if (!hasSigned) {
            clients.add(client);
            System.out.println("Client signed successfully");
        }
    }

    public int findClientbyClientName(String Name){
        int i = 0;
        for (Client client : clients) {
            i++;
            if (client.ClientName.equals(Name))
                return i;
        }
        System.out.println("Нет клиента с именем"+ Name);
        return -1;
    }

    public int findClientByPetName(String Name) {
        int i = 0;
        for (Client client : clients) {
            i++;
            if (client.getPet().name.equals(Name))
                return i;
        }
        System.out.println("Нет клиента с именем животного "+ Name);
        return -1;
    }

    public void editClientName(String Name, String newName){
        for(Client client: clients) {
            if (client.getClientName().equals(Name)) {
                client.ClientName = newName;
            }
        }
    }

    public void editPetName(String Name, String newName){
        for(Client client: clients)
            if (client.getPet().name.equals(Name))
                client.getPet().name = newName;
    }

    public void getAllClients(){
        System.out.println("-----------------All Clients--------------");
        for(Client client: clients){
            System.out.println("Client " + client.ClientName +" has animal "+ client.getPet().name);
        }
    }



}
