package com.example.walkitoff;

import androidx.appcompat.app.AppCompatActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDB extends AppCompatActivity {

    TextView thebox, testView, view1,view2,view3,view4,view5;
    public static String hostName,dbPass,adminName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect_db);


    }


    public void getConnected(View view)
    {
        new Async().execute();
    } //end connected


    class Async extends AsyncTask<Void, Void, Void> {

        String records = "",error = "", message = "Connected!!", distanceRan = "", unlockLevel = "";
        //public Statement statement;

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection(hostName, adminName, dbPass);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM user");


                //resultSet get ( column index) this will get the WHOLE DB
                while(resultSet.next())
                {
                    records += resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3) + " " + resultSet.getInt(4) + resultSet.getInt(5) + "\n";
                }

                resultSet = statement.executeQuery("SELECT user_name FROM user WHERE id =" + MainActivity.uID);

                while(resultSet.next()) {
                    MainActivity.uName = resultSet.getString(1);
                }

                resultSet = statement.executeQuery("SELECT distance_ran FROM user WHERE id =" + MainActivity.uID);

                while(resultSet.next()) {
                    MainActivity.uDistance = resultSet.getString(1);
                }

                resultSet = statement.executeQuery("SELECT user_score FROM user WHERE id =" + MainActivity.uID);

                while(resultSet.next()) {
                    MainActivity.uScore = resultSet.getString(1);
                }

                resultSet = statement.executeQuery("SELECT user_level FROM user WHERE id =" + MainActivity.uID);

                while(resultSet.next()) {
                    MainActivity.uLevel = resultSet.getString(1);
                }


            } catch (Exception e) {
                error = e.toString();

            }
            return null;
        }


        //-----------------------------------------------------
        @Override
        protected void onPostExecute(Void aVoid) {
            thebox = (TextView) findViewById(R.id.statusText);
            view1 = (TextView) findViewById(R.id.textView9);
            view2 = (TextView) findViewById(R.id.textView10);
            view3 = (TextView) findViewById(R.id.textView11);
            view4 = (TextView) findViewById(R.id.textView12);
            view5 = (TextView) findViewById(R.id.textView13);

            //set userid
            EditText idField = (EditText) findViewById(R.id.editText1);
            MainActivity.uID = idField.getText().toString();

            //set database hostname
            EditText hostField = (EditText) findViewById(R.id.editText2);
            hostName = hostField.getText().toString();

            //set db admin name
            EditText adminField = (EditText) findViewById(R.id.editText4);
            adminName = adminField.getText().toString();

            //set db password
            EditText passField = (EditText) findViewById(R.id.editText3);
            dbPass = passField.getText().toString();


            thebox.setText(records);
            view1.setText(MainActivity.uID);
            view2.setText(MainActivity.uName);
            view3.setText(MainActivity.uDistance);
            view4.setText(MainActivity.uScore);
            view5.setText(MainActivity.uLevel);

            /*just alternative ways to set a textfield i want to remember... lol
            testView.setText(editView.getText().toString());
            testView.setText(testString);*/



            if (error != "")
                thebox.setText(error);
            super.onPostExecute(aVoid);
        }


    }//end async
}//end ConnectDB