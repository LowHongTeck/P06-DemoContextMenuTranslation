package sg.edu.rp.c346.id20043679.democontextmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.textViewTranslatedText);
        registerForContextMenu(tvTranslatedText);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,0,0,"English");
        menu.add(0,1,1,"Italian");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()==0) { //check whether the selected menu item ID is 0
            //code for action
            //Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();
            tvTranslatedText.setText("Hello");
            return true; //menu item successfully handled
        }
        else if(item.getItemId()==1) { //check if the selected menu item ID is 1
            //code for action
            //Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();
            tvTranslatedText.setText("Ciao");

            return true;  //menu item successfully handled
        }
        return super.onContextItemSelected(item); //pass menu item to the superclass implementation


    }


}