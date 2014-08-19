package com.lofter.youyoulearning.quxinyong.servlet.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyWebServer {
	public static void main(String[] args) {
		String path = "E:/360Downloads/solr-4.8.1/solr-4.8.1/docs/index.html";
		try {
			ServerSocket ss = new ServerSocket(9999);
			System.out.println("在 9999 上等待连接 . . . ");
			Socket s = ss.accept();
			// 提示一句话

			OutputStream os = s.getOutputStream();
			BufferedReader br = new BufferedReader(new FileReader(path));
			String buf = "";
			while ((buf = br.readLine()) != null) {
				os.write(buf.getBytes());
			}
			// 关闭流
			br.close();
			os.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
