import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class LSArrayApp
{  
   int opCount=0;
   TextF[] OJB= new TextF[2976];
   
   public static void main(String [] args)
   {
   
      if (args.length==3)
      (new LSArrayApp()).printAreas(args[0],args[1],args[2]);
      else
      (new LSArrayApp()).printAllAreas();
      
    }
    
    public void TextFile()
    {
    try{
         File TheTings=new File("./Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
         Scanner gg=new Scanner(TheTings);
         
         int crt=0;
         while(gg.hasNextLine())
         {
         
            String line=gg.nextLine();
            String[] facts=line.split(" ");//Makes an array that splits at the spaces

	    int num=line.indexOf(" ");//Gets the areas

	    String A1=line.substring(num);
            String data=facts[0];//Houses the stage, date and time

            String[] factsAG=data.split("_");//Makes an array that splits at the underscores

            String S1=factsAG[0];//Houses the stage

            String D1=factsAG[1];//Houses the date

            String T1=factsAG[2];//Houses the time

            

            
            TextF Clyde=new TextF(S1, D1, T1, A1);
            OJB[crt]=Clyde;
            
            crt++;
            }
            }
     catch(FileNotFoundException e)
           {
            e.printStackTrace();
           }
       }
            
            public void printAreas(String S2, String D2, String T2)
            {
               TextFile();
               
               for (TextF textF: OJB){
               
               opCount++;
               
               if (textF.stage.equals(S2) &&(textF.day.equals(D2))&& (textF.time.equals(T2)) ) {
               
               System.out.println(S2 +" "+ D2+" "+T2+" "+textF.areas);
               CreateText();
               WriteText();
               break;
               
               }
               }
           }
           
           public void printAllAreas()
           {
           TextFile();
           
           for (TextF textF:OJB){
           
           System.out.println(textF.stage +" "+ textF.day+" "+ textF.time+" "+textF.areas);
           }
          }
          
       public void CreateText(){
       try{
         File TheTings= new File("./counter update.txt");
         
         if (TheTings.createNewFile())
         {
            System.out.println("File has been created!");
            }
         else{
            System.out.println("File with that name already exists");
            }
            }
       catch(IOException e){
         e.printStackTrace();
         }
      }
      
      public void WriteText(){
      
      try{
         File TheTings=new File("./counter update.txt");
         
         FileWriter Pimpin= new FileWriter(TheTings);
         writer.Pimpin(Integer.toString(opCount));
         Pimpin.close();
      }
      
      
      catch(IOException e)
      {
         e.printStackTrace();
      }
      
      }
      }
      
      
      class TextF
      {
         String stage;
         String day;
         String time;
         String areas;
         
     public TextF(String stage, String day, String time, String areas){
     this.stage=stage;
     this.day=day;
     this.time=time;
     this.areas=areas;
     
     }
     
     public String ToString()
     {
     return stage+" "+day+" "+time;
     }
     
     }
