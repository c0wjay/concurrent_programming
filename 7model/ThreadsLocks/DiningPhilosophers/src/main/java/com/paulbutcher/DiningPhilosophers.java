package com.paulbutcher;

// START:main
public class DiningPhilosophers {

  public static void main(String[] args) throws InterruptedException {
    Philosopher[] philosophers = new Philosopher[3];
    Chopstick[] chopsticks = new Chopstick[3];
    
    for (int i = 0; i < 3; ++i)
      chopsticks[i] = new Chopstick(i);
    for (int i = 0; i < 3; ++i) {
      philosophers[i] = new Philosopher(chopsticks[i], chopsticks[(i + 1) % 3]);
      philosophers[i].start();
    }
    for (int i = 0; i < 3; ++i)
      philosophers[i].join();
  }
}
// END:main