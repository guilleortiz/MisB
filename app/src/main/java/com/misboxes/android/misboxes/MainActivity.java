package com.misboxes.android.misboxes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;



public class MainActivity extends AppCompatActivity {


    // Write a message to the database
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Mudanzas");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







    }

    @Override
    protected void onStart() {
        super.onStart();


        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
               // int nUsers= (int) dataSnapshot.getChildrenCount();

                String value = dataSnapshot.child("0").child("cajas").child("0").child("Contenido").getValue(String.class);

                Iterable<DataSnapshot> values = dataSnapshot.getChildren();

                for (DataSnapshot Mudanzas:values) {
                    Toast.makeText(MainActivity.this, Mudanzas.getValue().toString(), Toast.LENGTH_LONG).show();

                }


                //Toast.makeText(MainActivity.this, "Value is: " + value, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Toast.makeText(MainActivity.this, "Fail", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
