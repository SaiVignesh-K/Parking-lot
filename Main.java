import java.time.*;
import java.util.Scanner;
interface vehicle {
    boolean check();
    boolean check(String s);
    void addVehicle();
    void addVehicle(String s);
    void removeVehicle(int i);
    void removeVehicle(int id,String s);
}
class implement extends payment{
    //used to create generic object
}
class admin extends payment{
    Instant end;
    long hrs;
    public void setHrs(long hrs) {
        this.hrs = hrs;
    }
    void Verify(int vt,int i) throws InterruptedException {
        if(i==1){
            System.out.println("Thank You!!! Visit us again");
        }
        else{
            System.out.println("Please make the payment ");
            makePayment(vt);
        }
    }
    public Instant getEnd() {
        return end;
    }
    public void setEnd() {
        this.end =Instant.now();
    }
    void makePayment(int Vt) throws InterruptedException {
        ifOffline(Vt,hrs);
    }
}
class payment{
    int gate1=1;
    int gate2=3;
    private int CostPerHr(int i){
        if(i==1){
            return 30; //large
        }
        if(i==2){
            return 20; //compact
        }
        if(i==3){
            return 60;//electric
        }
        if(i==4){
            return 10;//bike
        }
        if(i==5){
            return 5;//Handicapped
        }
        if(i==6){
            return 40;//Truck
        }
        if(i==7){
            return 15;//service truck
        }
    return 0;};
    void ifOnline(int p,long hrs) throws InterruptedException {
        int x=0,xp=CostPerHr(p);
        if(hrs<=1){
            x+=xp;
        }
        else{
            x+=xp;hrs--;
            xp=3/4*xp;
            while(hrs!=0){
                hrs--;
                x+=xp;
            }
        }
        System.out.println("No of Hours   :"+hrs);
        System.out.println("cost Per Hour :"+CostPerHr(p));
        System.out.println("Please pay    :"+ x+ "Rs Only");
        if(gate2==3){
            System.out.println("GO through Exit - "+gate2);
            gate2=4;
        }
        else{
            System.out.println("GO through Exit - "+gate2);
            gate2=3;
        }

        System.out.println("Thank You for using our service");
        Thread.sleep(5000);
    }
    void ifOffline(int p,long hrs) throws InterruptedException {
        int x=0,xp=CostPerHr(p);
        if(hrs<=1){
            x+=xp;
        }
        else{
            x+=xp;hrs--;
            xp=3/4*xp;
            while(hrs!=0){
                hrs--;
                x+=xp;
            }
        }
        System.out.println("No of Hours   :"+hrs);
        System.out.println("cost Per Hour :"+CostPerHr(p));
        System.out.println("Please pay    :"+ x+ "Rs Only");
        if(gate1==1){
            System.out.println("GO through Exit - "+gate1);
            gate1=2;
        }
        else{
            System.out.println("GO through Exit - "+gate1);
            gate1=1;
        }

        System.out.println("Thank You for using our service");
        Thread.sleep(5000);
    }
}
class user{
    boolean filled=false;
    int Vid;
    int Uid;
    int VType;
    String Name;
    Instant sTime;
    Instant eTime;
    long hrs(){
        return Duration.between(sTime, eTime).toMinutes()+1;
    }
}
class car  implements  vehicle{
    boolean a[]=new boolean[120];
    boolean b[]=new boolean[30];
    int Vid;
    public boolean check() {
        for(int i=0;i<120;i++){
            if(!a[i]){
                Vid=i;
                return true;
            }
        }
        return false;
    }
    public boolean check(String s) {
        for(int i=0;i<30;i++){
            if(!b[i]){
                Vid=i;
                return true;
            }
        }
        return false;
    }
    public void setVid(int vid) {
        Vid = vid;
    }
    public int getVid() {
        return Vid;
    }
    public void addVehicle() {
        a[Vid]=true;
    }
    public void addVehicle(String s) {
        b[Vid]=true;
    }
    public void removeVehicle(int i) {
        a[Vid]=false;
    }
    public void removeVehicle(int id,String s) {
        b[Vid]=false;
    }
}
class bike  implements  vehicle{
    boolean a[]=new boolean[125];
    boolean b[]=new boolean[25];
    int Vid;
    public boolean check() {
        for(int i=0;i<125;i++){
            if(!a[i]){
                Vid=i;
                return true;
            }
        }
        return false;
    }
    public boolean check(String s) {
        for(int i=0;i<25;i++){
            if(!b[i]){
                Vid=i;
                return true;
            }
        }
        return false;
    }
    public void setVid(int vid) {
        Vid = vid;
    }
    public int getVid() {
        return Vid;
    }
    public void addVehicle() {
        a[Vid]=true;
    }
    public void addVehicle(String s) {
        b[Vid]=true;
    }
    public void removeVehicle(int i) {
        a[Vid]=false;
    }
    public void removeVehicle(int id,String s) {
        b[Vid]=false;
    }
}
class truck  implements  vehicle{
    boolean a[]=new boolean[50];
    int Vid;
    public boolean check() {
        for(int i=0;i<50;i++){
            if(!a[i]){
                Vid=i;
                return true;
            }
        }
        return false;
    }
    public boolean check(String s) {return false;}
    public void setVid(int vid) {
        Vid = vid;
    }
    public int getVid() {
        return Vid;
    }
    public void addVehicle() {
        a[Vid]=true;
    }
    public void addVehicle(String s) {}
    public void removeVehicle(int i) {
        a[Vid]=false;
    }
    public void removeVehicle(int id, String s) {}
}
class Service_Vehicle  implements  vehicle{
    String Password="user@123";
    boolean a[]=new boolean[100];
    int Vid;
    public boolean check() {
        for(int i=0;i<100;i++){
            if(!a[i]){
                Vid=i;
                return true;
            }
        }
        return false;
    }
    public boolean check(String s) {
        return false;}

    public void setVid(int vid) {
        Vid = vid;
    }
    public int getVid() {
        return Vid;
    }
    public void addVehicle() {
        a[Vid]=true;
    }
    public void addVehicle(String s) {}
    public void removeVehicle(int i) {
        a[Vid]=false;
    }
    public void removeVehicle(int id, String s) {}
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        user u[] = new user[400];
        for (int i = 0; i < 400; i++) {
            u[i] = new user();
        }
        int k, h, v;
        car c = new car();
        bike bk = new bike();
        truck tk=new truck();
        Service_Vehicle sv=new Service_Vehicle();
        implement ui=new implement();
        admin hi=new admin();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome!!!!");
            System.out.println("choose any of the below options");
            System.out.println("1.Create Account \n2.Existing User\n3.Display\n4.Verification(as Admin)");
            k = sc.nextInt();
            if (k == 1) {
                int idx = -1;
                for (int i = 0; i < 400; i++) {
                    if (!u[i].filled) {
                        idx = i;
                        u[i].filled = true;
                        break;
                    }
                }
                if (idx == -1) {
                    System.out.println("NO Vacancy");
                }
                System.out.println("Select the Type of Vehicle");
                System.out.println("1.Car\n2.Bike\n3.Truck\n4.service Vehicle");
                int p = sc.nextInt();
                if (p == 1){
                    System.out.println("What is Your Vehicle Type");
                    System.out.println("1.Compact\n2.Electrical\n3.Large");
                    int t = sc.nextInt();
                    if (t == 1) u[idx].VType = 2;
                    if (t == 3) u[idx].VType = 1;
                    if (t == 2) {
                        u[idx].VType = 3;
                        System.out.println("Do Your Car need Charging?");
                        System.out.println("1.Yes\n2.No");
                        int r = sc.nextInt();
                        if (r == 1) {
                            if (!c.check("")) {
                                System.out.println("No vacancy");
                                u[idx].filled=false;
                            }
                            else {
                                System.out.println("Please Enter Your Name");
                                u[idx].Name = sc.next();
                                u[idx].Uid = idx;
                                u[idx].sTime = Instant.now();
                                c.addVehicle("");
                                v = c.getVid();
                                u[idx].Vid = v;
                                if ((v + 1) <= 10){
                                    System.out.println("Please place your Car at " + (v + 1) % 10 + " First Floor");
                                }
                                else if ((v + 1) <= 74) {
                                    System.out.println("Please place your Car at " + (v + 1) % 25 + " Second Floor");
                                }
                                else {
                                    System.out.println("Please place your Car at " + (v + 1) % 25 + " Third Floor");
                                }
                            }
                        }
                        if (r == 2) {
                            System.out.println("Please repeat and go for Compact");
                            u[idx].filled=false;
                        }
                    }
                    if (t == 1 || t == 3) {
                        if (!c.check()) {
                            System.out.println("No Vacancy");
                            u[idx].filled=false;
                        }
                        else{
                            System.out.println("Please Enter Your Name");
                            u[idx].Name = sc.next();
                            u[idx].Uid = idx;
                            u[idx].sTime = Instant.now();
                            c.addVehicle();
                            v = c.getVid();
                            u[idx].Vid = v;
                            if ((v + 1) <= 24) {
                                System.out.println("Please place your Car at " + (v + 1) % 25 + " Ground Floor");
                            } else if ((v + 1) <= 49) {
                                System.out.println("Please place your Car at " + (v + 1) % 25 + " First Floor");
                            } else if ((v + 1) <= 74) {
                                System.out.println("Please place your Car at " + (v + 1) % 25 + " Second Floor");
                            } else {
                                System.out.println("Please place your Car at " + (v + 1) % 25 + " Third Floor");
                            }
                        }
                    }
                }
                if(p==2){
                    System.out.println("Is that Handicapped Model");
                    System.out.println("1.Yes\n2.No");
                    int yz=sc.nextInt();
                    if(yz==1){
                        u[idx].VType=5;
                        if(!bk.check("")){
                            System.out.println("NO Vacancy");
                            u[idx].filled=false;
                        }
                        else{
                            System.out.println("Please Enter Your Name");
                            String s = sc.next();
                            u[idx].Name = s;
                            u[idx].Uid = idx;
                            u[idx].sTime = Instant.now();
                            bk.addVehicle("");
                            v=bk.getVid();
                            u[idx].Vid=v;
                            System.out.println("Please Place the Bike in " + (v+1)+" Position in Ground Floor");
                        }
                    }
                    else{
                        if(!bk.check()){
                            System.out.println("NO Vacancy");
                            u[idx].filled=false;
                        }
                        else{
                            System.out.println("Please Enter Your Name");
                            String s = sc.next();
                            u[idx].Name = s;
                            u[idx].Uid = idx;
                            u[idx].sTime = Instant.now();
                            bk.addVehicle();
                            v=bk.getVid();
                            u[idx].Vid=v;
                            System.out.println("Please Place at " +v);
                        }
                    }

                }
                if(p==3){
                    if(!tk.check()){
                        System.out.println("No vacancy");
                        u[idx].filled=false;
                    }
                    else{
                        System.out.println("Please Enter Your Name");
                        String s = sc.next();
                        u[idx].Name = s;
                        u[idx].Uid = idx;
                        u[idx].sTime = Instant.now();
                        System.out.println(u[idx].sTime);
                        bk.addVehicle();
                        bk.addVehicle();
                        v =bk.getVid();
                        System.out.println("Please Place Your Truck in "+(v+1) + " Position");
                    }
                }
                if(p==4){
                    System.out.println("Please Enter the Key");
                    String s=sc.next();
                    if(sv.Password.equals(s)){
                        if(!sv.check()){
                            System.out.println("NO Vacancy");
                            u[idx].filled=false;
                        }
                        else{
                            System.out.println("Please Enter Your ID");
                            s=sc.next();
                            u[idx].Name = s;
                            u[idx].Uid = idx;
                            u[idx].sTime = Instant.now();
                            sv.addVehicle();
                            v = sv.getVid();
                            u[idx].Vid = v;
                            if(v<=24){
                                System.out.println("Please Place It in "+(v+1)%25 +" Ground Floor");
                            }
                            else{
                                System.out.println("Please Place It in "+(v+1)%25+" Ground Floor");
                            }
                        }
                    }
                    else{
                        System.out.println("Please Enter Valid Password");
                        u[idx].filled=false;
                    }
                }
                if(u[idx].filled){
                    System.out.println("Your Details");
                    System.out.println("Name       :" + u[idx].Name);
                    System.out.println("User Id    :" + (u[idx].Uid + 1));
                    System.out.println("Vehicle Id :" + (u[idx].Vid + 1));
                    System.out.println("Thank you for using Our Service");
                    Thread.sleep(5000);
                }
            }
            if (k == 2) {
                System.out.println("Please Enter Your User id");
                h = sc.nextInt();
                int idx = h - 1;
                int Vid = u[idx].Vid;
                System.out.println("Please Check Your Details");
                System.out.println("Name       :"+u[idx].Name);
                System.out.println("User Id    :"+(u[idx].Uid+1));
                System.out.println("Vehicle Id :"+(u[idx].Vid+1));
                int o = u[idx].VType;
                if(o==1) System.out.println("Vehicle Type:Large Car");
                if(o==2) System.out.println("Vehicle Type:Compact Car");
                if(o==3) System.out.println("Vehicle Type:Electric Car");
                if(o==4) System.out.println("Vehicle Type:Normal Bike");
                if(o==5) System.out.println("Vehicle Type:Handicapped Bike");
                if(o==6) System.out.println("Vehicle Type: Truck");
                if(o==7) System.out.println("Vehicle Type:Service Truck");
                System.out.println("Select the Mode of Payment");
                System.out.println("1.Offline\n2.Online");
                int g = sc.nextInt();
                if (g == 1) {
                    System.out.println("Please go through Exit-1 and pay There!!!!");
                    System.out.println("Thank You!!!!Come Again");
                }
                else {
                    u[idx].eTime = Instant.now();
                    long hrs = u[idx].hrs();
                    ui.ifOnline(o, hrs);
                    if(o==1 || o==2){
                        c.setVid(Vid);
                        c.removeVehicle(Vid);
                        u[idx].filled = false;
                    }
                    else if(o==3){
                        c.setVid(Vid);
                        c.removeVehicle(Vid," ");
                        u[idx].filled = false;
                    }
                    else if(o==4){
                        bk.setVid(Vid);
                        bk.removeVehicle(Vid);
                        u[idx].filled = false;
                    }
                    else if(o==5){
                        bk.setVid(Vid);
                        bk.removeVehicle(Vid,"");
                        u[idx].filled = false;
                    }
                    else if(o==6){
                        tk.setVid(Vid);
                        tk.removeVehicle(Vid);
                        u[idx].filled = false;
                    }
                    else if(o==7){
                        sv.setVid(Vid);
                        sv.removeVehicle(Vid);
                        u[idx].filled = false;
                    }
                }
            }
            if(k==3){
                int count=0,bCount=0,hCount=0,cCount=0,eCount=0,svCount=0,tCount=0;
                for(int i=0;i<400;i++){
                    if(u[i].filled){
                        count++;
                    }
                }
                for(int i=0;i<120;i++){
                    if(c.a[i]){
                        cCount++;
                    }
                }
                for(int i=0;i<30;i++){
                    if(c.b[i]){
                        eCount++;
                    }
                }
                for(int i=0;i<125;i++){
                    if(bk.a[i]){
                        bCount++;
                    }
                }
                for(int i=0;i<25;i++){
                    if(bk.b[i]){
                        hCount++;
                    }
                }
                for(int i=0;i<50;i++){
                    if(tk.a[i]){
                        tCount++;
                    }
                }
                for(int i=0;i<50;i++){
                    if(sv.a[i]){
                        svCount++;
                    }
                }
                System.out.println("No of Users                           : "+count);
                System.out.println("No of Cars slots Occupied             : "+cCount);
                System.out.println("No of Electric Cars slots Occupied    : "+eCount);
                System.out.println("No of Bikes slots Occupied            : "+bCount);
                System.out.println("No of H.Bikes slots Occupied          : "+hCount);
                System.out.println("No of Trucks slots Occupied           : "+tCount);
                System.out.println("No of Service Vehicles slots Occupied : "+svCount);
            }
            if(k==4){
                System.out.println("Please Enter the Password");
                int n=sc.nextInt();
                if(n==12345){
                    System.out.println("Please Enter User id");
                    int cpy=sc.nextInt();
                    cpy--;
                    System.out.println("1.To Verify \n2.Offline Payment");
                    int choice=sc.nextInt();
                    if(choice==1){
                        System.out.println("Did he Paid (Checks the EndTime)"+u[cpy].eTime);
                        System.out.println("Type 1 for true else 0");
                        int xyz=sc.nextInt();
                        hi.Verify(u[cpy].VType,xyz);
                    }
                    else {
                        hi.setEnd();
                        Instant x = hi.getEnd();
                        u[cpy].eTime = x;
                        hi.setHrs(u[cpy].hrs());
                        System.out.println("Please Check Your Details");
                        System.out.println("Name       :"+u[cpy].Name);
                        System.out.println("User Id    :"+(u[cpy].Uid+1));
                        System.out.println("Vehicle Id :"+(u[cpy].Vid+1));
                        hi.makePayment(u[cpy].VType);
                    }
                }
                else{
                    System.out.println("Get Out");
                }
            }
        }
    }
}