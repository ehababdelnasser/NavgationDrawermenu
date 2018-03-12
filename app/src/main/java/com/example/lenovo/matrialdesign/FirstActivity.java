/* Activity which shows 3 choices in the sign language dictionary */
package com.example.lenovo.matrialdesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class FirstActivity extends Activity implements OnClickListener {
    private ImageButton signbtn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button btnalpha = (Button) findViewById(R.id.alphabets);
        Button btnnum = (Button) findViewById(R.id.numbers);
        Button btnfuw = (Button) findViewById(R.id.fuw);

        btnalpha.setOnClickListener(this);
        btnnum.setOnClickListener(this);
        btnfuw.setOnClickListener(this);
        signbtn = (ImageButton) findViewById(R.id.imageButton8);
        signbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent butt2 = new Intent(FirstActivity.this,MainActivity.class);
                startActivity(butt2);
            }
        });

    }

    public void onClick(View v) {
        /* Call MainActivity with appropriate choice */
        Intent intent = new Intent(FirstActivity.this, main.class);
        switch (v.getId())
        {
            case R.id.alphabets:
                intent.putExtra("Userchoice", 1);
                startActivity(intent);

                break;

            case R.id.numbers:
                intent.putExtra("Userchoice", 2);
                startActivity(intent);

                break;

            case R.id.fuw:
                intent.putExtra("Userchoice", 3);
                startActivity(intent);
                
                break;


        }
    }
}
