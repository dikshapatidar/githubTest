

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog implements Serializable {
	 transient  final int i = 10;
  transient static int j = 20;

}

class SerializeDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Dog d1 = new Dog();

		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);

		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();

		System.out.println(d2.i + "......." + d2.j);

	}
}
