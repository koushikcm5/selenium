package d7;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.*;

public class ce2 {
	int a,b,c,d;
	Scanner sc = new Scanner(System.in);
	@BeforeSuite
	public void getIntput() {
//		a = sc.nextInt();
//		b = sc.nextInt();
		a = 6;
		b = 3;
	}
	
//	int c = 0;
			
  @Test
  public void Add() {
	  c = a+b;
	  Assert.assertEquals(c, 9);
  }
  @Test
  public void Subtract() {
	  c = a-b;
	  Assert.assertEquals(c, 3);
  }
  @Test
  public void Multiply() {
	  c = a * b;
	  Assert.assertEquals(c, 18);
  }
  @Test
  public void Divide() {
	  c = a / b;
	  Assert.assertEquals(c, 2);
  }
}