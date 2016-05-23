package com.SherpaLogin;

//import java.sql.DriverAction;
//import java.util.concurrent.TimeUnit;
//import net.sourceforge.htmlunit.corejs.javascript.tools.shell.QuitAction;
//import org.apache.commons.collections.ClosureUtils;
//import org.omg.SendingContext.RunTime;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.os.WindowsUtils;


public class SherpaLogin {
	
	//static String exePath = "D:\\selenium Jars\\chromedriver.exe";
	
	static String WebURL = "http://172.16.77.39:9101/sherpa/";
	static String UserName = "nzi_csr";
	static String Password = "password";
	static String PostCode = "2034LM";//needs to give new address before execution
	static String HouseNo = "105";//to give new Postal code before execution
	static String Name = "Sagar";
	static String Product = "Horizon";
	static String CustType = "Residential";
	static String ProdType = "Digital TV"; 
	static String OrderType = "Shop";
	static String HorizonCPE = "1798257973";   //Gateway-sam-3p // needs to give new Horizon CPE before execution
	static String FirstName = "Sangamesh";
	static String DateOfBirth = "06-08-1989";
	static String DMMSTBCPE = "5555222479";   //DMM STB
	static String DMMSCCPE = "1210133608";    // DMM SC
	static String BundleCPE = "1798203347"; //Gateway-sam-3p
	static String InternetCPE = "0ABCYNCZ59E4";  //EMTA MO 3.0
	static String MobileICCID = "8931200000000001623";   //ICCID
	static String VOIPCPE = "0ABCYNCZ59D2";  //EMTA MO 3.0
	static String Pack3CPE = "1797181472"; 
	static String VOIPline2 = "Yes";
	static WebDriver SherpaDriver = new FirefoxDriver();
	
	public static void main(String[] args) {
		
		try {
			
			//String exePath = "D:\\selenium Jars\\chromedriver.exe";
			//System.setProperty("webdriver.chrome.driver",exePath);
			SherpaDriver.manage().deleteAllCookies();
			System.out.println("all cookies are deleted");
			WebDriverWait WaitDriver=  new WebDriverWait(SherpaDriver,10000);
			SherpaDriver.get(WebURL);
			SherpaDriver.manage().window().maximize();
			Thread.sleep(3000);
			//SherpaDriver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			SherpaDriver.switchTo().frame(SherpaDriver.findElement(By.id("iframe")));
			System.out.println("switched");
			SherpaDriver.findElement(By.id("userName")).sendKeys(UserName);
			SherpaDriver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			SherpaDriver.findElement(By.name(Password)).sendKeys(Password);
			SherpaDriver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			SherpaDriver.findElement(By.id("login")).submit();
			//SherpaDriver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			System.out.println("Logged in");
			Thread.sleep(5000);
			SherpaDriver.findElement(By.xpath(".//*[@id='newCust']")).click();
			Thread.sleep(2000);
			SherpaDriver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			System.out.println("New Customer");
			SherpaDriver.findElement(By.id("postCode")).sendKeys(PostCode);
			SherpaDriver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			SherpaDriver.findElement(By.id("houseNo")).sendKeys(HouseNo);
			SherpaDriver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			SherpaDriver.findElement(By.id("surName")).sendKeys(Name);
			//SherpaDriver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
			Thread.sleep(10000);
			//SherpaDriver.findElement(By.xpath(".//*[@id='newCust']")).click();
			SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div[1]/div/form/div/div[2]/div/div[2]/button")).click();
			Thread.sleep(5000);
			//SherpaDriver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
			
			if(CustType == "Soho"){
					SherpaDriver.findElement(By.xpath("html/body/div[9]/div[2]/div/div[3]/input")).click();
			}
			else{
					SherpaDriver.findElement(By.xpath("html/body/div[9]/div[2]/div/div[2]/input")).click();
		}
			
			SherpaDriver.findElement(By.xpath("html/body/div[9]/div[3]/div/div/button")).click();
			Thread.sleep(200000);
			//SherpaDriver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
			
			if(ProdType == "Horizon"){
				//horizon
				SherpaDriver.findElement(By.xpath(".//*[@id='Horizon']/input")).click();
				Thread.sleep(10000);
				SherpaDriver.findElement(By.xpath(".//*[@id='getOffersTable']/tbody/tr[2]/td[4]/a/img")).click();
			}
			else if(ProdType == "Digital TV"){
				//Digital TV
				SherpaDriver.findElement(By.xpath(".//*[@id='Digitale TV']/input")).click();
				Thread.sleep(10000);
				SherpaDriver.findElement(By.xpath(".//*[@id='getOffersTable']/tbody/tr[3]/td[4]/a/img")).click();
			}
			else if(ProdType == "CATV"){
				//CATV
				SherpaDriver.findElement(By.xpath(".//*[@id='CATV']/input")).click();
				Thread.sleep(10000);
				SherpaDriver.findElement(By.xpath(".//*[@id='getOffersTable']/tbody/tr/td[4]/a/img")).click();
			}
			else if(ProdType == "Bundle"){
				//Bundle
				SherpaDriver.findElement(By.xpath(".//*[@id='Bundles']/input")).click();
				Thread.sleep(10000);
				SherpaDriver.findElement(By.xpath(".//*[@id='getOffersTable']/tbody/tr[4]/td[4]/a/img")).click();
			}
			else if(ProdType == "Internet"){
				//Internet
				SherpaDriver.findElement(By.xpath(".//*[@id='Internet']/input")).click();
				Thread.sleep(10000);
				SherpaDriver.findElement(By.xpath(".//*[@id='getOffersTable']/tbody/tr[4]/td[4]/a/img")).click();
			}
			else if(ProdType == "Mobile"){
				//Mobile
				SherpaDriver.findElement(By.xpath(".//*[@id='Mobiele Telefonie']/input")).click();
				Thread.sleep(10000);
				SherpaDriver.findElement(By.xpath(".//*[@id='getOffersTable']/tbody/tr[2]/td[5]/a/img")).click();
			}
			else if(ProdType == "VOIP"){
				//VOIP
				SherpaDriver.findElement(By.xpath(".//*[@id='Telefonie']/input")).click();
				Thread.sleep(10000);
				SherpaDriver.findElement(By.xpath(".//*[@id='getOffersTable']/tbody/tr[4]/td[4]/a/img")).click();
				if(VOIPline2 == "Yes"){
					SherpaDriver.findElement(By.xpath(".//*[@id='getOffersTable']/tbody/tr[5]/td[4]/a/img")).click();
					Thread.sleep(10000);
				}
			}
			//Horizon + Internet + VOIP
			else if(ProdType == "3Pack"){
				SherpaDriver.findElement(By.xpath(".//*[@id='Totaalpakketten']/input")).click();
				Thread.sleep(10000);
				SherpaDriver.findElement(By.xpath(".//*[@id='getOffersTable']/tbody/tr[4]/td[4]/a/img")).click();
				
			}
			Thread.sleep(10000);	
				
			//Validating Subscription
			SherpaDriver.findElement(By.xpath(".//*[@id='content']/div/div[2]/div[1]/div[1]/button")).click();
			Thread.sleep(5000);
				
			if (ProdType == "Mobile"){
				SherpaDriver.findElement(By.xpath(".//*[@id='ValidateWorthinessForm']/div/div/div[1]/div/div[1]/div/span/a/span[1]")).click();
				Thread.sleep(1000);
				SherpaDriver.findElement(By.xpath(".//*[@id='ui-id-10']")).click();
				Thread.sleep(1000);
				SherpaDriver.findElement(By.id("cwdocNumber")).sendKeys("123456789");
				Thread.sleep(1000);
				SherpaDriver.findElement(By.xpath(".//*[@id='ValidateWorthinessForm']/div/div/div[3]/div/div[1]/img")).click();
				Thread.sleep(1000);
				SherpaDriver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]")).click();
				Thread.sleep(1000);
				SherpaDriver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]/option[65]")).click();
				Thread.sleep(1000);
				SherpaDriver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[1]/a")).click();
				Thread.sleep(2000);
				SherpaDriver.findElement(By.xpath(".//*[@id='ValidateWorthinessForm']/div/div/div[4]/div/div[1]/input")).sendKeys("Nag");
				Thread.sleep(1000);
				SherpaDriver.findElement(By.xpath("html/body/div[9]/div[3]/div/div[1]/button")).click();
				Thread.sleep(5000);
			}
			else if (ProdType == "CATV"){
				System.out.println("Product is CATV");
			}
			else if(ProdType != "VOIP"){
			//contract Ter mjin popup
			SherpaDriver.findElement(By.xpath("html/body/div[9]/div[3]/div/div/button")).click();
			}
			
			Thread.sleep(5000);
			if(ProdType == "Bundle"){
				SherpaDriver.findElement(By.xpath("html/body/div[9]/div[2]/div[2]/input")).click();
				Thread.sleep(3000);
				SherpaDriver.findElement(By.xpath("html/body/div[9]/div[4]/div/div[1]/button")).click();
				Thread.sleep(3000);
				SherpaDriver.findElement(By.xpath("html/body/div[9]/div[3]/div/div/button")).click();
				Thread.sleep(3000);
			}
			else if(ProdType == "Mobile"){
				SherpaDriver.findElement(By.xpath("html/body/div[10]/div[3]/div/div/button")).click();
				Thread.sleep(5000);
			}
			else if(ProdType == "3Pack"){
				SherpaDriver.findElement(By.xpath("html/body/div[9]/div[4]/div/div[1]/button")).click();
				Thread.sleep(5000);
				SherpaDriver.findElement(By.xpath("html/body/div[9]/div[3]/div/div/button")).click();
				Thread.sleep(5000);
			}
			else {//Order Validate Popup
				//html/body/div[10]/div[3]/div/div/button
				SherpaDriver.findElement(By.xpath("html/body/div[9]/div[3]/div/div/button")).click();					
				Thread.sleep(5000);
			}
			//continue order validate button
			SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div[2]/div[1]/div[2]/button")).click();
			Thread.sleep(5000);
			
			if(ProdType == "3Pack"){
				SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/form/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/span/a/span[1]")).click();
				Thread.sleep(1000);
				SherpaDriver.findElement(By.xpath("html/body/ul[1]/li[3]/a")).click();
				Thread.sleep(1000);
			}
			
			//LSP or Shop
			if(OrderType == "LSP"){
				SherpaDriver.findElement(By.xpath(".//*[@id='hardwarerelatedSection']/div[2]/div[1]/div[1]/input")).click();
			}
			else {
				SherpaDriver.findElement(By.xpath(".//*[@id='hardwarerelatedSection']/div[2]/div[1]/div[2]/input")).click();
				Thread.sleep(1000);
				if(ProdType == "Horizon"){
					SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/form/div[4]/div/div[2]/div[4]/div/div[2]/div/input")).sendKeys(HorizonCPE);
					Thread.sleep(1000);
				}
				else if(ProdType == "Digital TV"){
					SherpaDriver.findElement(By.xpath(".//*[@id='hardwarerelatedSection']/div[2]/div[1]/div[2]/input")).click();
					Thread.sleep(1000);
					//DMM STB CPE
					SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/form/div[4]/div/div[2]/div[4]/div/div[2]/div/input")).sendKeys(DMMSTBCPE);
					Thread.sleep(1000);
					SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/form/div[4]/div/div[2]/div[4]/div/div[3]/div/input")).sendKeys(DMMSCCPE);
					Thread.sleep(1000);
				}
				else if(ProdType == "Bundle"){
					SherpaDriver.findElement(By.xpath(".//*[@id='hardwarerelatedSection']/div[2]/div[1]/div[2]/input")).click();
					Thread.sleep(1000);
					SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/form/div[4]/div/div[2]/div[4]/div/div[2]/div/input")).sendKeys(BundleCPE);
					Thread.sleep(1000);
				}
				else if(ProdType == "Internet"){
					SherpaDriver.findElement(By.xpath(".//*[@id='hardwarerelatedSection']/div[2]/div[1]/div[2]/input")).click();
					Thread.sleep(1000);
					SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/form/div[4]/div/div[2]/div[4]/div/div[2]/div/input")).sendKeys(InternetCPE);
					Thread.sleep(1000);
				}
				else if(ProdType == "Mobile"){
					SherpaDriver.findElement(By.xpath(".//*[@id='hardwarerelatedSection']/div[2]/div[1]/div[2]/input")).click();
					Thread.sleep(1000);
					SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/form/div[5]/div/div[1]/div[2]/div/div/table/tbody/tr/td[3]/div/input")).clear();
					Thread.sleep(1000);
					SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/form/div[5]/div/div[1]/div[2]/div/div/table/tbody/tr/td[3]/div/input")).sendKeys(MobileICCID);
					Thread.sleep(1000);
					SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/form/div[5]/div/div[1]/div[2]/div/div/table/tbody/tr/td[6]/div[1]/span/a/span[1]")).click();
					Thread.sleep(1000);
					SherpaDriver.findElement(By.xpath("html/body/ul[5]/li[3]/a")).click();
					Thread.sleep(1000);
				}
				else if(ProdType == "VOIP"){
					SherpaDriver.findElement(By.xpath(".//*[@id='hardwarerelatedSection']/div[2]/div[1]/div[2]/input")).click();
					Thread.sleep(1000);
					SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/form/div[4]/div/div[2]/div[4]/div/div[2]/div/input")).sendKeys(VOIPCPE);
					Thread.sleep(1000);
				}
				else if(ProdType == "3Pack"){
					SherpaDriver.findElement(By.xpath(".//*[@id='hardwarerelatedSection']/div[2]/div[1]/div[2]/input")).click();
					Thread.sleep(1000);
					SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/form/div[4]/div/div[2]/div[4]/div/div[2]/div/input")).sendKeys(Pack3CPE);
					Thread.sleep(1000);
				}
			}
			Thread.sleep(3000);
			
			if(OrderType == "LSP"){
				SherpaDriver.findElement(By.xpath(".//*[@id='optionsForm']/div[8]/div[2]/div/button")).click();
			}
			else{
				//CPE Validate Button
				SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/div/div/form/div[8]/div[2]/div/button")).click();
			}
			Thread.sleep(10000);
			
			//Wish DatePopup
			SherpaDriver.findElement(By.xpath("html/body/div[10]/div[7]/div/div[2]/div/button")).click();
			Thread.sleep(5000);
			
			//Select Surname
			SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/form/div[1]/div/div[2]/div[1]/div[3]/div[3]/div/span/a/span[1]")).click();
			Thread.sleep(2000);
			SherpaDriver.findElement(By.xpath("html/body/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);
			
			//First Name
			SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/form/div[1]/div/div[2]/div[1]/div[4]/div[3]/input")).sendKeys(FirstName);
			//Thread.sleep(1000);
			//Date of Birth
			SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/form/div[1]/div/div[2]/div[1]/div[9]/div[2]/input")).clear();
			SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/form/div[1]/div/div[2]/div[1]/div[9]/div[2]/input")).sendKeys(DateOfBirth);
			//Thread.sleep(1000);
			//Phone Number
			SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/form/div[1]/div/div[2]/div[2]/div[1]/div[2]/input")).sendKeys("0645454545");
			//Thread.sleep(1000);
			//email id
			SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/form/div[1]/div/div[2]/div[2]/div[4]/div[2]/input")).sendKeys("sagar@gmail.com");
			//Thread.sleep(1000);
			//IBAN Number
			SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/form/div[4]/div/div[2]/div/div[1]/div[2]/input")).sendKeys("NL91INGB0000147859");
			//Thread.sleep(1000);
			//Continue Button
			SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/form/div[6]/div[3]/div/button")).click();
			Thread.sleep(10000);
			//place order Button
			SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/div/form/div[9]/div[3]/button")).click();
			Thread.sleep(5000);
			//sales code Popup
			SherpaDriver.findElement(By.xpath("html/body/div[10]/div[3]/div/div[1]/button")).click();
			Thread.sleep(10000);
			//capturing WID Number
			String WorIDNumber = SherpaDriver.findElement(By.xpath("html/body/div[5]/div/div/div/div[1]/div/span[3]")).getText();
			System.out.println(WorIDNumber);
			
			
			//SherpaDriver.findElement(By.partialLinkText("Name")).sendKeys(UserName);					
			//SherpaDriver.findElement(By.linkText("userName")).sendKeys(UserName);
			//SherpaDriver.findElement(By.id("userName")).sendKeys(UserName);
			//SherpaDriver.findElement(By.className("ng-pristine ng-invalid ng-invalid-required")).sendKeys(UserName);
			
			
		} catch (Exception z) {
			z.printStackTrace();
		}
		}
	
}
