package Task1;

public class TV {
// instantiere variablerne
    boolean onOff;
    int Channel;
    int Volume;

//  laver konstruktøren
    public TV() {
        this.onOff = false; // initialisere variablerne
        this.Channel=1;
        this.Volume=20;
    }
  public void turnOn(){    // En metode der kan ændre onOff til sandt
        onOff=true;
  }
  public void setChannel(int i ){    // tjekker om tvet er tændt og sætter kanalen
      if (onOff == true) {
        this.Channel = i;
      }
  }
  public void setVolume(int i){    // tjekker om tvet er tændt og sætter volumen til en værdi
      if (onOff == true) {
        this.Volume=i;
      }
  }

  public void channelUp(){       // tjekker om tvet er tændt og skruer skifter kanal
     if (onOff == true) {
         Channel++;
      }

  }

  public void volumeUp(){
      if (onOff == true) {      // tjekker om tvet er tændt og skruer op for volumen
        Volume++;
      }
  }
}
