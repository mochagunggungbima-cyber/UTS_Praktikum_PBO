public class AplikasiHybrid {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN KELAS D (Hybrid: A -> B -> D) ===");
        D objD = new D();
        objD.methodA(); 
        objD.methodB(); 
        objD.methodD(); 

        System.out.println("\n=== PENGUJIAN KELAS C (Hierarchical: A -> C) ===");
        C objC = new C();
        objC.methodA(); 
        objC.methodC(); 
    }
}