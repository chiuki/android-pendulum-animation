package com.sqisland.android.pendulum;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends Activity {
  private View mPendulum;
  private Animation mAnimation;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    mPendulum = findViewById(R.id.pendulum);
    mAnimation = AnimationUtils.loadAnimation(this, R.animator.swinging);
  }

  @Override
  public void onResume() {
     super.onResume();
    mPendulum.startAnimation(mAnimation);
  }

  @Override
  public void onPause() {
    mPendulum.clearAnimation();
    super.onPause();
  }
}