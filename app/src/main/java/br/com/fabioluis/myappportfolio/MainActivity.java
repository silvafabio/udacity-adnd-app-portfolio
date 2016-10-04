package br.com.fabioluis.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        /* References
        *
        * Button Text: http://stackoverflow.com/questions/5620772/get-text-from-pressed-button
        * R.string : http://stackoverflow.com/questions/8102741/android-how-to-use-string-resource-in-a-java-class
        */
        Button button = (Button) view;
        Context context = getApplicationContext();
        String message = context.getString(R.string.toast_text_begin) + " " + button.getText().toString() + " " + context.getString(R.string.toast_text_end);
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
