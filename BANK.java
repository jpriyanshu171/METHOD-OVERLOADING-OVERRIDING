class bank{
    int getRateOfInterest(){
        return 0;
    }
}
class SBI extends bank{
    int getRateOfInterest(){
        return 7;
    }
}
class ICICI extends bank{
    int getRateOfInterest(){
        return 8;
    }
}
class AXIS extends bank{
    int getRateOfInterest(){
        return 9;
    }
}
public class BANK {
    public static void main(String[] args) {
        bank s=new SBI();
        bank i=new ICICI();
        bank a=new AXIS();
        System.out.println("SBI rate of interest "+s.getRateOfInterest());
        System.out.println("ICICI rate of interest "+i.getRateOfInterest());
        System.out.println("AXIS rate of interest "+a.getRateOfInterest());
    }
}
