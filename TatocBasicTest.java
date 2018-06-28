import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TatocBasicTest {
  

 @Test
 public void t1_launch() {
	 TatocBasic.systemProp();
 }
 @Test
 public void t2_basicCourse()
 {
	 
	 String title1=basicCourse.basic_Course(); 
	 Assert.assertEquals("Grid Gate - Basic Course - T.A.T.O.C", title1);
 }
 @Test
 public void t3_greenBox()
 {
	 String greenBoxURL=GreenBox.greenBox();
	 Assert.assertEquals("http://10.0.1.86/tatoc/basic/frame/dungeon",greenBoxURL);
	 
 }
 @Test
 public void t4_paintBox()
 {
	 String paintBoxURL=PaintBox.paintBox();
	 Assert.assertEquals("http://10.0.1.86/tatoc/basic/drag",paintBoxURL);
	 
 }
 @Test
 public void t5_dragBox()
 {
	 String dragBoxURL=DragBox.dragBox();
	 Assert.assertEquals("http://10.0.1.86/tatoc/basic/cookie",dragBoxURL);
 }
 @Test
 public void t6_popWindow()
 {
	 String popWindowURL=PopWindow.popWindow();
	 Assert.assertEquals("http://10.0.1.86/tatoc/basic/cookie",popWindowURL);
	 
 }
 
 @Test
 public void t7_cookieHandle()
 {
	String cookieHandle=CookieHandle.cookieHandle();
	Assert.assertEquals("http://10.0.1.86/tatoc/end",cookieHandle);
	
 }
}
