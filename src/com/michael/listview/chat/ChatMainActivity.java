package com.michael.listview.chat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.michael.listview.R;
import com.michael.listview.feed.FeedMainActivity;

import java.util.ArrayList;
import java.util.List;


public class ChatMainActivity extends Activity {

    private ListView lvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_main);

        lvData = (ListView) findViewById(R.id.lv_data);

        lvData.setAdapter(getAdapter());

        lvData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(ChatMainActivity.this, FeedMainActivity.class));
            }
        });
    }

    private BaseAdapter getAdapter() {

        return new ChatAdapter(this, getMyData());
    }

    private List<Message> getMyData() {

        List<Message> msgList = new ArrayList<Message>();
        Message msg;
        msg = new Message();
        msg.setType(ChatAdapter.VALUE_LEFT_TEXT);
        msg.setValue("100");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_TIME_TIP);
        msg.setValue("2014-15-23 下午2:23");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_RIGHT_TEXT);
        msg.setValue("99");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_LEFT_TEXT);
        msg.setValue("98");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_TIME_TIP);
        msg.setValue("2014-15-23 下午2:25");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_RIGHT_TEXT);
        msg.setValue("97");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_RIGHT_TEXT);
        msg.setValue("96");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_LEFT_TEXT);
        msg.setValue("95");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_TIME_TIP);
        msg.setValue("2014-15-23 下午3:25");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_RIGHT_TEXT);
        msg.setValue("94");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_LEFT_IMAGE);
        msg.setValue("93");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_LEFT_TEXT);
        msg.setValue("92");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_LEFT_TEXT);
        msg.setValue("91");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_LEFT_IMAGE);
        msg.setValue("0");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_RIGHT_TEXT);
        msg.setValue("1");
        msgList.add(msg);


        msg = new Message();
        msg.setType(ChatAdapter.VALUE_LEFT_IMAGE);
        msg.setValue("2");
        msgList.add(msg);


        msg = new Message();
        msg.setType(ChatAdapter.VALUE_LEFT_TEXT);
        msg.setValue("3");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_LEFT_AUDIO);
        msg.setValue("4");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_LEFT_TEXT);
        msg.setValue("5");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_RIGHT_TEXT);
        msg.setValue("6");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_LEFT_TEXT);
        msg.setValue("7");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_RIGHT_TEXT);
        msg.setValue("8");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_RIGHT_IMAGE);
        msg.setValue("9");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_LEFT_TEXT);
        msg.setValue("10");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_RIGHT_TEXT);
        msg.setValue("11");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_LEFT_TEXT);
        msg.setValue("12");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_RIGHT_TEXT);
        msg.setValue("13");
        msgList.add(msg);

        msg = new Message();
        msg.setType(ChatAdapter.VALUE_LEFT_TEXT);
        msg.setValue("14");
        msgList.add(msg);
        return msgList;

    }


}

