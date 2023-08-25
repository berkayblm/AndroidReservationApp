package com.example.myapplication.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.Adapters.Item;
import com.example.myapplication.Adapters.MyAdapter;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {
    TextView name;
    EditText phone;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("John Wick","wickyjhn@gmail.com", R.drawable.a));
        items.add(new Item("Fatih Terim","fterm2002@gmail.com", R.drawable.a));
        items.add(new Item("Test User","test1@gmail.com", R.drawable.b));
        items.add(new Item("Test User2","test2@gmail.com", R.drawable.b));
        items.add(new Item("Fatih Terim","fterm2002@gmail.com", R.drawable.a));
        items.add(new Item("Fatih Terim","fterm2002@gmail.com", R.drawable.a));
        items.add(new Item("Fatih Terim","fterm2002@gmail.com", R.drawable.a));
        items.add(new Item("Fatih Terim","fterm2002@gmail.com", R.drawable.a));
        items.add(new Item("Fatih Terim","fterm2002@gmail.com", R.drawable.a));
        items.add(new Item("Fatih Terim","fterm2002@gmail.com", R.drawable.a));
        items.add(new Item("Fatih Terim","fterm2002@gmail.com", R.drawable.a));
        items.add(new Item("Fatih Terim","fterm2002@gmail.com", R.drawable.a));
        items.add(new Item("Fatih Terim","fterm2002@gmail.com", R.drawable.a));
        items.add(new Item("Fatih Terim","fterm2002@gmail.com", R.drawable.a));
        items.add(new Item("Fatih Terim","fterm2002@gmail.com", R.drawable.a));
        items.add(new Item("Fatih Terim","fterm2002@gmail.com", R.drawable.a));
        items.add(new Item("Fatih Terim","fterm2002@gmail.com", R.drawable.a));
        items.add(new Item("Fatih Terim","fterm2002@gmail.com", R.drawable.a));
        items.add(new Item("Fatih Terim","fterm2002@gmail.com", R.drawable.a));
        items.add(new Item("Fatih Terim","fterm2002@gmail.com", R.drawable.a));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));
    }
}