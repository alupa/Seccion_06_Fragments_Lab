package io.github.alupa.seccion_06_fragments_lab.Models;

import io.github.alupa.seccion_06_fragments_lab.Utils.Util;

/**
 * Created by Alvaro on 24-10-2017.
 */

public class Mail {

    private String Subject;
    private String Message;
    private String SenderName;
    private String color;

    public Mail(String subject, String message, String senderName) {
        Subject = subject;
        Message = message;
        SenderName = senderName;
        color = Util.getRandomColor();
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getSenderName() {
        return SenderName;
    }

    public void setSenderName(String senderName) {
        SenderName = senderName;
    }

    public String getColor() {
        return color;
    }
}
