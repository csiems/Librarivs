package com.siems.christopher.librarivs;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class BibliographyActivity extends AppCompatActivity {
    @Bind(R.id.bibliographyTextView) TextView bibliographyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Montserratt-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        setContentView(R.layout.activity_bibliography);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String authorFirstName = intent.getStringExtra("authorFirstName");
        String authorLastName = intent.getStringExtra("authorLastName");
        String bookTitle = intent.getStringExtra("bookTitle");
        String bookVol = intent.getStringExtra("bookVol");
        String bookEd = intent.getStringExtra("bookEd");
        String bookSeries = intent.getStringExtra("bookSeries");
        String publisher = intent.getStringExtra("publisher");
        String bookYear = intent.getStringExtra("bookYear");
        String bookCity = intent.getStringExtra("bookCity");

        Resources res = getResources();
        String bibliography;

        if (bookVol.equals("")) {
            bibliography = String.format(res.getString(R.string.bibliographyBookStandard), authorLastName, authorFirstName, bookTitle,                             bookCity, publisher, bookYear);
        } else {
            bibliography = String.format(res.getString(R.string.bibliographyBookAdvanced), authorLastName, authorFirstName, bookTitle,                             bookEd, bookVol, bookCity, publisher, bookYear, bookSeries);
        }

        bibliographyTextView.setText(bibliography);
    }
}
