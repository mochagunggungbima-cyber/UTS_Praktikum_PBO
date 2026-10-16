public class Admin extends User {
    
    public void updateVehicleDetails(int vehicleId) {
        System.out.println("Admin memperbarui detail kendaraan dengan ID: " + vehicleId);
    }

    public String addVehicle() {
        System.out.println("Kendaraan baru berhasil ditambahkan ke sistem.");
        return "Vehicle_Object";
    }

    public void retrieveComplain() {
        System.out.println("Admin mengambil daftar keluhan pengguna dari sistem.");
    }

    public void verifyUser(Customer customer) {
        System.out.println("Admin berhasil memverifikasi customer: " + customer.getName());
    }
}