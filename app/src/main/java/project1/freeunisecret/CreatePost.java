package project1.freeunisecret;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;

public class CreatePost extends AppCompatActivity {
    @BindView(R.id.add_photo_btn_id) ImageView addPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);
    }
}
