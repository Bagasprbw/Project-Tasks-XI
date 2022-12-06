

package tugasenkapsul;

public class Mobil {
    private String mesin;
    private String merk;
    private String namapemilik;
    private String plat;
    
    public void setMesin(String m){
        mesin  = m;
    }
    public String getMesin(){
        return mesin;
    }
    public void setMerk(String mrk){
        merk  = mrk;
    }
    public String getMerk(){
        return merk;
    }
     public void setNamaPemilik(String np){
        namapemilik  = np;
    }
    public String getNamaPemilik(){
        return namapemilik;
    }
     public void setPlat(String p){
        plat  = p;
    }
    public String getPlat(){
        return plat;
    }
    
    public void infoMobil(){
        System.out.println("mesin = "+getMesin());
        System.out.println("merk = "+getMerk());
        System.out.println("namapemilik = "+getNamaPemilik());
        System.out.println("plat = "+getPlat());
    }
}
