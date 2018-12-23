package com.Orai.Sem.Cessar;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;

import com.Orai.Sem.Cessar.Service.Services;
import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import static android.app.Notification.VISIBILITY_PUBLIC;

public class MainActivity extends AppCompatActivity {

    private final String CHANNEL_ID = "personal_notifications";
    private final int mNotificationId= 001;

    private GifImageView gifImageView;
    private ProgressBar progressBar;
    private String gif;
    //Handler handler = new Handler();
    private int tempo;

    Timer t = new Timer();

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
                    titulo = "Mantenha a chama acesa!";
                    texto = "“Peçam, e será dado” Mt 7:7a";

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

                    /*new
                    this.tempo--;*/

                }
                catch (IOException ex){

                }
                break;


            case 5:

                gif = "Fire5hp.gif";
                try{
                    titulo = "Não deixe a chama apagar!";
                    texto = "“Orem no Espírito em todas as ocasiões” Ef 6:18";

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

                    /*new
                    this.tempo--;*/
                }
                catch (IOException ex){

                }
                break;

            case 4:

                gif = "Fire4hp.gif";
                try{
                    titulo = "Não deixe a chama apagar!";
                    texto = "“Dediquem-se à oração” Cl 4:2a";

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

                    /*new
                    this.tempo--;*/
                }
                catch (IOException ex){

                }
                break;

            case 3:

                gif = "Fire3hp.gif";
                try{
                    titulo = "Não deixe a chama apagar!";
                    texto = "“Orem continuamente” Ts: 5-17";

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

                    /*new
                    this.tempo--;*/
                }
                catch (IOException ex){

                }
                break;

            case 2:

                gif = "Fire2hp.gif";
                try{
                    titulo = "Não deixe a chama apagar!";
                    texto = "“Orai sem desanimar” Lc 18:1";

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

                    /*new
                    this.tempo--;*/
                }
                catch (IOException ex){

                }
                break;

            default:

                gif = "Fire1hp.gif";
                try{
                    titulo = "Sua chama apagou!";
                    texto = "“Vigiem, pois não sabeis o dia nem a hora!” Mt 25:13";

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

                    /*new
                    this.tempo--;*/
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

        //Start service using AlarmManager
        /*Calendar cal = Calendar.getInstance();
        cal.add(Calendar.SECOND, 10);

        Intent intent = new Intent(this, Services.class);

        PendingIntent pintent = PendingIntent.getBroadcast(this, 0, intent, 0);

        AlarmManager alarm = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        alarm.setRepeating(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(),
                60000, pintent);

        startService(new Intent(getBaseContext(), Services.class));*/

        //Set the schedule function and rate
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                changeGif(tempo);
                tempo--;
            }
        },0,3600000);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempo = 6;
                changeGif(tempo);
            }
        });

        //Executar o código de repetição por tempo
        //handler.post(runnableCode);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            WallpaperManager wallpaper = WallpaperManager.getInstance(getApplicationContext());
            try {

                wallpaper.setResource(+ R.drawable.papel_de_parede);

            } catch (IOException e){
                e.printStackTrace();
            }

            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /*Código de repetição
    private Runnable runnableCode = new Runnable() {
        @Override
        public void run() {
            changeGif(tempo);
            tempo--;
            // Tempo de repetição
            handler.postDelayed(runnableCode, 60000);
        }
    };*/

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
