class Smartphone implements Cloneable {
    private String brandName;
    private String modelName;
    private int batterymAh;
    private SmartphonePrice producerPrice;
    private SmartphonePrice retailPrice;

    public Smartphone(String brand, String model, int battery, SmartphonePrice prodP, SmartphonePrice retailP) {
        this.brandName = brand;
        this.modelName = model;
        this.batterymAh = battery;
        this.producerPrice = prodP;
        this.retailPrice = retailP;
    }

    @Override
    public String toString() {
        return "Smartphone Details:\n" +
                "Brand Name: " + brandName + "\n" +
                "Model Name: " + modelName + "\n" +
                "Battery mAh: " + batterymAh + "\n" +
                "Producer Price:\n" + producerPrice.toString() + "\n" +
                "Retail Price:\n" + retailPrice.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Smartphone that = (Smartphone) obj;

        return batterymAh == that.batterymAh &&
                brandName.equals(that.brandName) &&
                modelName.equals(that.modelName) &&
                producerPrice.equals(that.producerPrice) &&
                retailPrice.equals(that.retailPrice);
    }

    @Override
    public int hashCode() {
        int result = brandName.hashCode();
        result = 31 * result + modelName.hashCode();
        result = 31 * result + batterymAh;
        result = 31 * result + producerPrice.hashCode();
        result = 31 * result + retailPrice.hashCode();
        return result;
    }

    @Override
    public Smartphone clone() {
        try {
            Smartphone clonedSmartphone = (Smartphone) super.clone();
            clonedSmartphone.producerPrice = this.producerPrice.clone();
            clonedSmartphone.retailPrice = this.retailPrice.clone();
            return clonedSmartphone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getBatterymAh() {
        return batterymAh;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }
}
