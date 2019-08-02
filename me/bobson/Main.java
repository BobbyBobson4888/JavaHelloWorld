package me.bobson;
import me.bobson.helloworld.HelloWorldWriter;
import me.bobson.helloworld.HelloWorld;
import me.bobson.helloworld.HelloWorldFactory;

public class Main {

	public static void main(String[] args) {
		HelloWorldFactory hwwf = new HelloWorldFactory();
		HelloWorld hw = hwwf.CreateHelloWorld();
		HelloWorldWriter hww = new HelloWorldWriter();
		hww.WriteHelloWorld(hw);
	}

}
