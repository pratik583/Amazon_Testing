package customkeyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select



public class helloworld {

	@Keyword
	def printHello(String name) {
		println("\n---------hello guys! hello " +name+"-----------\n")
	}

	@Keyword
	def CheckDropdownListElementExist(TestObject object, String option) {
		boolean flag= false;

		WebElement element = WebUiCommonHelper.findWebElements(object, 20);

		Select ddl = new Select(element)

		for(WebElement ele: ddl.getOptions()) {
			if (ele.getText()().equals(option)){
				System.out.println("Element exist");
				flag =true;
			}
			else {
				System.out.println("Element does not exist");
			}
		}
		return flag;
	}
}
