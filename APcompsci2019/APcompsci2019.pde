void setup() {

  StepTracker  tr = new StepTracker(10000);
  println(tr.activeDays());

  tr.addDailySteps(2000); // new day w/ 2000 steps
  tr.addDailySteps(4000);
    println(tr.averageSteps());
  tr.addDailySteps(13000);


  println(tr.activeDays()); // prints 1
  println(tr.averageSteps());
}

void draw() {
}


class StepTracker {
  int x = 0;
  int days = 0;
  int totalsteps = 0;
  int averagesteps = 0;
  int activeday = 0;
  int stepFreshold = 0;
  
  StepTracker(int stepThreashold) {
    stepFreshold = stepThreashold;
  }

  void addDailySteps(int dailysteps) {

    days++;
    if(dailysteps > stepFreshold){
      activeday++;
    }
    totalsteps += dailysteps;
  }

  float averageSteps() {
  averagesteps = totalsteps/days;
  

    return averagesteps;
  }
  
  
  int activeDays(){
   return activeday;
    
    
  }
}
