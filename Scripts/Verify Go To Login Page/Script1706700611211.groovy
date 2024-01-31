import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.comment('Login to Kompas')

WebUI.openBrowser('https://kompas.com/')

WebUI.click(findTestObject('Page_Berita Terkini Hari Ini, Kabar Akurat Terpercaya - Kompas.com/i_Koin_sso__icon__login_top'))

WebUI.click(findTestObject('Page_Berita Terkini Hari Ini, Kabar Akurat Terpercaya - Kompas.com/span_Login'))

WebUI.comment('Directing to Login Page')

WebUI.verifyElementPresent(findTestObject('Page_Login - KG Media ID/h1_KG Media ID'), 0)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

