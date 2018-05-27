package com.sine.all.test;

import android.app.Activity;
import android.os.Bundle;

import com.sine.all.R;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class testActivity extends Activity {

    ServerSocket serverSocket;
    private InputStream inputStream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    class MyThread extends Thread{
        @Override
        public void run() {
            super.run();
            try {
                Socket socket=null;
                serverSocket = new ServerSocket(8000);

                while (true){
                    socket=serverSocket.accept();
                    inputStream=socket.getInputStream();

                }
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }


    void getLocalip(){

    }
}
