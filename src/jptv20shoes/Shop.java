
package jptv20shoes;

import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Calendar;
import entity.Client;
import entity.History;
import entity.Model;
import interfaces.keeping;
import tools.SaverToFile;


public class Shop {
    float opa = 0;
    Scanner scanner = new Scanner(System.in);
    private Model[] models = new Model[10];
    private Client[] client = new Client[10];
    private History[] histories = new History[10];
    private final keeping keeper = new SaverToFile();
    double shopStonks = 0;
    Calendar c = new GregorianCalendar();
    public Shop() {
        client = keeper.loadClient();
        histories = keeper.loadHistories();
        models = keeper.loadModels();
    }
    public void run(){
        String repeat = "r";
        do{
            System.out.println("Task - 0: Out programm");
            System.out.println("Task - 1: Add model");
            System.out.println("Task - 2: List of model");
            System.out.println("Task - 3: Add information of client");
            System.out.println("Task - 4: Information of client");
            System.out.println("Task - 5: Gave model");
            System.out.println("Task - 6: Income store");
            System.out.printf("Change the number =");
            int task = scanner.nextInt();scanner.nextLine();
            switch (task) {
                case 0:
                    repeat = "d";
                    System.out.println("Bye!");
                    break;
                case 1:
                    System.out.println("---- Add model ----");
                    for (int i = 0; i < models.length; i++) {
                        if(models[i] == null){
                            models[i] = addModel();
                            keeper.saveModel(models);
                            break;
                        }
                    }
                    break;
                case 2:
                  System.out.println("----- List of model -----");
                    for (int i = 0; i < models.length; i++) {
                        if(models[i] != null){
                            System.out.println(models[i].toString());
                        }
                    }
                    break;
                case 3:
                    System.out.println("----- Add client  -----");
                    for (int i = 0; i < client.length; i++) {
                        if(client[i] == null){
                            client[i] = addClient();
                            keeper.saveClient(client);
                            break;
                        }
                    }
                case 4:
                    System.out.println("----- information of client  -----");
                    for (int i = 0; i < client.length; i++) {
                        if(client[i] != null){
                            System.out.println(client[i].toString());
                        }
                    }
                    break;
                case 5:
                    System.out.println("----- ITEMS -----");
                    for (int i = 0; i < client.length; i++) {
                        if(histories[i] == null){
                            histories[i] = addHistory();
                            break;
                        }
                    }
                break;
                case 6:
                    System.out.println("-----  Income store -----");
                    System.out.println(opa);
                default:
                    System.out.println("Change number of the list!");;
            }
        }while ("r".equals(repeat));
    }
     private Model addModel(){
        Model model = new Model();
        System.out.print("Name of model: ");
        model.setModelName(scanner.nextLine());
        System.out.print("Size of model: ");
        model.setModelSize(scanner.nextLine());
        System.out.print("Price of model: ");
        model.setPrice(scanner.nextDouble());scanner.nextLine();
        System.out.print("Name of firm: ");
        model.setModelFirm(scanner.nextLine()); 

        
        
        
       
        return model;
    }
    private Client addClient(){
        Client client = new Client();
        System.out.print("Name of client: ");
        client.setName(scanner.nextLine());
        System.out.print("Surname of client: ");
        client.setSurname(scanner.nextLine());
        System.out.print("Number of client: ");
        client.setMobileNumber(scanner.nextLine());
        System.out.print("Money of client: ");
        client.setMoney(scanner.nextDouble());
        return client;
    }

    private History addHistory() {
        History history = new History();
       

        System.out.println("List of items: ");
        for (int i = 0; i < models.length; i++) {
            if(models[i] != null){
                System.out.println(i+1+" "+models[i].toString());
            }
        }
        System.out.print("Change the item: ");
        int numberModel = scanner.nextInt(); scanner.nextLine();
        System.out.print("Will sold by to -> ");
        for (int i = 0; i < client.length; i++) {
            if(client[i] != null){
                System.out.println(i+1+" "+client[i].toString());
            }
        }
        System.out.println("Who buy this item: ");
        int numberClient = scanner.nextInt();scanner.nextLine();
        history.setModel(models[numberModel - 1]);
        history.setClient(client[numberClient - 1]);
           Calendar c = new GregorianCalendar();
           double MMoney = models [numberClient - 1].getPrice();
           double CMoney = client[numberClient - 1].getMoney(); 
                if(CMoney >=MMoney){
                client [numberClient-1].setMoney(client[numberClient-1].getMoney()-models[numberClient-1].getPrice());
                opa+=models[numberClient-1].getPrice();
                   }else{
                       System.out.println("You don't have money!");
                       
                   }
            
        return history;
    }
}
    

