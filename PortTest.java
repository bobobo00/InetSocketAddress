package Location;

import java.net.InetSocketAddress;

import javax.xml.transform.Source;

/**
 * 端口
 * 1，区分软件的
 * 2，两个字节
 * 3，UDP TCP不同
 * 4，同一个协议下，端口号不要重复。
 * 
 * InetSocketAddress
 * 构造器：
 * 
 * @author dell
 *
 */
public class PortTest {
	public static void main(String[] args) {
		//父类SocketAddress
		InetSocketAddress socketAddress=new InetSocketAddress("127.0.0.1",8080);//通过IP地址，指定端口
		InetSocketAddress socketAddress1=new InetSocketAddress("LocalHost",9000);//通过域名，获取端口
		
		System.out.println(socketAddress.getHostName());
		System.out.println(socketAddress1.getHostName());
		
		System.out.println(socketAddress.getAddress());
		System.out.println(socketAddress1.getAddress());
		
		System.out.println(socketAddress.getPort());
		System.out.println(socketAddress1.getPort());
	}

}
