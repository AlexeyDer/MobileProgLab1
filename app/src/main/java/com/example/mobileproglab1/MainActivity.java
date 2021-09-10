package com.example.mobileproglab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Класс MainActivity
 * @author Деревцов Алексей
 * @version 1.0
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    static public int min(int a, int b) {
        return Math.min(a, b);
    }

    static public int max(int a, int b) {
        return Math.max(a, b);
    }
}