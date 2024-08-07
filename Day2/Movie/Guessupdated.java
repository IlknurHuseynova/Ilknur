package Day2.Movie;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guessupdated {
    public static void main(String[] args) throws Exception{
        List<String> movies = new ArrayList<>();
        int chances = 10;
        int wrong = 0;
        String wwords = "";
        int b = (int)(Math.random()*10);
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/macbook/Ilknur-1/Day2/Movie/movies.txt"))) {
            String a;
            while((a = br.readLine()) != null){
                movies.add(a);
            }
            String movie = movies.get(b);
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<movie.length(); i++){
                if(movie.charAt(i) != ' '){
                    sb.append('_');
        }
        else{
            sb.append(' ');
        }
}
        
        Scanner sc = new Scanner(System.in);
            while(chances != 0){
                System.out.print("You are guessing: ");
        System.out.println(sb);
                String g = sc.nextLine();
                if(movie.contains(g)){
                    for(int j = 0; j<movie.length(); j++){
                        if(g.charAt(0) == movie.charAt(j)){
                        sb.setCharAt(j, g.charAt(0));
                        }
            }
}
else{
    --chances;
    
    if(wwords.contains(g)){
        System.out.println("You have guessed (" + wrong + ") wrong letters: " + wwords);

        continue;
    }
    else{
    wwords += g.charAt(0);
    wwords += ' ';
    }
    ++wrong;
    System.out.println("You have guessed (" + wrong + ") wrong letters: " + wwords);
}


String d = sb.toString();
if(d.equals(movie)){
    System.out.println("You win!");
    System.out.println("You have guessed '" + movie + "' correctly!");
    break;
}
}
if(chances==0){
    System.out.println("You could not win");
    System.out.println("The movie was '" + movie + "'.");
}
sc.close();
}
catch(Exception e){
    System.out.println("e");
}
}
}