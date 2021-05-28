package sg.edu.rp.c346.id20043679.democontextmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;
    TextView tvTranslatedText2;
    String viewSelected = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.textViewTranslatedText);
        tvTranslatedText2 = findViewById(R.id.textViewTranslatedText2);
        registerForContextMenu(tvTranslatedText);
        registerForContextMenu(tvTranslatedText2);


    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        Log.v("Context", "create context");
        menu.add(0,0,0,"English");
        menu.add(0,1,1,"Italian");
        menu.add(0,2,2,"French");

        if(v == tvTranslatedText){
            viewSelected = "topTextView";
            Log.v("Context", "Top View Selected");
        }
        else if (v == tvTranslatedText2){
            viewSelected = "btmTextView";
            Log.v("Context", "Bottom View Selected");
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
       if(viewSelected.equalsIgnoreCase("topTextView")){
           if(item.getItemId()==0) { //check whether the selected menu item ID is 0
               //code for action
               Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();
               tvTranslatedText.setText("Hello");
               return true; //menu item successfully handled
           }
           else if(item.getItemId()==1) { //check if the selected menu item ID is 1
               //code for action
               Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();
               tvTranslatedText.setText("Ciao");

               return true;  //menu item successfully handled
           }
           else if(item.getItemId()==2){
               Toast.makeText(MainActivity.this, "French is chosen", Toast.LENGTH_SHORT).show();
               tvTranslatedText.setText("Bonjour");

               return true;
           }
       }
       else {
           if(item.getItemId()==0) { //check whether the selected menu item ID is 0
               //code for action
               Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();
               tvTranslatedText2.setText("Bye");
               return true; //menu item successfully handled
           }
           else if(item.getItemId()==1) { //check if the selected menu item ID is 1
               //code for action
               Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();
               tvTranslatedText2.setText("Addio");

               return true;  //menu item successfully handled
           }
           else if(item.getItemId()==2){
               Toast.makeText(MainActivity.this, "French is chosen", Toast.LENGTH_SHORT).show();
               tvTranslatedText2.setText("Au revoir");

               return true;
           }
       }

        return super.onContextItemSelected(item); //pass menu item to the superclass implementation


    }


}