package spoti;


public final class Song {
  private final String name;
  private final String artis;
  private final double duration;
  private boolean isLike = false;

    public Song(String name, String artis, double duration) {
        this.name = name;
        this.artis = artis;
        this.duration =  ((int) (duration/60))+(duration%60)/100;
        
        
   }

    public String getName() {
        return name;
    }

    public String getArtis() {
        return artis;
    }

    public double getDuration() {
        return duration;
    }

    public boolean isIsLike() {
        return isLike;
    }
    public void setLike(){
        isLike = isLike != true;
    
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("List {");
        sb.append("name :").append(name).append(" / ");
        sb.append("artis :").append(artis).append(" / ");
        sb.append("duration :").append(duration).append("/");
        sb.append("Like :").append(isLike);
        
        
        sb.append("}");
        return sb.toString();
    }

    
    
}
