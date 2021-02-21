package com.example.pcremote;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client extends AsyncTask<Void,Void,Void> {

    String type;
    String ip_address = "192.168.0.104";

    Client(String t){
        type = t;
    }

    @Override
    protected Void doInBackground(Void... params) {
        if(type == "shutdown")
        {
            try {
                Socket cli = new Socket(ip_address, 8080);
                OutputStream outputStream = cli.getOutputStream();
                DataOutputStream out = new DataOutputStream(outputStream);

                out.writeBytes("shutdown");
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        else if(type == "restart")
        {
            try {
                Socket cli = new Socket(ip_address, 8080);
                OutputStream outputStream = cli.getOutputStream();
                DataOutputStream out = new DataOutputStream(outputStream);

                out.writeBytes("restart");
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        else if(type == "music")
        {
            try {
                Socket cli = new Socket(ip_address, 8080);
                OutputStream outputStream = cli.getOutputStream();
                DataOutputStream out = new DataOutputStream(outputStream);

                out.writeBytes("music");
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        return null;
    }


}
