import java.util.List;

public class SistemManajemenUser {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.name = "Budi Admin";
        admin.userId = 101;
        
        System.out.println("=== AKTIVITAS ADMIN ===");
        admin.addVehicle();
        admin.retrieveComplain();
        admin.updateVehicleDetails(505);

        System.out.println("\n=== AKTIVITAS CUSTOMER ===");
        Customer cust = new Customer();
        cust.name = "Siti Customer";
        cust.userId = 202;
        cust.emailId = "siti@mail.com";
        
        cust.applyVerification(List.of("KTP.jpg", "Selfie.png", "SKTM.pdf"));
        System.out.println("Status Verifikasi Siti: " + cust.getVerificationStatus());

        System.out.println("\n=== PROSES VERIFIKASI OLEH ADMIN ===");
        admin.verifyUser(cust);
    }
}