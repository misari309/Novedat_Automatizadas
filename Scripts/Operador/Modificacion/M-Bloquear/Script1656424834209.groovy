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

for (int i = 19	; i <= 27; i++) {
	
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
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Bloquear\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Experian LATAMB - Preview - Sign In/input_Remember me_okta-signin-submit'))
	
		WebUI.delay(5)
	
		WebUI.executeJavaScript('window.open()', [])
	
		WebUI.switchToWindowIndex(1)
	
		WebUI.navigateToUrl(GlobalVariable.url_operador)
	
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Bloquear\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Men'))
	
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Bloquear\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Modificacin'))
	
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input__idNumber'), personIdNumber)
	
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Nmero de Obligacin_obligationNumber'), accountNumber)
	
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneActualizacin en lneaManten_76b44e'), '1', true)
	
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Bloquear\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/button_Enviar'))
	
		WebUI.scrollToElement(findTestObject('Page_Novedat/div_COC 450633611111111400 PROMODESCUENTO S'), 5)
	
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Bloquear\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/div_COC 450633611111111400 PROMODESCUENTO S'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Radica Caso_accept-alert-modal (2)'))
		
		WebUI.waitForPageLoad(3)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/span_Bloquear'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Bloquear\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/input_Alert Model_continuar (2)'), 5)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Alert Model_continuar (2)'))
		
		WebUI.delay(2)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Bloquear\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Delete_accept-delete'))
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/select_Select  4-INCONSISTENCIA EN EL SISTE_176edf'), 5)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_Select  4-INCONSISTENCIA EN EL SISTE_176edf'),'4', true)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Bloquear\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_ObservationComment_continuar (1)'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Bloquear\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		caseNumber = WebUI.getText(findTestObject('Object Repository/Page_Novedat/span_AL0993389879'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Vector Comportamiento_goMyList (1)'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_ANALISTAREVISOR (1)'), 'REVIEWER', true)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneRECLAMOMODIFICACIONTIPO DO_b4f5c4 (1)'),'2', true)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneModificacinCorregido por A_b21c35 (1)'),'5', true)
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Consultar por_idFilter3 (1)'), caseNumber)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Bloquear\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Consultar por_btn btn-primary ml-1 (1)'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/span_AL0993389879_1'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Fecha de anlisis_btn btn-primary pull-right (1)'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Bloquear\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Accin Aprobar_accept-motivo-aprobacion (1)'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Vector Comportamiento_goMyList (1)'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_ANALISTAREVISOR (1)'), 'ANALYST', true)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Modificacin (2)'))
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input__idNumber (2)'), personIdNumber)
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Nmero de Obligacin_obligationNumber (2)'), accountNumber)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneActualizacin en lneaManten_76b44e (2)'),'1', true)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/button_Enviar (2)'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = (((('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera) + '\\Modificacion\\Bloquear\\') + nScreenshot) + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/btn_index'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Acciones Operador'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Reactivacin Cuentas'))
		
		WebUI.setText(findTestObject('Page_Novedat/input__idNumber'), personIdNumber)
		
		WebUI.setText(findTestObject('Page_Novedat/input_Nmero de Obligacin_obligationNumber'), accountNumber)
		
		WebUI.click(findTestObject('Page_Novedat/button_Enviar'))
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/div_B_obligacion-notify'), 0)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/div_B_obligacion-notify'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneFINALIZ EL PROCESO DE INVE_c417e2'), '025', true)
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/textarea__observation'), 'test')
		
		WebUI.click(findTestObject('Page_Novedat/input__accept-alert-modal'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_test_btn btn-primary'))
	
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



