package com.example.carlos.appfire;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
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
            case 4:

                gif = "Fire3hp.gif";
                try{
                    titulo = "Cuide da chama!";
                    texto = "A chama estar alta, mantenha ela assim!";

                    //Teste metodo
                    mBuilder = mBuilder.setContentTitle(titulo);
                    mBuilder = mBuilder.setContentText(texto);
                    mBuilder = mBuilder.setSmallIcon(R.mipmap.ic_launcher);
                    mBuilder = mBuilder.setPriority(NotificationCompat.PRIORITY_DEFAULT);


                    NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

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

                gif = "Fire2hp.gif";
                try{
                    titulo = "Cuide da chama 2!";
                    texto = "A chama estar se apagando, mantenha a chama alta!";

                    //Teste metodo
                    mBuilder = mBuilder.setContentTitle(titulo);
                    mBuilder = mBuilder.setContentText(texto);
                    mBuilder = mBuilder.setSmallIcon(R.mipmap.ic_launcher);
                    mBuilder = mBuilder.setPriority(NotificationCompat.PRIORITY_DEFAULT);


                    NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

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

                gif = "Fire1hp.gif";
                try{
                    titulo = "Cuide da chama 3!";
                    texto = "A chama estar quase no fim, não deixe ela apagar!";

                    //Teste metodo
                    mBuilder = mBuilder.setContentTitle(titulo);
                    mBuilder = mBuilder.setContentText(texto);
                    mBuilder = mBuilder.setSmallIcon(R.mipmap.ic_launcher);
                    mBuilder = mBuilder.setPriority(NotificationCompat.PRIORITY_DEFAULT);


                    NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

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

                gif = "Fire0hp.gif";
                try{
                    titulo = "Cuide da chama 4!";
                    texto = "A chama se apagou :(";

                    //Teste metodo
                    mBuilder = mBuilder.setContentTitle(titulo);
                    mBuilder = mBuilder.setContentText(texto);
                    mBuilder = mBuilder.setSmallIcon(R.mipmap.ic_launcher);
                    mBuilder = mBuilder.setPriority(NotificationCompat.PRIORITY_DEFAULT);


                    NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);;

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
        tempo = 4;
        changeGif(tempo);

        //Channel para notificações das versões 27+
        createNotificationChannel();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempo = 4;
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

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
