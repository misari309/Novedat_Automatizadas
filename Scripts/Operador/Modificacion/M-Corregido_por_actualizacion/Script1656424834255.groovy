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
TestData accounts = findTestData('Data Files/CuentasGeneral')

for (int i = 1; i <= 9; i++) {
	
    nScreenshot = 0
    String personIdNumber = accounts.getValue('personIdNumber', i)
    String accountNumber = accounts.getValue('accountNumber', i)
    String cartera = accounts.getValue('cartera', i)
    String caseNumber = ''

	try {
		
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://dev-login.datacredito.com.co/login/login.htm')
	
		WebUI.setText(findTestObject('Object Repository/Page_Experian LATAMB - Preview - Sign In/input_Username_username'), GlobalVariable.user_operador)
	
		WebUI.setText(findTestObject('Object Repository/Page_Experian LATAMB - Preview - Sign In/input_Password_password'), GlobalVariable.password_operador)
	
		WebUI.maximizeWindow()
	
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = ((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Modificacion\\Corregido_por_actualizacion\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Experian LATAMB - Preview - Sign In/input_Remember me_okta-signin-submit'))
	
		WebUI.delay(5)
	
		WebUI.executeJavaScript('window.open()', [])
	
		WebUI.switchToWindowIndex(1)
	
		WebUI.navigateToUrl(GlobalVariable.url_operador)
	
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = ((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Modificacion\\Corregido_por_actualizacion\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Men'))
	
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = ((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Modificacion\\Corregido_por_actualizacion\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Modificacin'))
	
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input__idNumber'), personIdNumber)
	
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Nmero de Obligacin_obligationNumber'), accountNumber)
	
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneActualizacin en lneaManten_76b44e'),'1', true)
	
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = ((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Modificacion\\Corregido_por_actualizacion\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/button_Enviar'))
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/div_COC 450633611111111400 PROMODESCUENTO S'), 5)
	
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = ((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Modificacion\\Corregido_por_actualizacion\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/div_COC 450633611111111400 PROMODESCUENTO S'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/btn_aceptar'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = ((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Modificacion\\Corregido_por_actualizacion\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/span_Corregido por Actualizacin'))
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/input_Alert Model_continuar'), 5)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = ((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Modificacion\\Corregido_por_actualizacion\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Alert Model_continuar'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = ((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Modificacion\\Corregido_por_actualizacion\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Proceed  Without Changes_accept-transmit'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_Select  34-REGISTRO YA ACTUALIZADO  _06b062'), '34', true)
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/input_ObservationComment_continuar'), 5)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = ((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Modificacion\\Corregido_por_actualizacion\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_ObservationComment_continuar'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = ((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Modificacion\\Corregido_por_actualizacion\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		caseNumber = WebUI.getText(findTestObject('Object Repository/Page_Novedat/span_AL0993389796'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Vector Comportamiento_goMyList'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_ANALISTAREVISOR'), 'REVIEWER', true)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneRECLAMOMODIFICACIONTIPO DO_b4f5c4'), '2', true)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneModificacinCorregido por A_b21c35'), '5', true)
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Consultar por_idFilter3'), caseNumber)
		
		//Screenshot -----------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = ((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Modificacion\\Corregido_por_actualizacion\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Consultar por_btn btn-primary ml-1'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/span_AL0993389796_1'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Fecha de anlisis_btn btn-primary pull-right'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Accin Aprobar_accept-motivo-aprobacion'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Vector Comportamiento_goMyList'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_ANALISTAREVISOR'), 'ANALYST', true)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Modificacin'))
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input__idNumber'), personIdNumber)
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Nmero de Obligacin_obligationNumber'), accountNumber)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneActualizacin en lneaManten_76b44e'), '1', true)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = ((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Modificacion\\Corregido_por_actualizacion\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/button_Enviar'))
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/div_COC 450633611111111400 PROMODESCUENTO S'), 5)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = ((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Modificacion\\Corregido_por_actualizacion\\') + nScreenshot) + '.png')
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



