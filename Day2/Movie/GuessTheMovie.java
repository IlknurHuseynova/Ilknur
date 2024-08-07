// package  Day2.Movie;

// //import java.io.BufferedInputStream;
// import java.io.BufferedReader;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;
// // import java.util.Scanner;
// // import javax.swing.text.AbstractDocument;

// public class GuessTheMovie {
//     public static void main(String[] args) throws Exception{

//         List<String> movies = new ArrayList<>();

//         int b = (int)(Math.random()*movies.size());
//         try (BufferedReader br = new BufferedReader(new FileReader("/Users/macbook/Ilknur-1/Day2/Movie/movies.txt"))) {
//             String a;
//             while((a = br.readLine()) != null){
//                 movies.add(a);
//             }
//             String movie = movies.get(b);
//             String underlined = "";
//                 for(int i = 0; i<movie.length(); i++){
//                     if(movie.charAt(i) != ' '){
//                         //dmovie.charAt(++i);
//                         underlined += '_';
//             }
//             else{
//                 underlined += ' ';
//             }
//         }

//             System.out.println(underlined);
            
//             char letter;
//             int chances = 10;
//             String updated = "";

//             Scanner sc = new Scanner(System.in);
//             while(chances != 0){
//             String g = sc.nextLine();
//             if(movie.contains(g)){
//                 for(int j = 0; j<movie.length(); j++){
//                     letter = g.charAt(0);
//                     if(movie.charAt(j) == ' '){
//                         updated += ' ';
//                     }

//                     else{
//                     if(movie.charAt(j) != ' '){
//                     if(letter == movie.charAt(j)){
//                         updated += letter;
//                     }
//                     else{
//                         updated += '_';
//                     }
//                 }
//                 underlined.replace('_', letter);
//             }


//             }
            
//             //finalguess += updated);
//             System.out.println(underlined);
//         }
        
//             else{
//                 --chances;
//                 System.out.println("Wrong guess");
//                 System.out.println(chances + " guesses left");
//             }
//         }
//         sc.close();

        
        
                
//                 System.out.println(movie);

//                 System.out.println("True");

            
//             //char g1 = g.charAt(0);
            
//                  //char g2 = movie.charAt(j);
//                     //if(g1 == g2){
                    
                    
                
//                     System.out.println(movie);
                    
//                 }
                
//         catch(FileNotFoundException e){
//             System.out.println("File not found" + e);
//         }
//         catch (Exception e) {
//             System.out.println("Exception detected" + e);
//         }
//     }
//     }
