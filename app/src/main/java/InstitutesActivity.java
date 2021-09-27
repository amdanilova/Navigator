import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigator.Institutes;
import com.example.navigator.R;
import com.example.navigator.adapter.InstituteAdapter;

import java.util.ArrayList;
import java.util.List;

public class InstitutesActivity extends AppCompatActivity {
    RecyclerView institutesRecycler;
    InstituteAdapter instituteAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.institutsactivity);
        List<Institutes> institutesList = new ArrayList<>();
        institutesList.add(new Institutes(1,"humanitarian","Гуманитарный иститут"));
        institutesList.add(new Institutes(1,"business","Бизнес-школа"));
        institutesList.add(new Institutes(1,"informational","Институт информационных технологий"));
        setInstituteRecycler(institutesList);
    }

    private void setInstituteRecycler(List<Institutes> institutesList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
     institutesRecycler=findViewById(R.id.institutesRecycler);
        institutesRecycler.setLayoutManager(layoutManager);
        instituteAdapter=new InstituteAdapter(this,institutesList);
        institutesRecycler.setAdapter(instituteAdapter);
    }

}
