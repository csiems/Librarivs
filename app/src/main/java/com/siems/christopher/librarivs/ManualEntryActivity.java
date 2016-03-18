package com.siems.christopher.librarivs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import butterknife.Bind;

public class ManualEntryActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.authorFirstNameEditText) EditText mAuthorFirstName;
    @Bind(R.id.authorLastNameEditText) EditText mAuthorLastName;
    @Bind(R.id.bookTitleEditText) EditText mBookTitle;
    @Bind(R.id.bookVolEditText) EditText mBookVol;
    @Bind(R.id.bookEdEditText) EditText mBookEd;
    @Bind(R.id.bookSeriesEditText) EditText mBookSeries;
    @Bind(R.id.publisherEditText) EditText mPublisher;
    @Bind(R.id.bookYearEditText) EditText mBookYear;
    @Bind(R.id.publicationDateEditText) EditText mPublicationDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_entry);
    }


    //ON CLICK LISTENER(S)
    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.submitNewButton:
                String authorFirstName = mAuthorFirstName.getText().toString();
                String authorLastName = mAuthorLastName.getText().toString();
                String bookTitle = mBookTitle.getText().toString();
                String bookVol = mBookVol.getText().toString();
                String bookEd = mBookEd.getText().toString();
                String bookSeries = mBookSeries.getText().toString();
                String publisher = mPublisher.getText().toString();
                String bookYear = mBookYear.getText().toString();
                String publicationDate = mPublicationDate.getText().toString();
                Intent intent = new Intent(ManualEntryActivity.this, BibliographyActivity.class);
                intent.putExtra("authorFirstName", authorFirstName);
                intent.putExtra("authorLastName", authorLastName);
                intent.putExtra("bookTitle", bookTitle);
                intent.putExtra("bookVol", bookVol);
                intent.putExtra("bookEd", bookEd);
                intent.putExtra("bookSeries", bookSeries);
                intent.putExtra("publisher", publisher);
                intent.putExtra("bookYear", bookYear);
                intent.putExtra("publicationDate", publicationDate);
                startActivity(intent);
                break;
        }
    }
}
