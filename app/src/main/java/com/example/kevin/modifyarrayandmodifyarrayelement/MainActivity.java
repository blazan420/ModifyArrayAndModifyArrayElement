package com.example.kevin.modifyarrayandmodifyarrayelement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtOriginalValuesOfArray = (TextView)findViewById(R.id.txtOriginalValuOfArray);
        TextView txtValueOfModifiedArray = (TextView)findViewById(R.id.txtValuesOfModifiedArray);
        TextView txtModifiedArrayElement = (TextView)findViewById(R.id.txtModifiedArrayElement);
        TextView txtOriginalArrayElement = (TextView) findViewById(R.id.txtOriginalArrayElement);
        TextView txtArrayElementAfterModification = (TextView)findViewById(R.id.txtArrayElementValueAfterModification);


        String[] stringArray = {"A\n", "B\n", "C\n","D\n", "E\n", "F\n","G\n", "H\n", "I\n","J\n", "K\n", "L\n","M\n", "N\n", "O\n","P\n", "Q\n", "R\n","S\n", "T\n", "U\n","V\n", "W\n","X\n", "Y\n","Z\n"};

        String totalOriginalValues = "";

        for (String value : stringArray) {
            totalOriginalValues += value;
            //totalOriginalValues = totalOriginalValues + value;
        }

        txtOriginalValuesOfArray.setText(totalOriginalValues);

        // Now we want to modify the Array

        letsModifyTheArray(stringArray);

        String totalModifiedValues = "";

        for (String value : stringArray) {

            totalModifiedValues += value;
            //totalModifiedValues = totalOriginalValues + value;
        }

        txtValueOfModifiedArray.setText(totalModifiedValues);








    }




    public void letsModifyTheArray(String[] array) {

        for (int index = 0; index < array.length; index++) {

            array[index] = "$" + array[index];
        }

    }
}
