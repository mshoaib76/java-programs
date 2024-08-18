  abstract class Package {
    protected String senderName, senderAddress, senderCity, senderState, senderZIP;
    protected String recipientName, recipientAddress, recipientCity, recipientState, recipientZIP;
    protected double weight; 
    protected double costPerOunce;

    public Package(String sName, String sAddress, String sCity, String sState, String sZIP,
                   String rName, String rAddress, String rCity, String rState, String rZIP,
                   double w, double cpo) {
        if (w <= 0 || cpo <= 0) {
            System.err.println("Weight and cost per ounce must be positive.");
            System.exit(1);
        }
        this.senderName = sName;
        this.senderAddress = sAddress;
        this.senderCity = sCity;
        this.senderState = sState;
        this.senderZIP = sZIP;
        this.recipientName = rName;
        this.recipientAddress = rAddress;
        this.recipientCity = rCity;
        this.recipientState = rState;
        this.recipientZIP = rZIP;
        this.weight = w;
        this.costPerOunce = cpo;
    }

    public abstract double calculateCost();
}

 class TwoDayPackage extends Package {
    private double flatFee;
    public TwoDayPackage(String sName, String sAddress, String sCity, String sState, String sZIP,
                         String rName, String rAddress, String rCity, String rState, String rZIP,
                         double w, double cpo, double ff) {
        super(sName, sAddress, sCity, sState, sZIP, rName, rAddress, rCity, rState, rZIP, w, cpo);
        this.flatFee = ff;
    }
    public double calculateCost() {
        return flatFee;
        }
    }
 class OvernightPackage extends Package {
    private double additionalFeePerOunce;
    public OvernightPackage(String sName, String sAddress, String sCity, String sState, String sZIP,String rName, String rAddress, String rCity, String rState, String rZIP, double w, double cpo, double afpo) {
        super(sName, sAddress, sCity, sState, sZIP, rName, rAddress, rCity, rState, rZIP, w, cpo);
        this.additionalFeePerOunce = afpo;
    }
    public double calculateCost() {
        return (costPerOunce + additionalFeePerOunce) * weight;
    }
}
public class Mainss {
    public static void main(String[] args) {
        Package package1 = new Package("Shaooib", "Baloch", "Layyah", "Pak", "45", "ahmad", "Sial", "Layyah", "pak", "690", 10.0, 0.5) {
            public double calculateCost() {
                return weight * costPerOunce;
            }
        };
        TwoDayPackage package2 = new TwoDayPackage("Shaoib baloch", "Paki merani", "Layyah", "Pakistan", "7635647","majid iqbal", "peer jaggi", "Ladhana", "Pakistan", "23456", 20.0, 0.75, 10.0);
        OvernightPackage package3 = new OvernightPackage("Ahmad", "labaa lilim", "Layyah", "punjab Pakistan", "56789",
                                                         "Mr.Error", "Merani", "Layyah", "Pak", "12341",
                                                         30.0, 1.0, 0.25);

        System.out.println("Package 1 Total cost: $" + package1.calculateCost());
        System.out.println("Package 2 Total cost: $" + package2.calculateCost());
        System.out.println("Package 3 Total cost: $" + package3.calculateCost());
    }
}
