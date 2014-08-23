package com.lofter.youyoulearning.quxinyong.javamail;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public class Demo2 {
	public static void main(String[] args) throws AddressException,
			MessagingException {
		Properties props = new Properties();
		props.setProperty("mail.smtp.auth", "true");
		props.setProperty("mail.transport.protocol", "smtp");
		Session session = Session.getInstance(props, new Authenticator() {
			String userName = "email@sina.com";
			String password = "123456";

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, password);
			}
		});

		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress("email@sina.cn"));
		msg.setSubject("中文主题");
		msg.setContent("<span style=\"color:red\">中文呵呵呵</span>",
				"text/html;charset=utf-8");
		msg.setRecipients(RecipientType.TO, InternetAddress
				.parse("itcast_test@sina.com," + "itcast_test@sohu.com"));
		Transport.send(msg);
	}
}
