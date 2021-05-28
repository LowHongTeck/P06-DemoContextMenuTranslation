package sg.edu.rp.c346.id20043679.democontextmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;
    TextView tvTranslatedText2;
    TextView tvTranslatedText3;
    String viewSelected = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.textViewTranslatedText);
        tvTranslatedText2 = findViewById(R.id.textViewTranslatedText2);
        tvTranslatedText3 = findViewById(R.id.textViewTranslatedText3);

        registerForContextMenu(tvTranslatedText);
        registerForContextMenu(tvTranslatedText2);
        registerForContextMenu(tvTranslatedText3);


    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        Log.v("Context", "create context");
        menu.add(0,0,0,"English");
        menu.add(0,1,1,"Italian");
        menu.add(0,2,2,"French");

        if(v == tvTranslatedText){
            viewSelected = "helloTextView";
            Log.v("Context", "Top View Selected");
        }
        else if (v == tvTranslatedText2){
            viewSelected = "byeTextView";
            Log.v("Context", "Bottom View Selected");
        }
        else if (v == tvTranslatedText3){
            viewSelected = "welcomeTextView";
        }
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
       if(viewSelected.equalsIgnoreCase("helloTextView")){
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
       else if (viewSelected.equalsIgnoreCase("byeTextView")){
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
       else if (viewSelected.equalsIgnoreCase("welcomeTextView")){
           if(item.getItemId()==0) { //check whether the selected menu item ID is 0
               //code for action
               Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();
               tvTranslatedText3.setText("Welcome");
               return true; //menu item successfully handled
           }
           else if(item.getItemId()==1) { //check if the selected menu item ID is 1
               //code for action
               Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();
               tvTranslatedText3.setText("Benvenuto");

               return true;  //menu item successfully handled
           }
           else if(item.getItemId()==2){
               Toast.makeText(MainActivity.this, "French is chosen", Toast.LENGTH_SHORT).show();
               tvTranslatedText3.setText("Bienvenu");

               return true;
           }
       }

        return super.onContextItemSelected(item); //pass menu item to the superclass implementation

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            tvTranslatedText.setText("Hello ");
            tvTranslatedText2.setText("Bye");
            tvTranslatedText3.setText("Welcome");
            return true;
        } else if (id == R.id.italianSelection) {
            tvTranslatedText.setText("Ciao");
            tvTranslatedText2.setText("Addio");
            tvTranslatedText3.setText("Benvenuto");
            return true;
        } else if (id == R.id.FrenchSelection) {
            tvTranslatedText.setText("Bonjour");
            tvTranslatedText2.setText("Au revoir");
            tvTranslatedText3.setText("Bienvenu");
            return true;
        } else {
            tvTranslatedText.setText("Error translation");
        }

        return super.onOptionsItemSelected(item);
    }



}