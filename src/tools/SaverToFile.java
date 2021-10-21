
package tools;

import entity.Client;
import entity.History;
import entity.Model;
import interfaces.keeping;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;



public class SaverToFile implements keeping{

    @Override
    public void saveClient(Client[] client) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("Client");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(client);
            oos.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.INFO, "File is exist = client", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Error of typing", ex);
        }
    }

    @Override
    public Client[] loadClient() {
        Client[] client = new Client[10];
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("client");
            ois = new ObjectInputStream(fis);
            client = (Client[]) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.INFO, "file client is not created", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "error of reading file to client", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.INFO, "Class flient is not exist", ex);
        }
        
        return client;
    }


    @Override
    public void saveModel(Model[] models) {
                FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("Model");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(models);
            oos.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.INFO, "File is exist = models", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Error typing", ex);
        }
    }
    @Override
    public Model[] loadModels() {
                Model[] models = new Model[10];
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("models");
            ois = new ObjectInputStream(fis);
            models = (Model[]) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.INFO, "file models is not created", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "error of reading file to models", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.INFO, "Class models is not exist", ex);
        }
        
        return models;
    }
    
        

    @Override
    public void saveHistories(History[] histories) {
                       FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("History");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(histories);
            oos.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.INFO, "File is exist = histories", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Error typing", ex);
        }
    }

    @Override
    public History[] loadHistories() {
     History[] histories = new History[10];
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("histories");
            ois = new ObjectInputStream(fis);
            histories = (History[]) ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.INFO, "file histories is not created", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "error of reading file to histories", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.INFO, "Class histories is not exist", ex);
        }
        
        return histories;
    }
        
    
}
