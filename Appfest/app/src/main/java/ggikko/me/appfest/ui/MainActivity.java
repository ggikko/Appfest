package ggikko.me.appfest.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ggikko.me.appfest.AppfestApplication;
import ggikko.me.appfest.R;
import ggikko.me.appfest.dagger.test.HelloClass;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txt)TextView txt;
    @BindView(R.id.btn)Button btn;

    @Inject HelloClass helloClass;


    @OnClick(R.id.btn)
    void callBtn(View view){
        txt.setText(helloClass.say());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        ((AppfestApplication)getApplication()).getSpeakingComponent().inject(this);
        
    }
}
