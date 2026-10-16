import java.util.List;

public class Customer extends User {
    private boolean verificationStatus = false;

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(List<String> documents) {
        System.out.println("Customer " + name + " mengajukan verifikasi akun.");
        this.verificationStatus = true; 
        System.out.println("Dokumen berhasil diunggah: " + documents);
    }
}