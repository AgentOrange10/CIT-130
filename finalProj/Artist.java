/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProj;

/**
 *
 * @author chad.lemasters
 */
public class Artist {
        String birth;
        String location;
        String subgenre;
        int lyricism;
        int flow;
        int instrumentals;
        int melody;
        String rapName;
        String fileName;
        String relatedArtists;
       
        
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("Artist Name:" + rapName);
            sb.append("\n");
            sb.append("Sub-Genre: " + subgenre);
            sb.append("\n");
            sb.append("Birthplace: " + location);
            sb.append("\n");
            sb.append("Birth Date: " + birth);
            sb.append("\n");
            sb.append("Lyricism Rating Out Of 10: " + lyricism);
            sb.append("\n");
            sb.append("Flow/Melody Rating Out Of 10: " + flow);
            sb.append("\n");
            sb.append("Instrumental Talent Rating Out Of 10: " + instrumentals);
            sb.append("\n");
            sb.append(relatedArtists);
            
            // toString holds ratings and related artits 
            
            return sb.toString();
        
        } // end of toString
        
        
}  // end of artist 

