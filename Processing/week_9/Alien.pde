class Alien
{
  protected int x;
  protected int y;
  final color ALIEN1 = color(0,255,0);
  final color ALIEN2 = color(50,100,0);
  
  Alien(int x, int y)
  {
    this.x = x;
    this.y = y;
  }
  
  void render()
  {
    fill(ALIEN1); 
    ellipse(x,y,30,30); 
    fill(ALIEN2); 
    ellipse(x,y,50,15);
  }
  
  void move()
  {
     //don't go off screen
     if(this.x < 0) this.x = width;
     if(this.y > height) this.y = 0;
     if(this.y < 0) this.y = height;
     
     
     //move at random speed
    
     int x_d = (int) (Math.random() * 10);
     int y_d = (int) (Math.random() * 40 - 20);
     
     this.x -= x_d;
     
     this.y += y_d;
     
  }
  
  int get_x()
  {
    return this.x;
  }
  
  int get_y()
  {
    return this.y;
  }
}
