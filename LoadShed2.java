public class LoadShed2{
    String stage;
    String day;
    String time;
    String areas;
    
public LoadShed2(String stage,String day, String time, String areas){
    this.stage=stage;
   this.day= day;
    this.time= time;
    this.areas= areas; 
}
public String getStage()
{
    return this.stage;

}
public String getday()
{
    return this.day;
    
}
public String getTime()
{
    return this.time;
    
}
public void setStage(String stage)
{
     this.stage= stage;

}
public void setday(String day)
{
    this.day= day;
    
}
public void setTime(String time)
{
    this.time= time;
    
}
   public String ToString()
   {
   return stage+" "+day+" "+time+" "+areas;
   }     
   
}