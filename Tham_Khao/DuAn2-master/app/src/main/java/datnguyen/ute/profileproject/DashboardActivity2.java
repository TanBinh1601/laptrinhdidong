package datnguyen.ute.profileproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DashboardActivity2 extends AppCompatActivity implements View.OnClickListener {
    private CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard2);
        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);
        cardView4 = (CardView) findViewById(R.id.card4);
        cardView5 = (CardView) findViewById(R.id.card5);
        cardView6 = (CardView) findViewById(R.id.card6);
        cardView7 = (CardView) findViewById(R.id.card7);
        cardView8 = (CardView) findViewById(R.id.card8);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);
        cardView6.setOnClickListener(this);
        cardView7.setOnClickListener(this);
        cardView8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.card1: {
                i = new Intent(this, LoginActivity.class);
                startActivity(i);
                break;
            }
            case R.id.card2: {
                i = new Intent(this, DashboardActivity.class);
                startActivity(i);
                break;
            }
            case R.id.card3: {
                i = new Intent(this, ProfileActivity.class);
                startActivity(i);
                break;
            }
            case R.id.card4: {
                i = new Intent(this, Profile2Activity.class);
                startActivity(i);
                break;
            }
            case R.id.card5: {
                i = new Intent(this, SignUpActivity.class);
                startActivity(i);
                break;
            }
            case R.id.card6: {
                Toast.makeText(this, "Card 6", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.card7: {
                Toast.makeText(this, "Card 7", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.card8: {
                Toast.makeText(this, "Card 8", Toast.LENGTH_SHORT).show();
                break;
            }
            default:break;
        }
    }
}