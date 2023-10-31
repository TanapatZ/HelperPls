/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spoti;

public class Song2 {

    private final String name;
    private final String Artist;
    private final double duration;
    private boolean isLike = false;
    private Song2 next;

    
    public Song2(String name, String Artist, double duration) {
        this.name = name;
        this.Artist = Artist;
        this.duration = convertTominius(duration);
    }

    public static double convertTominius(double duration) {
        return ((int) duration / 60) + (duration % 60) / 100;
    }

    public static Song2 ListSong() {
        return new Song2("", "", 0);
    }

    public boolean addSong(String name, String Artist, double duration) {
        if (name.isBlank() || Artist.isBlank() || duration < 0) {
            return false;
        }
        Song2 current = this;
        while (current.next != null) {
            current = current.next;
            if (current.name.equals(name) && current.Artist.equals(Artist)) {
                return false;
            }
        }
        current.next = new Song2(name,Artist,convertTominius(duration));
        return true;
    }
    public void setLike(){
        isLike = isLike != true;
    
    }
    public String SameArt(String Artist){
    StringBuilder sb = new StringBuilder();
        sb.append("Song list :");
    Song2 current = this;
    while (current.next != null) {
            current = current.next;
            if (current.Artist.equals(Artist)) {
                sb.append("name  :").append(current.name);
            sb.append("  Artist  :").append(current.Artist);
            sb.append("  duration  :").append(current.duration);
            sb.append("  islike  :").append(current.isLike).append("\n");
            }
        }
    return sb.toString();
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Song list :");
        Song2 current = this;
        while(current.next != null){
        sb.append("name  :").append(current.name);
        sb.append("  Artist  :").append(current.Artist);
        sb.append("  duration  :").append(current.duration);
        sb.append("  islike  :").append(current.isLike).append("\n");
        current = current.next;  
        }
        return sb.toString();
    }
    
}
