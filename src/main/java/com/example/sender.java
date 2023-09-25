package com.example;

import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class sender {
    public boolean sendEmail(String to, String from, String subject, String text) {

        boolean flag = false;

        Properties p = new Properties();
        p.put("mail.smtp.auth", true);
        p.put("mail.smtp.starttls.enable", true);
        p.put("mail.smtp.port", "587");
        p.put("mail.smtp.host", "smtp-mail.outlook.com");

        Session s = Session.getInstance(p, new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("vikastester000@outlook.com", "XXXXXXXXXXX");

            }

        });

        try {

            Message message = new MimeMessage(s);

            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setFrom(new InternetAddress(from));

            message.setSubject(subject);

            message.setText(text);

            Transport.send(message);
            flag = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return flag;

    }
}
