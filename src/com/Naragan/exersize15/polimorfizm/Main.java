package com.Naragan.exersize15.polimorfizm;

public class Main {
    public static void main(String[] args) {
        MusicStyles popMusicBand = new PopMusic();
        MusicStyles rockMusicBand= new RockMusic();
        MusicStyles classicBand= new ClassicMusic();

MusicStyles[]array=new MusicStyles[]{new PopMusic(),new RockMusic(),
        new ClassicMusic()};
for(MusicStyles musicStyles:array){
musicStyles.playMusic();

}
}
    }

