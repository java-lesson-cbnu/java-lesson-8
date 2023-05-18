package kr.cbnu.lesson8;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

public class NetworkFileReadExample {
    public static void main(String[] args) {
        try {
            System.out.println("소켓 대기중..");
            Socket socket = openSocket();
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            System.out.println("데이터 대기중..");
            System.out.println(readContents(dis));
            System.out.println("완료: ");
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Socket openSocket() {
        throw new RuntimeException("이곳에서 코드를 구현하십시오.");
    }

    public static List<String> readContents(DataInputStream dataInputStream) {
        throw new RuntimeException("이곳에서 코드를 구현하십시오.");
    }
}
