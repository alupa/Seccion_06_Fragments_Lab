package io.github.alupa.seccion_06_fragments_lab.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import io.github.alupa.seccion_06_fragments_lab.Adapters.MailAdapter;
import io.github.alupa.seccion_06_fragments_lab.Models.Mail;
import io.github.alupa.seccion_06_fragments_lab.R;
import io.github.alupa.seccion_06_fragments_lab.Utils.Util;

public class ListFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    private ListView listViewMails;
    private MailAdapter adapter;
    private List<Mail> mails;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        // Logica para capturar los elementos de la UI
        listViewMails = (ListView) view.findViewById(R.id.listViewMails);
        mails = Util.getDummyData();
        adapter = new MailAdapter(getContext(), R.layout.list_view_item_mail, mails);

        listViewMails.setAdapter(adapter);
        listViewMails.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mListener.onListClick(mails.get(position));
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onListClick(Mail mail);
    }

}
