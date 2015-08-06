package com.michael.listview.feed;

/**
 * Created with IntelliJ IDEA
 * Package name: com.michael.listview.feed
 * Author: MichaelChuCoder
 * Date: 2015-8-6
 * Time: 10:54
 * To change this template use File | Settings | File and Code Templates.
 */

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.michael.listview.R;

import java.util.ArrayList;


public class FeedMainActivity extends Activity {
    ArrayList<String> names = new ArrayList<String>();
    FlowGroupView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setData();
        view = (FlowGroupView) LayoutInflater.from(this).inflate(R.layout.activity_feed_main, null);
        for (int i = 0; i < names.size(); i++) {
            addTextView(names.get(i));
        }
        setContentView(view);
    }

    /**
     * 动态添加布局
     *
     * @param str
     */
    private void addTextView(String str) {
        TextView child = new TextView(this);
        MarginLayoutParams params = new MarginLayoutParams(MarginLayoutParams.WRAP_CONTENT, MarginLayoutParams.WRAP_CONTENT);
        params.setMargins(15, 15, 15, 15);

        child.setLayoutParams(params);
        child.setBackgroundResource(R.drawable.shape_textback);
        child.setText(str);
        child.setTextColor(Color.WHITE);
        initEvents(child);
        view.addView(child);
        // 务必要加这句
        view.requestLayout();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.feed_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            // 动态添加 view
            addTextView(names.get((int) (Math.random() * names.size())));

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * 为每个view 添加点击事件
     *
     * @param tv
     */
    private void initEvents(final TextView tv) {
        tv.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(FeedMainActivity.this, tv.getText().toString(), 0).show();
            }
        });
    }

    private void setData() {
        names.add("一");
        names.add("二二");
        names.add("三三三");
        names.add("四四四四");
        names.add("五五五五五");
        names.add("二二");
        names.add("三三三");
        names.add("一");

    }
}
