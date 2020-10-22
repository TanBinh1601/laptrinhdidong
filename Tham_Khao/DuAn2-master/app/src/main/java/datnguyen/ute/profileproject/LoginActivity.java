package datnguyen.ute.profileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class LoginActivity extends AppCompatActivity {
    TextView txtSignUp;
    EditText eUser, ePassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtSignUp = (TextView) findViewById(R.id.txtSignUp);
        eUser = (EditText) findViewById(R.id.eUser);
        ePassword = (EditText) findViewById(R.id.ePassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenSignUpActi();
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenMainActivity();
            }
        });
    }

    public void OpenSignUpActi() {
        Intent intent = new Intent(this,SignUpActivity.class);
        startActivity(intent);
    }
    public void OpenMainActivity(){
        if (eUser.getText().toString().equals("admin") && eUser.getText().toString().equals("admin")){
            Toast.makeText(LoginActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,ProfileActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(LoginActivity.this, "Incorrect Password", Toast.LENGTH_SHORT).show();
        }

    }
}