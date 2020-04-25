package com.dproject.where;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class GroupActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

       /* Toolbar toolbar = (Toolbar) findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);

        // Remove default title text
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        // Get access to the custom title view
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);*/

        rvSetting();
        rvDataSetting();

    }

    private void rvSetting(){
        recyclerView = findViewById(R.id.rv1);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    private void rvDataSetting(){
        GroupPersonAdapter adapter = new GroupPersonAdapter();

        adapter.addItem(new Person(R.drawable.icon_user, "김가나", "01011113333"));
        adapter.addItem(new Person(R.drawable.icon_user, "이나다", "01022224444"));
        adapter.addItem(new Person(R.drawable.icon_user, "박다라", "01033335555"));
        adapter.addItem(new Person(R.drawable.icon_user, "최라마", "01044446666"));
        adapter.addItem(new Person(R.drawable.icon_user, "김마바", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "이바사", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "박사아", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "최아자", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "김자차", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "이차카", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "박카타", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "최타파", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "김파하", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "이하가", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "박가나", "01022228888"));
        adapter.addItem(new Person(R.drawable.icon_user, "최나다", "01022228888"));



        recyclerView.setAdapter(adapter);
    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_group, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.checked){
            Toast.makeText(this, "Checked btn is Clicked", Toast.LENGTH_SHORT).show();
            //Intent i = new Intent(this, GroupActivity.class);
            //startActivityForResult(i,100);

        }
        return super.onOptionsItemSelected(item);
    }

 */

}
