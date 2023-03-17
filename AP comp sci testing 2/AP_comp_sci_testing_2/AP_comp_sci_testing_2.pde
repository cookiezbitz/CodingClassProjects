Grid g;
Hedgehog h;
void setup(){
  
  g = new Grid(4,4);

  g.display();
  h = new Hedgehog(2,2);
}

void draw(){
    g.updatePosition(h);
  
}


class Hedgehog
{
  int x;
  int y;
  Hedgehog(int tempx, int tempy){
   x = tempx;
   y = tempy;
    
  }
  
}



class Grid{
int rows = 9;
int columns = 9;
Hedgehog[][] hogger;

  Grid(int tempRow, int tempcolumn){
    rows = tempRow;
    columns = tempcolumn;
    
    hogger = new Hedgehog[columns][rows];
    
  }
  
  
     void updatePosition(Hedgehog hedgehog) {
    hogger[hedgehog.x][hedgehog.y] = hedgehog;
  }
  
  void display()
  {    
  for (int i = 0; i < rows; i++)
  {
    println(" ");
    for(int j = 0; j < columns; j++)
    {
      print("[ ]"); 
      if(hogger[i][j] != null){
      print("[x]");  
        
      }
    }
    
  }
  
  }

  
}
