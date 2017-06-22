package chao.kaoshit.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.widget.TextView;

import chao.kaoshit.R;

/**
 * Created by Chao on 2017/6/15.
 */

/**
 *
 * 倒计时页面
 */

public class ReplaseActivity extends Activity {
    private TextView text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.replase_activity);
        text = (TextView) findViewById(R.id.text);
        countDownTimer.start();

    }

    private CountDownTimer countDownTimer = new CountDownTimer(3000, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            text.setText("倒计时还剩" + millisUntilFinished / 1000 + "miao");
        }

        @Override
        public void onFinish() {
            startActivity(new Intent(ReplaseActivity.this, RegistActicity.class));
        }
    };

}





