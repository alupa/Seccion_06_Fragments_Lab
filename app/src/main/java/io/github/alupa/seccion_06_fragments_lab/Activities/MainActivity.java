package io.github.alupa.seccion_06_fragments_lab.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.github.alupa.seccion_06_fragments_lab.Fragments.DetailsFragment;
import io.github.alupa.seccion_06_fragments_lab.Fragments.ListFragment;
import io.github.alupa.seccion_06_fragments_lab.Models.Mail;
import io.github.alupa.seccion_06_fragments_lab.R;

public class MainActivity extends AppCompatActivity implements ListFragment.OnFragmentInteractionListener {

    private boolean isMultiPanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setMultiPanel();
    }

    private void setMultiPanel(){
        isMultiPanel = (getSupportFragmentManager().findFragmentById(R.id.fragmentDetailsMail) != null);
    }

    @Override
    public void onListClick(Mail mail) {

        if (isMultiPanel) {
            DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetailsMail);
            detailsFragment.renderMail(mail);
        } else {
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra("subject", mail.getSubject());
            intent.putExtra("message", mail.getMessage());
            intent.putExtra("senderName", mail.getSenderName());
            startActivity(intent);
        }
    }
}
