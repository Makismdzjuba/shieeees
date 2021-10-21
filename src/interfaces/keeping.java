
package interfaces;

import entity.Client;
import entity.History;
import entity.Model;

public interface keeping {
    public void saveClient(Client[] client);
    public Client[] loadClient();
    public void saveModel(Model[] modelis);
    public Model[] loadModels();
    public void saveHistories(History[] histories);
    public History[] loadHistories();
    
}
