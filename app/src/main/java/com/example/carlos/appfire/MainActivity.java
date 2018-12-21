package com.example.carlos.appfire;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;

import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private final String CHANNEL_ID = "personal_notifications";
    private final int mNotificationId= 001;

    private GifImageView gifImageView;
    private ProgressBar progressBar;
    private String gif;
    Handler handler = new Handler();
    private int tempo;

    //Método com as trocas de gifs e mensagem
    private void changeGif (int tempo){

        String titulo;
        String texto;

        //Mais Teste
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, CHANNEL_ID);

        switch (tempo){
            case 6:

                gif = "Fire6hp.gif";
                try{
                    titulo = "Cuide da chama!";
                    texto = "A chama está alta, mantenha ela assim!";

                    //Teste metodo

                    Intent resultIntent = new Intent(this, MainActivity.class);
                    PendingIntent resultPendingIntent = PendingIntent.getActivity(this,1,resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);

                    mBuilder = mBuilder.setContentTitle(titulo);
                    mBuilder = mBuilder.setContentText(texto);
                    mBuilder = mBuilder.setSmallIcon(R.mipmap.ic_launcher_ress);
                    mBuilder = mBuilder.setAutoCancel(true);
                    mBuilder = mBuilder.setWhen(System.currentTimeMillis());
                    mBuilder = mBuilder.setLargeIcon(BitmapFactory.decodeResource(this.getResources(),
                            R.mipmap.ic_launcher_ress));
                    mBuilder = mBuilder.setVibrate(new long[] { 1000, 1000 });
                    mBuilder = mBuilder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
                    mBuilder = mBuilder.setContentIntent(resultPendingIntent);


                    NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                    notificationManager.notify(mNotificationId, mBuilder.build());
                    //Fim teste metodo

                    InputStream inputStream = getAssets().open(gif);
                    byte[] bytes = IOUtils.toByteArray(inputStream);
                    gifImageView.setBytes(bytes);
                    gifImageView.startAnimation();
                }
                catch (IOException ex){

                }
                break;

            case 5:

                gif = "Fire5hp.gif";
                try{
                    titulo = "Cuide da chama 2!";
                    texto = "A chama está se apagando, mantenha a chama alta!";

                    //Teste metodo
                    Intent resultIntent = new Intent(this, MainActivity.class);
                    PendingIntent resultPendingIntent = PendingIntent.getActivity(this,1,resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);

                    mBuilder = mBuilder.setContentTitle(titulo);
                    mBuilder = mBuilder.setContentText(texto);
                    mBuilder = mBuilder.setSmallIcon(R.mipmap.ic_launcher_ress);
                    mBuilder = mBuilder.setAutoCancel(true);
                    mBuilder = mBuilder.setWhen(System.currentTimeMillis());
                    mBuilder = mBuilder.setLargeIcon(BitmapFactory.decodeResource(this.getResources(),
                            R.mipmap.ic_launcher_ress));
                    mBuilder = mBuilder.setVibrate(new long[] { 1000, 1000 });
                    mBuilder = mBuilder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
                    mBuilder = mBuilder.setContentIntent(resultPendingIntent);


                    NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                    notificationManager.notify(mNotificationId, mBuilder.build());
                    //Fim teste metodo

                    InputStream inputStream = getAssets().open(gif);
                    byte[] bytes = IOUtils.toByteArray(inputStream);
                    gifImageView.setBytes(bytes);
                    gifImageView.startAnimation();
                }
                catch (IOException ex){

                }
                break;

            case 4:

                gif = "Fire4hp.gif";
                try{
                    titulo = "Cuide da chama 3!";
                    texto = "A chama está quase no fim, não deixe ela apagar!";

                    //Teste metodo
                    Intent resultIntent = new Intent(this, MainActivity.class);
                    PendingIntent resultPendingIntent = PendingIntent.getActivity(this,1,resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);

                    mBuilder = mBuilder.setContentTitle(titulo);
                    mBuilder = mBuilder.setContentText(texto);
                    mBuilder = mBuilder.setSmallIcon(R.mipmap.ic_launcher_ress);
                    mBuilder = mBuilder.setAutoCancel(true);
                    mBuilder = mBuilder.setWhen(System.currentTimeMillis());
                    mBuilder = mBuilder.setLargeIcon(BitmapFactory.decodeResource(this.getResources(),
                            R.mipmap.ic_launcher_ress));
                    mBuilder = mBuilder.setVibrate(new long[] { 1000, 1000 });
                    mBuilder = mBuilder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
                    mBuilder = mBuilder.setContentIntent(resultPendingIntent);


                    NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                    notificationManager.notify(mNotificationId, mBuilder.build());
                    //Fim teste metodo


                    InputStream inputStream = getAssets().open(gif);
                    byte[] bytes = IOUtils.toByteArray(inputStream);
                    gifImageView.setBytes(bytes);
                    gifImageView.startAnimation();
                }
                catch (IOException ex){

                }
                break;

            case 3:

                gif = "Fire3hp.gif";
                try{
                    titulo = "Cuide da chama 3!";
                    texto = "A chama está quase no fim, não deixe ela apagar!";

                    //Teste metodo
                    Intent resultIntent = new Intent(this, MainActivity.class);
                    PendingIntent resultPendingIntent = PendingIntent.getActivity(this,1,resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);

                    mBuilder = mBuilder.setContentTitle(titulo);
                    mBuilder = mBuilder.setContentText(texto);
                    mBuilder = mBuilder.setSmallIcon(R.mipmap.ic_launcher_ress);
                    mBuilder = mBuilder.setAutoCancel(true);
                    mBuilder = mBuilder.setWhen(System.currentTimeMillis());
                    mBuilder = mBuilder.setLargeIcon(BitmapFactory.decodeResource(this.getResources(),
                            R.mipmap.ic_launcher_ress));
                    mBuilder = mBuilder.setVibrate(new long[] { 1000, 1000 });
                    mBuilder = mBuilder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
                    mBuilder = mBuilder.setContentIntent(resultPendingIntent);


                    NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                    notificationManager.notify(mNotificationId, mBuilder.build());
                    //Fim teste metodo


                    InputStream inputStream = getAssets().open(gif);
                    byte[] bytes = IOUtils.toByteArray(inputStream);
                    gifImageView.setBytes(bytes);
                    gifImageView.startAnimation();
                }
                catch (IOException ex){

                }
                break;

            case 2:

                gif = "Fire2hp.gif";
                try{
                    titulo = "Cuide da chama 3!";
                    texto = "A chama está quase no fim, não deixe ela apagar!";

                    //Teste metodo
                    Intent resultIntent = new Intent(this, MainActivity.class);
                    PendingIntent resultPendingIntent = PendingIntent.getActivity(this,1,resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);

                    mBuilder = mBuilder.setContentTitle(titulo);
                    mBuilder = mBuilder.setContentText(texto);
                    mBuilder = mBuilder.setSmallIcon(R.mipmap.ic_launcher_ress);
                    mBuilder = mBuilder.setAutoCancel(true);
                    mBuilder = mBuilder.setWhen(System.currentTimeMillis());
                    mBuilder = mBuilder.setLargeIcon(BitmapFactory.decodeResource(this.getResources(),
                            R.mipmap.ic_launcher_ress));
                    mBuilder = mBuilder.setVibrate(new long[] { 1000, 1000 });
                    mBuilder = mBuilder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
                    mBuilder = mBuilder.setContentIntent(resultPendingIntent);


                    NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                    notificationManager.notify(mNotificationId, mBuilder.build());
                    //Fim teste metodo


                    InputStream inputStream = getAssets().open(gif);
                    byte[] bytes = IOUtils.toByteArray(inputStream);
                    gifImageView.setBytes(bytes);
                    gifImageView.startAnimation();
                }
                catch (IOException ex){

                }
                break;

            default:

                gif = "Fire1hp.gif";
                try{
                    titulo = "Cuide da chama 4!";
                    texto = "A chama se apagou :(";

                    //Teste metodo
                    Intent resultIntent = new Intent(this, MainActivity.class);
                    PendingIntent resultPendingIntent = PendingIntent.getActivity(this,1,resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);

                    mBuilder = mBuilder.setContentTitle(titulo);
                    mBuilder = mBuilder.setContentText(texto);
                    mBuilder = mBuilder.setSmallIcon(R.mipmap.ic_launcher_ress);
                    mBuilder = mBuilder.setAutoCancel(true);
                    mBuilder = mBuilder.setWhen(System.currentTimeMillis());
                    mBuilder = mBuilder.setLargeIcon(BitmapFactory.decodeResource(this.getResources(),
                            R.mipmap.ic_launcher_ress));
                    mBuilder = mBuilder.setVibrate(new long[] { 1000, 1000 });
                    mBuilder = mBuilder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
                    mBuilder = mBuilder.setContentIntent(resultPendingIntent);


                    NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                    notificationManager.notify(mNotificationId, mBuilder.build());
                    //Fim teste metodo


                    InputStream inputStream = getAssets().open(gif);
                    byte[] bytes = IOUtils.toByteArray(inputStream);
                    gifImageView.setBytes(bytes);
                    gifImageView.startAnimation();
                }
                catch (IOException ex){

                }
                break;
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        gifImageView = (GifImageView)findViewById(R.id.gifImageView);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        progressBar.setVisibility(progressBar.VISIBLE);

        //Metodo com gif(pasta: assents)
        tempo = 6;
        changeGif(tempo);

        //Channel para notificações das versões 27+
        createNotificationChannel();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempo = 6;
                changeGif(tempo);
            }
        });

        //Executar o código de repetição por tempo
        handler.post(runnableCode);

    }

    //Código de repetição
    private Runnable runnableCode = new Runnable() {
        @Override
        public void run() {
            changeGif(tempo);
            tempo--;
            // Tempo de repetição
            handler.postDelayed(runnableCode, 60000);
        }
    };

    private void createNotificationChannel(){

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){

            CharSequence name = "Personal Notification";
            String description = "Include all the personal notification";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;

            NotificationChannel notificationChannel = new NotificationChannel (CHANNEL_ID, name, importance);

            notificationChannel.setDescription(description);

            NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(notificationChannel);

        }

    }

}
