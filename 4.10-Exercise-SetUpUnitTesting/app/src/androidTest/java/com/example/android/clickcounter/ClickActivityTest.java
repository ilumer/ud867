package com.example.android.clickcounter;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Created by ilumer on 17-5-25.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ClickActivityTest {

  @Rule
  public ActivityTestRule<ClickActivity> clickActivityTestRule = new ActivityTestRule<>(ClickActivity.class);

  @Test
  public void testOnclick(){

    onView(withId(R.id.click_count_text_view)).check(matches(withText("0")));

    onView(withId(R.id.click_button))
        .perform(click());

    onView(withId(R.id.click_count_text_view)).check(matches(withText("1")));
  }
}