
package entity;

public class Model {
     private String ModelName;
    private Double Price;
    private String ModelSize;
    private String ModelFirm;

    public String getModelName() {
        return ModelName;
    }

    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public String getModelSize() {
        return ModelSize;
    }

    public void setModelSize(String ModelSize) {
        this.ModelSize = ModelSize;
    }

    public String getModelFirm() {
        return ModelFirm;
    }

    public void setModelFirm(String ModelFirm) {
        this.ModelFirm = ModelFirm;
    }

    @Override
    public String toString() {
        return "Model{" + "ModelName=" + ModelName + ", Price=" + Price + ", ModelSize=" + ModelSize + ", ModelFirm=" + ModelFirm + '}';
    }
    
}

