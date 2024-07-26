
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    // implementing own equals method
    public boolean equals(Object compared) {
        
        //1. check if this object and compared object are referring
        //to same address(same object)
        if (this == compared) {
            return true;
        }
        
        //2. check if the compared has the same datatype as this object
        if(!(compared instanceof Song)) {
            return false;
        }
        
        //3. check if compared has the same object variables with this object.
        //but first needs to be converted
        Song convertedCompared = (Song) compared;
        
        if (this.artist.equals(convertedCompared.artist) &&
            this.name.equals(convertedCompared.name) &&
            this.durationInSeconds == convertedCompared.durationInSeconds) {
            return true;
        }
            
        return false;
    }

    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
}
