package TH_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class check_dangky extends Astractclass_2 {
	public static void dangky() {
		WebElement click_DangKy = driver.findElement(By.xpath("//tbody//td[@class='mouseOut']//a[text()='REGISTER']"));
		click_DangKy.click();
		WebElement first_Name = driver.findElement(By.xpath("//input[@name='firstName']"));
		first_Name.clear();
		first_Name.sendKeys("TranChi");
		WebElement last_Name =driver.findElement(By.xpath("//input[@name='lastName']"));
		last_Name.clear();
		last_Name.sendKeys("Thien");
	}
}
//Thầy ơi cho xem xin bổ sung code phần này sau...Em bị sốt từ đêm 15/10 đến giờ..Em cám ơn thầy