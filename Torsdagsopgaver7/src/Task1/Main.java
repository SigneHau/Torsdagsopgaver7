package Task1;
//Skriv en klasse, der simulerer et TV. Der skal være mulighed for at vælge kanel, volumen og tænde
//og slukke for TV. Husk at det ikke giver mening at forsøge at ændre lyd/kanal, hvis TV er slukket J
//Prøv at unit teste følgende adfærd

public class Main {
    public static void main(String[] args) {


        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        System.out.println(tv1.Volume);

        TV tv2 = new TV();
        tv2.channelUp();
        tv2.channelUp();
        tv2.turnOn();
        tv2.volumeUp();
       System.out.println(tv2.Volume + " " + tv2.Channel);

    }
}