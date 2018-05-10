package example;

import java.util.Date;

import model.Bar;

public class Foo
{
	public Bar bar;
	public String greeting;
	public Date bDay;

	public Foo()
	{
	}

	public Foo(String hello, Date bDay)
	{
		this.greeting = hello;
		this.bDay = bDay;
	}

	public Foo(Bar bar, String greeting, Date bDay)
	{
		this.bar = bar;
		this.greeting = greeting;
		this.bDay = bDay;
	}
}
