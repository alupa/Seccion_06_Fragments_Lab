package io.github.alupa.seccion_06_fragments_lab.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.github.alupa.seccion_06_fragments_lab.Fragments.DetailsFragment;
import io.github.alupa.seccion_06_fragments_lab.Models.Mail;
import io.github.alupa.seccion_06_fragments_lab.R;

public class DetailsActivity extends AppCompatActivity {

    private String subject;
    private String message;
    private String sender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        if (getIntent().getExtras() != null){
            subject = getIntent().getStringExtra("subject");
            message = getIntent().getStringExtra("message");
            sender = getIntent().getStringExtra("senderName");
        }

        Mail mail = new Mail(subject, message, sender);

        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetailsMail);
        detailsFragment.renderMail(mail);
    }
}
