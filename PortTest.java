package Location;

import java.net.InetSocketAddress;

import javax.xml.transform.Source;

/**
 * �˿�
 * 1�����������
 * 2�������ֽ�
 * 3��UDP TCP��ͬ
 * 4��ͬһ��Э���£��˿ںŲ�Ҫ�ظ���
 * 
 * InetSocketAddress
 * ��������
 * 
 * @author dell
 *
 */
public class PortTest {
	public static void main(String[] args) {
		//����SocketAddress
		InetSocketAddress socketAddress=new InetSocketAddress("127.0.0.1",8080);//ͨ��IP��ַ��ָ���˿�
		InetSocketAddress socketAddress1=new InetSocketAddress("LocalHost",9000);//ͨ����������ȡ�˿�
		
		System.out.println(socketAddress.getHostName());
		System.out.println(socketAddress1.getHostName());
		
		System.out.println(socketAddress.getAddress());
		System.out.println(socketAddress1.getAddress());
		
		System.out.println(socketAddress.getPort());
		System.out.println(socketAddress1.getPort());
	}

}
