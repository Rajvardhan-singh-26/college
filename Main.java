import java.util.Scanner;

class TrunkCall {
    private int durationMinutes;

    public TrunkCall(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public double calculateCharge() {
        return 0.0; // Default implementation (to be overridden by subclasses)
    }
}

class OrdinaryCall extends TrunkCall {
    public OrdinaryCall(int durationMinutes) {
        super(durationMinutes);
    }

    @Override
    public double calculateCharge() {
        // Charges for ordinary calls (e.g., $0.10 per minute)
        return 0.10 * getDurationMinutes();
    }
}

class UrgentCall extends TrunkCall {
    public UrgentCall(int durationMinutes) {
        super(durationMinutes);
    }

    @Override
    public double calculateCharge() {
        // Charges for urgent calls (e.g., $0.20 per minute)
        return 0.20 * getDurationMinutes();
    }
}

class LightningCall extends TrunkCall {
    public LightningCall(int durationMinutes) {
        super(durationMinutes);
    }

    @Override
    public double calculateCharge() {
        // Charges for lightning calls (e.g., $0.50 per minute)
        return 0.50 * getDurationMinutes();
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