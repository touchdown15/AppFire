package com.example.carlos.appfire;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
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

    private GifImageView gifImageView;
    private ProgressBar progressBar;
    private String gif;
    Handler handler = new Handler();
    private int tempo;

    //Método com as trocas de gifs e mensagem
    private void changeGif (int tempo){

        switch (tempo){
            case 4:

                gif = "Fire3hp.gif";
                try{
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
                    InputStream inputStream = getAssets().open(gif);
                    byte[] bytes = IOUtils.toByteArray(inputStream);
                    gifImageView.setBytes(bytes);
                    gifImageView.startAnimation();
                }
                catch (IOException ex){

                }
                break;

            default:

                gif = "fire.gif";
                try{
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
            tempo--;
            changeGif(tempo);
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
}
