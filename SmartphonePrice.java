class SmartphonePrice implements Cloneable {
    private String priceType;
    private double priceInEuros;

    public SmartphonePrice(String type, double price) {
        this.priceType = type;
        this.priceInEuros = price;
    }

    @Override
    public String toString() {
        return "Price: " + priceType + "\nPrice in Euro: " + priceInEuros;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) obj;

        return Double.compare(that.priceInEuros, priceInEuros) == 0 &&
                priceType.equals(that.priceType);
    }

    @Override
    public int hashCode() {
        int result = priceType.hashCode();

        long temp = Double.doubleToLongBits(priceInEuros);
        result = 31 * result + (int) (temp ^ (temp >>> 32));

        return result;
    }

    @Override
    public SmartphonePrice clone() {

        try {
            return (SmartphonePrice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public double getPriceInEuros() {
        return priceInEuros;
    }

    public String getPriceType() {
        return priceType;
    }
}

