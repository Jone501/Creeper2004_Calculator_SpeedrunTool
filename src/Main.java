import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        Robot robot = null;
        try { robot = new Robot(); }
        catch (AWTException e) { System.out.println(e.getMessage()); }
        System.out.println(3);
        robot.delay(1000);
        System.out.println(2);
        robot.delay(1000);
        System.out.println(1);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_1);
        robot.keyRelease(KeyEvent.VK_1);
        robot.delay(100);
        while (true) {
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_PLUS);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_PLUS);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);
        }
    }
}