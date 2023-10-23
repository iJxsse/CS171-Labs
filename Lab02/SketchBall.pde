int x=250;            // Horizontal position of ball
int direction_x=4;    // Change in horizontal position each time draw() executed
int y=150;            // Vertical position of ball
int direction_y=5;    // Change in vertical position each time draw() executed

int lives=3;          // Number of lives initialized
int score=0;          // Score counter initialized


void setup()
{
  size(400,400);                  // Create a window 400x400 pixels
}

void draw()
{
  background(255,255,255);        // Clear screen to white  
  fill(0,0,0);                    // Set fill colour to black
  rect(385,mouseY-30,20,120);     // Position paddle using mouse
  
  fill(255,0,0);
  ellipse(x,y,20,20);             // Draw red ball centred on x,y with diameter 20

  x = x + direction_x;                // New position equals old position plus change in direction
  
  y = y + direction_y;                // New position equals old position plus change in direction
  
    if(x>390) {                   // If ball hits right side of screen
      x=10;
      lives--;                    // reduce lives by one
      if(lives == 0) exit();    // if lives is zero, quit game
    }
    
    if (x>(width-10)) direction_x=-direction_x;    // If ball hits border, reverse direction
    
    if (y < 10)    direction_y=-direction_y;       // If ball hits border, reverse direction
    
    if (x < 10)    direction_x=-direction_x;       // If ball hits border, reverse direction
    
    if (y > (height-10))  direction_y=-direction_y;  // If ball hits border, reverse direction
    
    if((x>375)&&(abs(mouseY-y)<60))         // If ball has hit paddle then..
    {
      direction_x=-direction_x;             // Bounce
      score++;                              // Increase score by one
    }
  
    if (score == 5) {
      text("Keep Going!", 120, 300);
    }
  
    textSize(30);                
    fill(0,0,0);
    text("Score: "+ score, 10, 30);        // Display score
    text("Lives: " + lives,width-100, 30);   // Display lives
}
