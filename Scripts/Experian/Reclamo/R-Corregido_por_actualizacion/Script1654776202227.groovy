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

for (int i = 1; i <= 9 ; i++) {
	
    nScreenshot = 0
    String personIdNumber = accounts.getValue('personIdNumber', i)
    String accountNumber = accounts.getValue('accountNumber', i)
    String cartera = accounts.getValue('cartera', i)
    String caseNumber = ''
	
	try {
		
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://dev-login.datacredito.com.co/login/login.htm')
		
		WebUI.setText(findTestObject('Object Repository/Page_Experian LATAMB - Preview - Sign In/input_Username_username (3)'), '1-80168185@dev.datacredito.com.co')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Experian LATAMB - Preview - Sign In/input_Password_password (3)'), GlobalVariable.password)
		
		WebUI.maximizeWindow()
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = "C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\" + cartera + "\\Reclamo\\Corregido_por_actualizacion\\" + nScreenshot + ".png"
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Experian LATAMB - Preview - Sign In/input_Remember me_okta-signin-submit (3)'))
		
		WebUI.executeJavaScript("window.open()", [])
		
		WebUI.switchToWindowIndex(1)
		
		WebUI.navigateToUrl('https://dev-novedat.datacredito.com.co/?entidad=900422614')
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Men (3)'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = "C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\" + cartera + "\\Reclamo\\Corregido_por_actualizacion\\" + nScreenshot + ".png"
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Reclamos'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Formulario de consulta'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Formulacin Reclamos Operador'))
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input__idNumber (3)'), personIdNumber)
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Nmero de Obligacin_obligationNumber (3)'), accountNumber)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneDerecho de PeticinTrmino d_6b3198'), '5', true)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = "C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\" + cartera + "\\Reclamo\\Corregido_por_actualizacion\\" + nScreenshot + ".png"
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/button_Enviar (3)'))
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/div_MCR 11-192111426111100 FINANFUTURO'), 5)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/div_MCR 11-192111426111100 FINANFUTURO'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input__accept-alert-modal'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_Seleccione ACTUALIZAR LA INFORMACIN _308cb5'), '02', true)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = "C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\" + cartera + "\\Reclamo\\Corregido_por_actualizacion\\" + nScreenshot + ".png"
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/span_No actualizacin de la informacin'), 5)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/span_No actualizacin de la informacin'))
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/textarea__momentKnowInfoForm'), 'test')
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/label_He ledo y entendido los trminos del proceso'))
		
		String value_btn_editUserEmail = WebUI.getAttribute(findTestObject('Object Repository/Page_Novedat/btn_editar'), 'value')
		
		if(value_btn_editUserEmail.equals("Listo")) {
			
			WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Correo Electrnico_emailDisputeform'), 'dalonso@stt.com.co')
			
			WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Confirmar Correo electrnico_reemailDi_160b6f'), 'dalonso@stt.com.co')
			
			WebUI.click(findTestObject('Object Repository/Page_Novedat/btn_editar'))
			
		} else {
			
			WebUI.click(findTestObject('Object Repository/Page_Novedat/btn_editar'))
			
			WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Correo Electrnico_emailDisputeform'), 'dalonso@stt.com.co')
			
			WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Confirmar Correo electrnico_reemailDi_160b6f'), 'dalonso@stt.com.co')
			
			WebUI.click(findTestObject('Object Repository/Page_Novedat/btn_editar'))
			
		}
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/input_Error Modal_continuar'), 5)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/label_Acepto los trminos y condiciones'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/label_Acepto recibir respuestas de este rec_83a274'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Error Modal_continuar'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_puede consultar su historia de crdito_bdb83d'))
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = "C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\" + cartera + "\\Reclamo\\Corregido_por_actualizacion\\" + nScreenshot + ".png"
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input__accept-assing-modal'))
		
		WebUI.waitForPageLoad(2)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = "C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\" + cartera + "\\Reclamo\\Corregido_por_actualizacion\\" + nScreenshot + ".png"
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.waitForPageLoad(5)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/span_Corregido por Actualizacin (1)'))
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/input_Error Modal_continuar'), 5)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = "C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\" + cartera + "\\Reclamo\\Corregido_por_actualizacion\\" + nScreenshot + ".png"
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/input_Error Modal_continuar'), 5)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Error Modal_continuar'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Proceed  Without Changes_accept-transmit (1)'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_Select  34-REGISTRO YA ACTUALIZADO  _06b062 (1)'), '34', true)
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/textarea__observationCitizen'), 'test')
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = "C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\" + cartera + "\\Reclamo\\Corregido_por_actualizacion\\" + nScreenshot + ".png"
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input__continuar'))
		
		WebUI.waitForPageLoad(2)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = "C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\" + cartera + "\\Reclamo\\Corregido_por_actualizacion\\" + nScreenshot + ".png"
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		caseNumber = WebUI.getText(findTestObject('Object Repository/Page_Novedat/span_70004852'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Vector Comportamiento_goMyList (2)'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_ANALISTAREVISOR (2)'), 'REVIEWER', true)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneRECLAMOMODIFICACIONTIPO DO_b4f5c4 (2)'), '1', true)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneModificacinCorregido por A_b624b6'), '10', true)
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Consultar por_idFilter3 (2)'), caseNumber)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Consultar por_btn btn-primary ml-1 (2)'))
		
		WebUI.waitForPageLoad(2)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = "C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\" + cartera + "\\Reclamo\\Corregido_por_actualizacion\\" + nScreenshot + ".png"
		WebUI.takeScreenshot(screenshot)
		nScreenshot++
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/span_70004852'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Fecha de anlisis_btn btn-primary pull-right (2)'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Accin Aprobar_accept-motivo-aprobacion (2)'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Vector Comportamiento_goMyList (2)'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_ANALISTAREVISOR (2)'), 'ANALYST', true)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Men (3)'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/div_Reclamos'))
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/label_Formulario de consulta'))
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input__idNumber (3)'), personIdNumber)
		
		WebUI.setText(findTestObject('Object Repository/Page_Novedat/input_Nmero de Obligacin_obligationNumber (3)'), accountNumber)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Formulacin Reclamos Operador'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneDerecho de PeticinTrmino d_6b3198'), '5', true)
		
		WebUI.click(findTestObject('Object Repository/Page_Novedat/button_Enviar (3)'))
		
		WebUI.waitForPageLoad(2)
		
		WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/div_MCR 11-192111426111100 FINANFUTURO'), 5)
		
		//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
		screenshot = "C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\" + cartera + "\\Reclamo\\Corregido_por_actualizacion\\" + nScreenshot + ".png"
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
	
	
	
	

