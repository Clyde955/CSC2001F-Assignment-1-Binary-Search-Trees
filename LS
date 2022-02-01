import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;
 
public class LSBSTApp
{   
    int ctr= 0;
    public LSBSTApp(){
      tree = new BinarySearchTree<LSD>();
      }
    private BinarySearchTree<LSD> tree;
    
    
    public static void main( String [] args )
    {  
           
       if (args.length==3)
          (new LSBSTApp ()).printAreas (args[0], args[1], args[2]);
       else{
           LSBSTApp GETIT=new LSBSTApp();
           GETIT.printAllAreas();}

    }
  
    public void insertTree(LSD Good){
      tree.insert(Good);
      }
    
        public void TextFile()
    { 
     
    try{
        File file= new File("./Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
        Scanner gg= new Scanner(file);
        
       
        int icount= 0; 
        while(gg.hasNextLine()){
          LSD Good= new LSD(gg.nextLine());
         
                tree.insert(Good);
                icount= icount+1;
               
                }
                gg.close();
       }catch (FileNotFoundException e){
       e.printStackTrace();
       
       }}

    public void printAllAreas () 
    {
    tree.inOrder();
     TextFile();
    }
       
    public void printAreas (String S2, String D2, String T2) 
    {
   TextFile();  
    System.out.println("Areas: " + Arrays.toString((tree.find(new LSD(S2,dD2,T2)).getData()).getAreas()));
    //}
    
    }
	public void WriteText(){
		    try{
		        File TheTings = new File("./counter update.txt");
	      
		        
		         
		        //Write Content
			FileWriter Pimpin = new FileWriter(Thetings);//This is all for writing the counter update in  a text file

			Pimpin.write(Integer.toString(ctr));
		        Pimpin.close();
		        
		        
		            }
		            catch(IOException e) {
		                e.printStackTrace();
		              }
		    }
    
     
    public void CreateText(){//Creating the Counter update file
        try{
            File TheTings = new File("./counter update.txt");
            if (TheTings.createNewFile())
            {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
             
            
                }
                catch(IOException e) {
                    e.printStackTrace();
                  }
        }
        
    
} 
