class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    //Movable train = new Train();
    //Movable bus = new Bus();

    Moving train = new Train();
    Moving bus = new Bus();

    train.move();
    bus.move();
    
  }
}