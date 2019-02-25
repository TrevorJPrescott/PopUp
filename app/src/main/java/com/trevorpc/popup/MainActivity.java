package com.trevorpc.popup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPopUp(View view) {
        PopupMenu popupMenu = new PopupMenu(this,view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.popup_menu);
        popupMenu.show();

    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this,"Item 1 clicked",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this,"Item 2 clicked",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this,"Item 3 clicked",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item4:
                Toast.makeText(this,"Item 4 clicked",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item5:
                Toast.makeText(this,"Item 5 clicked",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;


        }
    }
}
