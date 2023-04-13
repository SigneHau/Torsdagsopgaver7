package Task1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class TVTest {
    TV tv1 = new TV();
    TV tv2 = new TV();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);


        tv2.channelUp();
        tv2.channelUp();
        tv2.turnOn();
        tv2.volumeUp();
    }

    @org.junit.jupiter.api.Test
    void turnOn() {
        assertEquals(true, tv1.onOff);  // tester om fjernsynene er tændt
        assertEquals(true, tv2.onOff);
    }

    @org.junit.jupiter.api.Test
    void setChannel() {
        assertEquals(30,tv1.Channel);     // tester om kanal er sat til 30
    }

    @org.junit.jupiter.api.Test
    void setVolume() {
        assertEquals(3,tv1.Volume);       // tester om lyden er sat til 3

    }

    @org.junit.jupiter.api.Test
    void channelUp() {
        assertEquals(1,tv2.Channel);      // tester om koden har taget højde for at tvet er tændt
    }

    @org.junit.jupiter.api.Test
    void volumeUp() {                              // tester om den er skruet 1 op
        assertEquals(21,tv2.Volume);
    }
}