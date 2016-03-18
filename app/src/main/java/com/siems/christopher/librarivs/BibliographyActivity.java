package com.siems.christopher.librarivs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BibliographyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bibliography);

        Intent intent = getIntent();
        String authorFirstName = intent.getStringExtra("authorFirstName");
        String authorLastName = intent.getStringExtra("authorLastName");
        String bookTitle = intent.getStringExtra("bookTitle");
        String bookVol = intent.getStringExtra("bookVol");
        String bookEd = intent.getStringExtra("bookEd");
        String bookSeries = intent.getStringExtra("bookSeries");
        String publisher = intent.getStringExtra("publisher");
        String bookYear = intent.getStringExtra("bookYear");
        String publicationDate = intent.getStringExtra("publicationDate");
    }
}
