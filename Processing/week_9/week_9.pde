PImage background; 
int x=0; //global variable background location 
Defender player;
ArrayList<Alien> aliens;
int counter;
int score;
boolean gameMode = true;

void setup()
{
  size(800,400); 
  background = loadImage("spaceBackground.jpg"); 
  background.resize(width,height);
  player = new Defender(50, height/2);
  aliens = new ArrayList<Alien>();
  aliens.add(new Alien(400, height/2));
  aliens.add(new Alien(600, height/2));
  counter = 0;
}

void draw ()
{
  if(gameMode == true)
  {
    image(background, x, 0); //draw background twice adjacent 
    image(background, x+background.width, 0); 
    x -=4; 
    if(x == -background.width) 
      x=0; //wrap background
      
    player.render();
    
    for(Alien alien : aliens)
    {
      alien.render();
      alien.move();
      detect_collision_possible(alien);
    }
    
    
    // add more aliens every 15 seconds
    if(counter == 1000)
    {
      counter = 0;
      aliens.add(new Alien(600, height/2));
    }
    
    counter++;
  }
  else
  {
    end_game();
  }
}

void detect_collision_possible(Alien alien)
{
  int alien_x = alien.get_x();
  int player_x = player.get_x();
  
  if(alien_x >= player_x+60) return;
  
  int player_y = player.get_y();
  int alien_y = alien.get_y();
  
  if(alien_y >= player_y && alien_y+30 <= player_y+60) collision_detected();  
}

void collision_detected()
{
  gameMode = false;
}

void end_game()
{
  background(255,255,255);
  text("GAME OVER", width/2, height/2);
  noLoop();
}


void keyPressed()
{
  if ( key == CODED )
  {
    switch(keyCode)
    {
      case UP: player.move(-8);
        break;
      case DOWN: player.move(8);
        break;
      default:  
    }
  }
}
