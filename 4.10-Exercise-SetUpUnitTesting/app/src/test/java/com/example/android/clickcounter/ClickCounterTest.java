package com.example.android.clickcounter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilumer on 17-5-25.
 */
public class ClickCounterTest {

  ClickCounter clickCounter;


  @Before
  public void setup(){
    clickCounter = new ClickCounter();
  }

  @Test public void increment() throws Exception {
    int oldValue = clickCounter.getCount();
    clickCounter.increment();
    Assert.assertEquals(oldValue+1,clickCounter.getCount());
  }

  @Test public void getCount() throws Exception {
    Assert.assertEquals(0,clickCounter.getCount());
  }
}