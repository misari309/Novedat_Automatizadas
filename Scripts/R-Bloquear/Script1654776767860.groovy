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
TestData accounts = findTestData('Data Files/Accounts_reclamos')

for (int i = 7; i <= 9; i++) {
	
    nScreenshot = 0
    String personIdNumber = accounts.getValue('personIdNumber', i)
    String accountNumber = accounts.getValue('accountNumber', i)
    String cartera = accounts.getValue('cartera', i)
    String caseNumber = ''   
	
	try {
		
		WebUI.openBrowser('')
		
		WebUI.maximizeWindow()
		
		WebUI.navigateToUrl('https://dev-login.datacredito.com.co/login/login.htm')
		
		WebUI.setText(findTestObject('Object Repository/Page_Experian LATAMB - Preview - Sign In/input_Username_username (4)'), '1-80168185@dev.datacredito.com.co')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Experian LATAMB - Preview - Sign In/input_Password_password (4)'), 'OzQGslQmBm+Et1xdB1NeKw==')
		
		WebUI.click(findTestObject('Object Repository/Page_Experian LATAMB - Preview - Sign In/input_Remember me_okta-signin-submit (4)'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		WebUI.waitForPageLoad(5)
		screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Reclamo\\Bloquear\\' + nScreenshot + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.delay(5)
		
		WebUI.executeJavaScript('window.open()', [])
		
		WebUI.switchToWindowIndex(1)
		
		WebUI.navigateToUrl('https://dev-novedat.datacredito.com.co/?entidad=900422614')
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Men (4)'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		WebUI.waitForPageLoad(5)
		screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Reclamo\\Bloquear\\' + nScreenshot + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Reclamos (1)'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		WebUI.waitForPageLoad(5)
		screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Reclamo\\Bloquear\\' + nScreenshot + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Formulario de consulta (1)'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Formulacin Reclamos Operador (1)'))
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input__idNumber (4)'), personIdNumber)
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Nmero de Obligacin_obligationNumber (4)'), accountNumber)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneDerecho de PeticinTrmino d_6b3198 (1)'), '5', true)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/button_Enviar (4)'))
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/div_MCR 11-192111426111100 FINANFUTURO'), 5)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		WebUI.waitForPageLoad(5)
		screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Reclamo\\Bloquear\\' + nScreenshot + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/div_MCR 11-192111426111100 FINANFUTURO'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input__accept-alert-modal (1)'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		WebUI.waitForPageLoad(5)
		screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Reclamo\\Bloquear\\' + nScreenshot + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_Seleccione ACTUALIZAR LA INFORMACIN _308cb5 (1)'), '02', true)
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/span_No actualizacin de la informacin'), 5)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/span_No actualizacin de la informacin'))
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/textarea__momentKnowInfoForm (1)'), 'test')
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		WebUI.waitForPageLoad(5)
		screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Reclamo\\Bloquear\\' + nScreenshot + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/label_He ledo y entendido los trminos del proceso (1)'))
		
		String value_btn_editUserEmail = WebUI.getAttribute(findTestObject('Object Repository/Page_Novedat/input_Telfono Celular_btn btn-inverse2 pull_ad7ef9 (1)'), 'value')
		
		if(value_btn_editUserEmail.equals("Listo")) {
			
			WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Correo Electrnico_emailDisputeform (1)'), 'dalonso@stt.com.co')
			
			WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Confirmar Correo electrnico_reemailDi_160b6f (1)'), 'dalonso@stt.com.co')
			
			WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Telfono Celular_btn btn-inverse2 pull_ad7ef9 (1)'))
			
		} else {
			
			WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Telfono Celular_btn btn-inverse2 pull_ad7ef9 (1)'))
			
			WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Correo Electrnico_emailDisputeform (1)'), 'dalonso@stt.com.co')
			
			WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Confirmar Correo electrnico_reemailDi_160b6f (1)'), 'dalonso@stt.com.co')
			
			WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Telfono Celular_btn btn-inverse2 pull_ad7ef9 (1)'))
			
		}
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/label_Acepto los trminos y condiciones (1)'), 5)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/label_Acepto los trminos y condiciones (1)'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/label_Acepto recibir respuestas de este rec_83a274 (1)'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		WebUI.waitForPageLoad(5)
		screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Reclamo\\Bloquear\\' + nScreenshot + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/input_Error Modal_continuar (1)'), 5)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Error Modal_continuar (1)'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_puede consultar su historia de crdito_bdb83d (1)'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input__accept-assing-modal (1)'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/span_Bloquear (1)'))
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/input_Error Modal_continuar (2)'), 5)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		WebUI.waitForPageLoad(5)
		screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Reclamo\\Bloquear\\' + nScreenshot + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Error Modal_continuar (2)'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Delete_accept-delete (1)'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_Select  4-INCONSISTENCIA EN EL SISTE_176edf (1)'), '4', true)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		WebUI.waitForPageLoad(5)
		screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Reclamo\\Bloquear\\' + nScreenshot + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/textarea__observationCitizen (2)'), 'test')
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input__continuar (2)'))
		
		caseNumber = WebUI.getText(findTestObject('Object Repository/Page_Novedat/span_70004888'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		WebUI.waitForPageLoad(5)
		screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Reclamo\\Bloquear\\' + nScreenshot + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Vector Comportamiento_goMyList (4)'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_ANALISTAREVISOR (4)'), 'REVIEWER', true)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneRECLAMOMODIFICACIONTIPO DO_b4f5c4 (4)'), '1', true)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneModificacinCorregido por A_b624b6 (2)'), '10', true)
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Consultar por_idFilter3 (4)'), caseNumber)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		WebUI.waitForPageLoad(5)
		screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Reclamo\\Bloquear\\' + nScreenshot + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Consultar por_btn btn-primary ml-1 (4)'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		WebUI.waitForPageLoad(5)
		screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Reclamo\\Bloquear\\' + nScreenshot + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/span_70004888'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Fecha de anlisis_btn btn-primary pull-right (4)'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		WebUI.waitForPageLoad(5)
		screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Reclamo\\Bloquear\\' + nScreenshot + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Accin Aprobar_accept-motivo-aprobacion (4)'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		WebUI.waitForPageLoad(5)
		screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Reclamo\\Bloquear\\' + nScreenshot + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Vector Comportamiento_goMyList (4)'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_ANALISTAREVISOR (4)'), 'ANALYST', true)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Men (5)'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Reclamos (2)'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		WebUI.waitForPageLoad(5)
		screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Reclamo\\Bloquear\\' + nScreenshot + '.png')
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Formulario de consulta (2)'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Formulacin Reclamos Operador (2)'))
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input__idNumber (5)'), personIdNumber)
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Nmero de Obligacin_obligationNumber (5)'), accountNumber)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneDerecho de PeticinTrmino d_6b3198 (2)'), '5', true)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/button_Enviar (5)'))
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/div_bloqueado'), 5)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		WebUI.waitForPageLoad(5)
		screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\' + cartera + '\\Reclamo\\Bloquear\\' + nScreenshot + '.png')
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





