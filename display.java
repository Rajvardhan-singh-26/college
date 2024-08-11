class TrunkCall {
    private int duration;
    public TrunkCall(int duration) {
        this.duration = duration;
    }
    public int getDurationMinutes() {
        return duration;
    }
    public double calculateCharge() {
        return 1.00; 
    }
}
class OrdinaryCall extends TrunkCall {
    public OrdinaryCall(int duration) {
        super(duration);
    }
    public double calculateCharge() {
        return 1.10 * getDuration();
    }
}

class UrgentCall extends TrunkCall {
    public UrgentCall(int duration) {
        super(duration);
    }
    public double calculateCharge() {
        return 1.20 * getDuration();
    }
}

class LightningCall extends TrunkCall {
    public LightningCall(int duration) {
        super(duration);
    }
    public double calculateCharge() {
        return 1.50 * getDuration();
    }
}
public class display{
    public static void main(String[] args) {
        TrunkCall ordinaryCall = new OrdinaryCall(100);
        TrunkCall urgentCall = new UrgentCall(50);
        TrunkCall lightningCall = new LightningCall(15);

        double ordinaryCharge = ordinaryCall.calculateCharge();
        double urgentCharge = urgentCall.calculateCharge();
        double lightningCharge = lightningCall.calculateCharge();

        System.out.println("Charges for Ordinary Call: $" + ordinaryCharge);
        System.out.println("Charges for Urgent Call: $" + urgentCharge);
        System.out.println("Charges for Lightning Call: $" + lightningCharge);
    }
}