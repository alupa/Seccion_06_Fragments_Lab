package io.github.alupa.seccion_06_fragments_lab.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import io.github.alupa.seccion_06_fragments_lab.Models.Mail;
import io.github.alupa.seccion_06_fragments_lab.R;

/**
 * Created by Alvaro on 24-10-2017.
 */

public class MailAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Mail> list;
    private final int SUBJECT_MAX_LENGHT = 40;
    private final int MESSAGE_MAX_LENGHT = 80;

    public MailAdapter(Context context, int layout, List<Mail> mails) {
        this.context = context;
        this.layout = layout;
        this.list = mails;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Mail getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(layout, null);
            vh = new ViewHolder();
            vh.subject = (TextView) convertView.findViewById(R.id.textViewListSubject);
            vh.message = (TextView) convertView.findViewById(R.id.textViewListMessage);
            vh.sender = (TextView) convertView.findViewById(R.id.textViewListSenderName);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        Mail currentMail = getItem(position);

        vh.subject.setText((currentMail.getSubject().length() > SUBJECT_MAX_LENGHT) ?
                            currentMail.getSubject().substring(0, SUBJECT_MAX_LENGHT) + "..." :
                            currentMail.getSubject());

        vh.message.setText((currentMail.getMessage().length() > MESSAGE_MAX_LENGHT) ?
                            currentMail.getMessage().substring(0, MESSAGE_MAX_LENGHT) + "..." :
                            currentMail.getMessage());

        vh.sender.setText(currentMail.getSenderName().substring(0, 1));

        vh.sender.getBackground().setColorFilter(Color.parseColor("#" + currentMail.getColor()), PorterDuff.Mode.SRC);

        return convertView;
    }

    static class ViewHolder {
        private TextView subject;
        private TextView message;
        private TextView sender;
    }
}
