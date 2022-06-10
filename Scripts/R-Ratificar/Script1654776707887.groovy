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

for(int i=0;i<9;i++) {
	nScreenshot = 0
	String personIdNumber = accounts.getValue('personIdNumber', i)
	String accountNumber = accounts.getValue('accountNumber', i)
	String cartera = accounts.getValue('cartera', i)
	String caseNumber = ""
	
	WebUI.openBrowser('')
	
	WebUI.navigateToUrl('https://dev-login.datacredito.com.co/login/login.htm')
	
	WebUI.setText(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Experian LATAMB - Preview - Sign In/input_Username_username'), '1-80168185@dev.datacredito.com.co')
	
	WebUI.setEncryptedText(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Experian LATAMB - Preview - Sign In/input_Password_password'), 'OzQGslQmBm+Et1xdB1NeKw==')
	
	WebUI.maximizeWindow()
	
	//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
	screenshot = "C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\" + cartera + "\\Reclamo\\Ratificar\\" + nScreenshot + ".png"
	WebUI.takeScreenshot(screenshot)
	nScreenshot++
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	WebUI.click(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Experian LATAMB - Preview - Sign In/input_Remember me_okta-signin-submit'))
	
	WebUI.delay(5)
	
	WebUI.executeJavaScript('window.open()', [])
	
	WebUI.switchToWindowTitle('Novedat')
	
	WebUI.navigateToUrl('https://dev-novedat.datacredito.com.co/?entidad=900422614')
	
	//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
	screenshot = "C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\" + cartera + "\\Reclamo\\Ratificar\\" + nScreenshot + ".png"
	WebUI.takeScreenshot(screenshot)
	nScreenshot++
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	WebUI.click(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/li_Men'))
	
	WebUI.click(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/li_Reclamos'))
	
	//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
	screenshot = "C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\" + cartera + "\\Reclamo\\Ratificar\\" + nScreenshot + ".png"
	WebUI.takeScreenshot(screenshot)
	nScreenshot++
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	WebUI.click(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/li_Formulario de consulta'))
	
	WebUI.click(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/li_Formulacin Reclamos Operador'))
	
	WebUI.setText(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/input__idNumber'), personIdNumber)
	
	WebUI.setText(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/input_Nmero de Obligacin_obligationNumber'), accountNumber)
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/select_SeleccioneDerecho de PeticinTrmino d_6b3198'), '5', true)
	
	//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
	screenshot = "C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\" + cartera + "\\Reclamo\\Ratificar\\" + nScreenshot + ".png"
	WebUI.takeScreenshot(screenshot)
	nScreenshot++
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	WebUI.click(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/button_Enviar'))
	
	WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/div_CVE 327001610111111800 YOYO SAS'), 5)
	
	//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
	screenshot = "C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\" + cartera + "\\Reclamo\\Ratificar\\" + nScreenshot + ".png"
	WebUI.takeScreenshot(screenshot)
	nScreenshot++
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	WebUI.click(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/div_CVE 327001610111111800 YOYO SAS'))
	
	//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
	screenshot = "C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\" + cartera + "\\Reclamo\\Ratificar\\" + nScreenshot + ".png"
	WebUI.takeScreenshot(screenshot)
	nScreenshot++
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	WebUI.click(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/input__accept-alert-modal'))
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/select_Seleccione ACTUALIZAR LA INFORMACIN _308cb5'), '02', true)
	
	WebUI.click(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/span_No actualizacin de la informacin'))
	
	WebUI.setText(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/textarea__momentKnowInfoForm'), 'test')
	
	WebUI.click(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/label_He ledo y entendido los trminos del proceso'))
	
	WebUI.setText(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/input_Correo Electrnico_emailDisputeform'), 'dalonso@stt.com.co')
	
	WebUI.setText(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/input_Confirmar Correo electrnico_reemailDi_160b6f'), 'dalonso@stt.com.co')
	
	WebUI.click(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/input_Telfono Celular_btn btn-inverse2 pull_ad7ef9'))
	
	WebUI.click(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/input_www.datacredito.com.co_termConditions_1ccce0'))
	
	WebUI.click(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/label_Acepto recibir respuestas de este rec_83a274'))
	
	//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
	screenshot = "C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\" + cartera + "\\Reclamo\\Ratificar\\" + nScreenshot + ".png"
	WebUI.takeScreenshot(screenshot)
	nScreenshot++
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	WebUI.click(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/input_Error Modal_continuar'))
	
	WebUI.click(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/input_puede consultar su historia de crdito_bdb83d'))
	
	WebUI.click(findTestObject('Object Repository/Page_Novedat_Reclamo/Page_Novedat/input__accept-assing-modal'))

}