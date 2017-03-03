package alex.p0091onclickbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // найдем View-элементы
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        OnClickListener oclBtnOK = new OnClickListener(){
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка ОК");
            }
        };
         // присвоим обработчик кнопке OK (btnOk)
        btnOk.setOnClickListener(oclBtnOK);

        OnClickListener oclBtnCancel = new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка Cancel");
            }
        };
        btnCancel.setOnClickListener(oclBtnCancel);

    }
}
