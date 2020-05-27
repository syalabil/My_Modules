package sg.edu.rp.c346.id19046836.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Ipad extends AppCompatActivity {
    TextView code;
    TextView name;
    TextView year;
    TextView semester;
    TextView credit;
    TextView venue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipad);


        code = findViewById(R.id.textViewModuleCode);
        name =findViewById(R.id.textViewModuleName);
        year = findViewById(R.id.textViewYear);
        semester = findViewById(R.id.textViewSemester);
        credit = findViewById(R.id.textViewModuleCredit);
        venue = findViewById(R.id.textViewVenue);



        Intent intentReceived = getIntent();
        String code1 = intentReceived.getStringExtra("Code");
        code.setText("Module Code : "+ code1);
        String name1 = intentReceived.getStringExtra("Name");
        name.setText("Module name :" + name1);
        int year1 = intentReceived.getIntExtra("Year",0);
        year.setText("Academic Year : " + year1);
        int semester1 = intentReceived.getIntExtra("Credit", 0);
        semester.setText("Semester : " + semester1);
        int credit1 = intentReceived.getIntExtra("Credit",0);
        credit.setText("Module Credit : " + credit1);
        String venue1 = intentReceived.getStringExtra("Venue");
        venue.setText("Venue : " +venue1);


    }
}
