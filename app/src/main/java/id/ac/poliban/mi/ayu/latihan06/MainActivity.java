package id.ac.poliban.mi.ayu.latihan06;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //membuat object inflater
        MenuInflater inflater = getMenuInflater();
        //menempelkan menu ke object inflater
        inflater.inflate(R.menu.menus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.Bunga1){
            View view = this.getWindow().getDecorView();
            //terlihat file gambar cherry_barb sebagai
            //hasil import android drawable importer
            //dikenali dalam source code kita
            view.setBackgroundResource(R.drawable.aa);
        }
        if(item.getItemId()==R.id.Bunga2){
            View view = this.getWindow().getDecorView();
            view.setBackgroundResource(R.drawable.bb);
        }
        if(item.getItemId()==R.id.Bunga3){
            this.getWindow().getDecorView().setBackgroundResource(R.drawable.cc);
        }
        if(item.getItemId()==R.id.Bunga4){
            this.getWindow().getDecorView().setBackgroundResource(R.drawable.dd);
        }

        return true;
    }
}
