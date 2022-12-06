package latihanpewarisan;
public class Kubus extends BangunRuang{    
    private double s;
            public Kubus(){
            super();
            System.out.println("Mencetak anak : Kubus \n");
            s=20;
            nama = "Ini kubus";
        }
        public double volume(){
            return s * s * s;
        }
        public void infokubus(){
            System.out.println("Nama :" + nama);
            System.out.println("Nialai s : " + this.s);
            System.out.println("volume Kubus : " + volume());
        }
}
