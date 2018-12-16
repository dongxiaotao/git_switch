package com.github.nkzawa.socketio.androidchat;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.hello);
        SpannableStringBuilder mS = new SpannableStringBuilder();
        mS.append("hello");
        mS.setSpan(new ForegroundColorSpan(Color.RED), 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
        mTextView.append(mS);
        mTextView.append("\n");
    }
}
