package com.lofter.youyoulearning.quxinyong.javamail;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Demo1 {

	public static void main(String[] args) throws MessagingException,
			IOException {
		String path = "com/lofter/youyoulearning/quxinyong/javamail/mail.properties";
		Properties props = new Properties();
		props.load(ClassLoader.getSystemResourceAsStream(path));

		Session session = Session.getDefaultInstance(props);
		Message msg = new MimeMessage(session);
		msg.setText("你好吗？");
		Address address = new InternetAddress("lili@sohu.com");
		msg.setFrom(address);

		Transport transport = session.getTransport();
		transport.connect("smtp.sina.com", 25, "itcast_test", "123456");
		transport.send(msg, new Address[] { new InternetAddress(
				"804143921@qq.com") });
		transport.close();

	}
}
