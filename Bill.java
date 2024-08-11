import java.util.Scanner;
class TrunkCall {
    private int durationInMinutes;
    public TrunkCall(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
    public double calculateCharge() {
        return 1.0; 
    }
}
class OrdinaryCall extends TrunkCall {
    public OrdinaryCall(int durationInMinutes) {
        super(durationInMinutes);
    }
    public double calculateCharge() {
        return 1.10 * getDurationInMinutes();
    }
}
class UrgentCall extends TrunkCall {
    public UrgentCall(int durationInMinutes) {
        super(durationInMinutes);
    }
    public double calculateCharge() {
        return 1.20 * getDurationInMinutes();
    }
}
class LightningCall extends TrunkCall {
    public LightningCall(int durationInMinutes) {
        super(durationInMinutes);
    }
    public double calculateCharge() {
        return 1.50 * getDurationInMinutes();
    }
}
public class Bill {
    public static void main(String[] args) {
        TrunkCall ordinaryCall = new OrdinaryCall(100);
        TrunkCall urgentCall = new UrgentCall(50);
        TrunkCall lightningCall = new LightningCall(15);
        double ordinaryCharge = ordinaryCall.calculateCharge();
        double urgentCharge = urgentCall.calculateCharge();
        double lightningCharge = lightningCall.calculateCharge();
        System.out.println("Charges for Ordinary Call: rs" + ordinaryCharge);
        System.out.println("Charges for Urgent Call: rs" + urgentCharge);
        System.out.println("Charges for Lightning Call: rs" + lightningCharge);
    }
}