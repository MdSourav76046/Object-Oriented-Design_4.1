public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;
 
    public MediaAdapter(String audioType){
    
       if(audioType.equalsIgnoreCase("vlc") ){
          advancedMusicPlayer = new VlcMediaPlayer();			
          
       }else if (audioType.equalsIgnoreCase("mp4")){
          advancedMusicPlayer = new Mp4MediaPlayer();
       }	
    }
 
    @Override
    public void play(String audioType, String fileName) {
    
       if(audioType.equalsIgnoreCase("vlc")){
          advancedMusicPlayer.playVlc(fileName);
       }
       else if(audioType.equalsIgnoreCase("mp4")){
          advancedMusicPlayer.playMp4(fileName);
       }
    }
 }