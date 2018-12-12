package finalProj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class TheArtOfHipHop {

    public static void main(String[] args) {

      
        Artist cudi = new Artist();

        cudi.birth = "January 30, 1984";
        cudi.location = "Cleveland, Ohio";
        cudi.subgenre = "Alternative Rap";
        cudi.lyricism = 10;
        cudi.flow = 10;
        cudi.instrumentals = 10;
        cudi.rapName = "Kid Cudi";
        cudi.fileName = "CuDi.wav";
        cudi.relatedArtists = "Related Artists: 1: Mac Miller 2: A$AP Rocky "
                + " 3: King Chip 4: Travis Scott 5: Wiz Khalifa";
        
        // artist profile 

        Artist nas = new Artist();
        nas.birth = "September 14, 1973";
        nas.location = "Crown Heights, New York City";
        nas.subgenre = "Conscious Rap";
        nas.lyricism = 10;
        nas.flow = 10;
        nas.instrumentals = 10;
        nas.rapName = "Nas";
        nas.fileName = "nas.wav";
        nas.relatedArtists = "Related Artists: 1: J Cole, 2: Mos Def, 3: Jay Z, "
                + "4: Lauryn Hill, 5: Lil Wayne";



        Artist pump = new Artist();
        pump.birth = "August 17, 2000";
        pump.location = "Miami, Florida";
        pump.subgenre = "Mumble Rap";
        pump.lyricism = -5;
        pump.flow = 1;
        pump.instrumentals = 7;
        pump.rapName = "Lil Pump";
        pump.fileName = "pump.wav";
        pump.relatedArtists = "Related Artists: 1: Lil Yachty, 2: Smokepurpp, "
                + " 3: Lil Uzi Vert, 4: 6ix9ine, 5: Lil Xan";



        Artist k = new Artist();
        k.birth = "June 17, 1987";
        k.location = "Compton, California";
        k.subgenre = "Conscious Hip Hop";
        k.lyricism = 10;
        k.flow = 10;
        k.instrumentals = 9;
        k.rapName = "Kendrick Lamar";
        k.fileName = "k.wav";
        k.relatedArtists = "Related Artists: 1: Ab-Soul, 2: ScHoolboy Q, "
                + "3: Jay Rock, 4: Big K.R.I.T., 5: Vince Staples";

        System.out.println("\n");

        Artist cole = new Artist();

        cole.birth = "January 28, 1985";
        cole.location = "Fayetteville, North Carolina";
        cole.subgenre = "Conscious Hip Hop";
        cole.lyricism = 10;
        cole.flow = 10;
        cole.instrumentals = 9;
        cole.rapName = "J. Cole";
        cole.fileName = "cole.wav";
        cole.relatedArtists = "Related Artists: 1: Bas, 2: Earl Sweatshirt, "
                + "3: Cozz, 4: J.I.D., 5: Logic";



        Artist ocean = new Artist();

        ocean.birth = "October 28, 1987";
        ocean.location = "Long Beach, California";
        ocean.subgenre = "Alternative R&B, Soul";
        ocean.lyricism = 9;
        ocean.melody = 10;
        ocean.instrumentals = 10;
        ocean.rapName = "Frank Ocean";
        ocean.fileName = "ocean.wav";
        ocean.relatedArtists = "Related Artists: 1: Daniel Caesar, 2: Brent Faiyaz, "
                + "3: Odie, 4: The Weeknd, 5: Majid Jordan";



        Artist brown = new Artist();

        brown.birth = "May 5, 1989";
        brown.location = "Tappahannock, VA";
        brown.subgenre = "Alternative R&B, Soul";
        brown.lyricism = 9;
        brown.melody = 10;
        brown.instrumentals = 10;
        brown.rapName = "Chris Brown";
        brown.fileName = "brown.wav";
        brown.relatedArtists = "Related Artists: 1: Miguel, 2: Trey Songz, "
                + "3: Partynextdoor, 4: Ne-Yo, 5: Usher ";



        Artist biggie = new Artist();

        biggie.birth = "May 21, 1972,";
        biggie.location = "Brooklyn, New York City, NY";
        biggie.subgenre = "Conscious Hip Hop";
        biggie.lyricism = 12;
        biggie.flow = 10;
        biggie.instrumentals = 10;
        biggie.rapName = "The Notorious B.I.G.";
        biggie.fileName = "biggie.wav";
        biggie.relatedArtists = "Related Artists: 1: Rakim, 2: Tupac, "
                + "3: Big Daddy Kane, 4: Slick Rick, 5: Scarface";



        LinkedList<Artist> al = new LinkedList<>();
        al.add(biggie);
        al.add(cudi);
        al.add(nas);
        al.add(pump);
        al.add(k);
        al.add(cole);
        al.add(ocean);
        al.add(brown);
        
        Scanner s = new Scanner(System.in); 
        System.out.println("Choose an Artist From Below");
        System.out.println(" 0: Notorious B.I.G. \n 1: Kid CuDI \n 2: Nas \n"
                + " 3: Lil Pump \n 4: Kendrick Lamar \n 5: J. Cole \n "
                + "6: Frank Ocean \n 7: Chris Brown" );
        int artistChoice = s.nextInt();
        Artist slctd;
        try {
        slctd = al.get(artistChoice);  
            System.out.println(slctd.toString());
        playSong(slctd);
        } catch (IndexOutOfBoundsException ex) {
            System.out.print("index to high");
        }
        // scanner and print line
       
          
    }//Close Main

    public static void playSong(Artist a) {

        String fileName = a.fileName;
        String Path = "C:\\Users\\chad.lemasters\\Documents\\NetBeansProjects\\cit130\\src\\finalProj\\soundfiles\\" + fileName;
        try {
                InputStream in = new FileInputStream(Path);
                AudioStream sound = new AudioStream(in);
                AudioPlayer.player.start(sound);
            } catch(FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        
    }// end of play song 
    
    
}// end of Art Of Hip-Hop
