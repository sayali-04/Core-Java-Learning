public class MultipleInterfaceDemo {
    public static void main(String[] args) {
        Smartphone phone=new Smartphone();
        phone.takephoto();
        phone.playmusic();
    }
}

interface Camera{
  void takephoto();
}
interface MusicPlayer{
    void playmusic();
}
class Smartphone implements Camera,MusicPlayer{
    @Override
    public void takephoto(){
        System.out.println("Photo captured");
    }
    @Override
    public void playmusic(){
        System.out.println("Music PLaying");
    }


}