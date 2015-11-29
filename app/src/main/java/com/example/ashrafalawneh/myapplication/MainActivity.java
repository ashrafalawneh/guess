package com.example.ashrafalawneh.myapplication;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.Editable;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;

        import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random=new Random();
    int cc;
    String pp;
    TextView tt=(TextView)findViewById(R.id.t1);
EditText t=(EditText)findViewById(R.id.editText);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cc=  random.nextInt(1000);



    }


    public  void onclick (View view){
     if(t.getText().equals(cc))
       {
           tt.setText("correct");
       }
        else
         if(t.getText()>cc)
         {
             tt.setText("the number bigger than");
         }
        if(t.getText()<cc)
            tt.setText("the number smaller than");
        else
        tt.setText("out of range");
         {
    }


}
