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

int nScreenshot = 0
String screenshot
TestData accounts = findTestData('Data Files/Accounts_modificacion')

for (int i = 1; i <= 9; i++) {
	
    nScreenshot = 0
    String personIdNumber = accounts.getValue('personIdNumber', i)
    String accountNumber = accounts.getValue('accountNumber', i)
    String cartera = accounts.getValue('cartera', i)
    String caseNumber = ''

	try {
		
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://dev-login.datacredito.com.co/login/login.htm')
	
		WebUI.setText(findTestObject('Object Repository/Page_Experian LATAMB - Preview - Sign In/input_Username_username (1)'), '1-80168185@dev.datacredito.com.co')
	
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Experian LATAMB - Preview - Sign In/input_Password_password (1)'), GlobalVariable.password)
	
		WebUI.maximizeWindow()
	
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Corregido_por_actualizacion\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Experian LATAMB - Preview - Sign In/input_Remember me_okta-signin-submit (1)'))
	
		WebUI.delay(5)
	
		WebUI.executeJavaScript('window.open()', [])
	
		WebUI.switchToWindowIndex(1)
	
		WebUI.navigateToUrl('https://dev-novedat.datacredito.com.co/?entidad=900422614')
	
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Cerrar_caso\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Men (1)'))
	
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Cerrar_caso\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Modificacin (1)'))
	
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input__idNumber (1)'), personIdNumber)
	
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Nmero de Obligacin_obligationNumber (1)'), accountNumber)
	
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneActualizacin en lneaManten_76b44e (1)'), '1', true)
	
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Cerrar_caso\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/button_Enviar (1)'))
	
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/div_COC 450633611111111400 PROMODESCUENTO S (1)'), 5)
	
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Cerrar_caso\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/div_COC 450633611111111400 PROMODESCUENTO S (1)'))
		
		WebUI.waitForPageLoad(3)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Radica Caso_accept-alert-modal (1)'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Cerrar_caso\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/span_Close Case'))
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/input_Alert Model_continuar (1)'), 5)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Cerrar_caso\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Alert Model_continuar (1)'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Cerrar_caso\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Accin Cerrar Caso_accept-close-case-modal'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Modificacin (1)'))
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input__idNumber (1)'), personIdNumber)
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Nmero de Obligacin_obligationNumber (1)'), accountNumber)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneActualizacin en lneaManten_76b44e (1)'), '1', true)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/button_Enviar (1)'))
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/div_COC 450633611111111400 PROMODESCUENTO S (1)'), 5)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Cerrar_caso\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		println("----------------------------------------------------------------------------")
		println("personIdNumber: " + personIdNumber + " cartera: " + cartera + " funciona.")
		println("----------------------------------------------------------------------------")
		
	}catch(def err) {
		
		println("----------------------------------------------------------------------------")
		println(err)
		println("personIdNumber: " + personIdNumber + " cartera: " + cartera + " no funciona.")
		println("----------------------------------------------------------------------------")
		
	}
    
}



