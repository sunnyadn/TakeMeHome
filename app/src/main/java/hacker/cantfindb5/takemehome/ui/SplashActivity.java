package hacker.cantfindb5.takemehome.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;

import com.isnc.facesdk.SuperID;

import hacker.cantfindb5.takemehome.R;

/**
 * This is a file created by sunny on 5/21/16 for TakeMeHome
 * Contact sunny via sunny@mogara.org for cooperation.
 */
public class SplashActivity extends Activity {
    private RelativeLayout rootLayout;

    private static final int sleepTime = 2000;

    @Override
    protected void onCreate(Bundle arg0) {
        setContentView(R.layout.activity_splash);
        super.onCreate(arg0);
        SuperID.initFaceSDK(this);
        rootLayout = (RelativeLayout) findViewById(R.id.splash_root);

        AlphaAnimation animation = new AlphaAnimation(0.3f, 1.0f);
        animation.setDuration(1500);
        rootLayout.startAnimation(animation);
    }

    @Override
    protected void onStart() {
        super.onStart();

        new Thread(new Runnable() {
            public void run() {
                long start = System.currentTimeMillis();
                long costTime = System.currentTimeMillis() - start;

                if (sleepTime - costTime > 0) {
                    try {
                        Thread.sleep(sleepTime - costTime);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                startActivity(new Intent(SplashActivity.this, CompareActivity.class));
                finish();
            }
        }).start();
    }
}
