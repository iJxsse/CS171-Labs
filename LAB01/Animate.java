// Writing a program that animates a small object of my own design.

PShape sub, end1, end2, mainBody, window1, window2, window3, window4, lookout1, lookout2, lookout3, lookout4, top;

void setup() {
  
  size (900,600);
  
  // creating shape to combine all primitive shapes
  sub = createShape(GROUP);

  fill (57,4,4);
  end1 = createShape(ELLIPSE, 225.5,292.5,123,123);

  fill (57,4,4);
  end2 = createShape(ELLIPSE, 630.5,292.5,123,123);

  fill(172,14,14);
  mainBody = createShape(RECT, 230,230,400,125);

  fill(213,222,129);
  window1 = createShape(ELLIPSE, 280,284,45,45);
  window2 = createShape(ELLIPSE, 380,284,45,45);
  window3 = createShape(ELLIPSE, 480,284,45,45);
  window4 = createShape(ELLIPSE, 580,284,45,45);

  fill(74,7,102);
  lookout1 = createShape(RECT, 320,125,7,70);
  lookout2 = createShape(RECT, 370,125,7,70);

  fill(74,7,102);
  lookout3 = createShape(ELLIPSE, 374,140.5,15,15);
  lookout4 = createShape(ELLIPSE, 324,140.5,15,15);

  fill(40,5,5);
  top = createShape(RECT, 290,180,110,50);

  sub.addChild(end1);
  sub.addChild(end2);
  sub.addChild(mainBody);
  sub.addChild(window1);
  sub.addChild(window2);
  sub.addChild(window3);
  sub.addChild(window4);
  sub.addChild(lookout1);
  sub.addChild(lookout2);
  sub.addChild(lookout3);
  sub.addChild(lookout4);
  sub.addChild(top);
}

void draw() {
  
    background (204);
    translate (frameCount%600,20);
    shape(sub);
    
    textSize(50);
    fill(0,0,0);
    text("Submarine", 300, 80);
}
