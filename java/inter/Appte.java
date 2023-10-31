/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package inter;

import spoti.Song;
import spoti.Song2;
/**
 *
 * @author tanapatkrowattanajaroenkit
 */
public class Appte {

    public static void main(String[] args) {
       test();
       addTest();
    }
    public static void test(){
    Song a = new Song("danny","sarw",125);
        a.setLike();
        System.out.println(a.toString());
        
    } 
    public static void addTest(){
        Song2 a = Song2.ListSong();
        a.addSong("sape of me", "acww", 360);
        a.addSong("imagine", "acww", 360);
        a.addSong("sape of me", "avici", 360);
        a.addSong("call the wild", "paparize", 360);
        a.addSong("sape of me", "acww", 360);
        System.out.println(a.toString());
        System.out.println(a.SameArt("acww"));
        
    }
}
