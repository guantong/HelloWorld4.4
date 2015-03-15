package com.example.guantong.helloworld44;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.example.guantong.helloworld44.Person;
import com.example.guantong.helloworld44.R;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void buttonPressed(View v) {
        // Grab the reference to EditText fields on the layout
        EditText nameInput = (EditText) findViewById(R.id.inputName);
        EditText ageInput = (EditText) findViewById(R.id.inputAge);
        // Then we grab the input values
        String name = nameInput.getText().toString();
        int age = Integer.valueOf(ageInput.getText().toString());
        // Create the person object to hold these values
        Person p = new Person(name, age);

        // Use the AlertDialog Builder utility to create the dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Set message and title for dialog (we can chain methods here!)
        builder.setTitle("Hello World!").setMessage(p.sayHello());
        // Add a button to the dialog with an event handler for clicks (presses)
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        // Set the dialog to not be distrubed by the application
        builder.setCancelable(false);
        // Create dialog and display it to the user
        builder.create().show();
    }
}