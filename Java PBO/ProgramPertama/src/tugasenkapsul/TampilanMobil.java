package tugasenkapsul;

public class TampilanMobil {
    public static void main(String [] args){
        Mobil akses = new Mobil();
        
        akses.setMesin("Toyota");
        akses.setMerk("Fortuner");
        akses.setNamaPemilik("Meikel");
        akses.setPlat("AD 3567 TD");
        akses.infoMobil();
    }
    
}
