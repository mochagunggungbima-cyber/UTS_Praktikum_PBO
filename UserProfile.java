import java.util.List;

public class UserProfile {
    private String docPath;
    
    public void editProfile(User user) {
        System.out.println("Memperbarui profil untuk pengguna: " + user.getName());
    }

    public void showDocuments(List<String> docs) {
        System.out.println("Menampilkan dokumen terunggah: " + docs);
    }
}