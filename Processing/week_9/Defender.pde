class Defender
{
  
  protected int x;
  protected int y;
  
  Defender(int x, int y)
  {
    this.x = x;
    this.y = y;
  }
  
  void render()
  {
    fill(255,0,0); 
    rect(x,y,50,20); 
    triangle(x+50,y,x+50,y+20,x+60,y+10); 
    fill(0,0,100); 
    rect(x,y-10,20,10);
  }
  
  void move(int y)
  {
    this.y += y;
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
