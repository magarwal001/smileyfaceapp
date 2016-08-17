package manasagarwalapptutorialproject.com.helloworldtutorialproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Hello_World_Fun_Place extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello__world__fun__place);
    }


    public void ifHappy(View view){

        Toast.makeText(getApplication(),"Good your Happy!",Toast.LENGTH_LONG).show();

        ImageView happyimage = (ImageView) findViewById(R.id.happy_sad_neutral_image);

        happyimage.setImageDrawable(getDrawable(R.drawable.funny_picture2));
    }

    public void ifSad(View view){

        Toast.makeText(getApplication(),"Its okay if your Sad!, Hope you feel better!!",Toast.LENGTH_LONG).show();

        ImageView sadImage = (ImageView) findViewById(R.id.happy_sad_neutral_image);

        sadImage.setImageDrawable(getDrawable(R.drawable.sad));

    }


}
