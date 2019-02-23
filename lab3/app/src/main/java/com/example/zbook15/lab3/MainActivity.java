package com.example.zbook15.lab3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Notification;
import android.app.NotificationManager;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = getApplicationContext();


        AlertDialog.Builder DialogConf = new AlertDialog.Builder(this);
        DialogConf.setTitle("Modal");
        DialogConf.setMessage("Write a message");

        final EditText textmsg = new EditText(context);
        DialogConf.setView(textmsg);

        DialogConf.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String msg = textmsg.getText().toString();
                        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
                    }
                });

        DialogConf.setNeutralButton("Close",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "You closed the toast", Toast.LENGTH_LONG).show();
                    }
                });

        AlertDialog dialog = DialogConf.create();
        dialog.show();

        int NOTIF_ID = 123;
        Notification.Builder notifBuild = new Notification.Builder(this);
        notifBuild.setContentTitle("Lab 3");
        notifBuild.setContentText("Open new activity");

        Intent intent = new Intent(context, Notification.class);
        intent.putExtra("extra", "You just tapped the notificacion of lab 3 :)");

        PendingIntent pendint = PendingIntent.getActivity(context, 0, intent, 0);
        notifBuild.setContentIntent(pendint);

        NotificationManager notification = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notification.notify(NOTIF_ID, notifBuild.build());



    }
}
