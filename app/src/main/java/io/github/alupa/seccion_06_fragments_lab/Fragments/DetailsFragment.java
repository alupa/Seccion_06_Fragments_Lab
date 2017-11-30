package io.github.alupa.seccion_06_fragments_lab.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import io.github.alupa.seccion_06_fragments_lab.Models.Mail;
import io.github.alupa.seccion_06_fragments_lab.R;

public class DetailsFragment extends Fragment {

    private TextView textViewSubject;
    private TextView textViewSender;
    private TextView textViewMessage;
    private LinearLayout wrapper;

    public DetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        textViewSubject = (TextView) view.findViewById(R.id.textViewFragmentSubject);
        textViewSender = (TextView) view.findViewById(R.id.textViewFragmentSenderName);
        textViewMessage = (TextView) view.findViewById(R.id.textViewFragmentMessage);
        wrapper = (LinearLayout) view.findViewById(R.id.fragmentDetailsMailWrapper);
        return view;
    }

    public void renderMail(Mail mail){
        wrapper.setVisibility(View.VISIBLE);
        textViewSubject.setText(mail.getSubject());
        textViewMessage.setText(mail.getMessage());
        textViewSender.setText(mail.getSenderName());
    }

}
