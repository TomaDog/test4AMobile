import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.example.a4a_c1.R;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {
    @Override
    private ArrayList<String> arrayList;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
