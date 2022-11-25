public class Moving {  
  private Movablestrategy movablestrategy;

  public void move(){
    movablestrategy.move();    
  }

  public void setmovablestrategy(Movablestrategy movablestrategy){
       this.movablestrategy = movablestrategy;
    
  }
  
}