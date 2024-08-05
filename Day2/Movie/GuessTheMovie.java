package  Day2.Movie;

//import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// import java.util.Scanner;
// import javax.swing.text.AbstractDocument;

public class GuessTheMovie {
    public static void main(String[] args) throws Exception{

        List<String> movies = new ArrayList<>();

        int b = (int)(Math.random()*movies.size());
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/macbook/Ilknur-1/Day2/Movie/movies.txt"))) {
            String a;
            while((a = br.readLine()) != null){
                movies.add(a);
            }
            String movie = movies.get(b);
            String dmovie = "";
                for(int i = 0; i<movie.length(); i++){
                    if(movie.charAt(i) != ' '){
                        //dmovie.charAt(++i);
                        dmovie += '_';
            }
            else{
                dmovie += ' ';
            }
        }

            System.out.println(dmovie);
            Scanner sc = new Scanner(System.in);
            String g = sc.nextLine();
            char letter;
            String d1movie = "";
            if(movie.contains(g)){
                for(int j = 0; j<movie.length(); j++){
                    letter = g.charAt(0);
                    if(movie.charAt(j) != ' '){
                    if(letter == movie.charAt(j)){
                        d1movie += letter;
                    }
                    else{
                        d1movie += '_';

                    }
                }
                else{
                    dmovie += ' ';
                }
            }
            }
            else{
                System.out.println("Wrong guess");
                    }

                System.out.println(d1movie);
                System.out.println(movie);

                System.out.println("True");

            
            //char g1 = g.charAt(0);
            
                 //char g2 = movie.charAt(j);
                    //if(g1 == g2){
                    
                    
                
                    System.out.println(movie);
                    sc.close();
                }
                
        catch(FileNotFoundException e){
            System.out.println("File not found" + e);
        }
        catch (Exception e) {
            System.out.println("Exception detected" + e);
        }
    }
    }
