package sg.edu.np.s10171537connect.madassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class select_number_of_playerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_number_of_players);
    }
    public void on_player2_click(View v){
        Constant.numPlayer = 2;
        Intent in = new Intent(this,question_ready.class);
        startActivity(in);
    }
    public void on_player3_click(View v){
        Constant.numPlayer = 3;
        Intent in = new Intent(this,question_ready.class);
        startActivity(in);
    }
    public void on_player4_click(View v){
        Constant.numPlayer = 4;
        Intent in = new Intent(this,question_ready.class);
        startActivity(in);
    }

}
