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

TestData accounts = findTestData('Data Files/CuentasGeneral')
personIdNumber = accounts.getValue('personIdNumber', 64)
accountNumber = accounts.getValue('accountNumber', 64)
int nScreenshot = 0
String screenshot

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-login.datacredito.com.co/login/login.htm')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Username_username'), GlobalVariable.user)

WebUI.setText(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Password_password'), GlobalVariable.password)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Remember me_okta-signin-submit'))

WebUI.delay(5)

WebUI.executeJavaScript('window.open()', [])

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl('https://dev-novedat.datacredito.com.co/?entidad=900422614')

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Men'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/div_Alertas y comentarios_col-sm-2'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Formulario de consulta'))

WebUI.click(findTestObject('Page_Novedat/li_Formulacin Reclamos Operador'))

WebUI.setText(findTestObject('Page_Novedat/input__idNumber'), personIdNumber)

WebUI.setText(findTestObject('Page_Novedat/input_Nmero de Obligacin_obligationNumber'), accountNumber)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneDerecho de PeticinTrmino d_6b3198'), '5', true)

WebUI.click(findTestObject('Page_Novedat/button_Enviar'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/div_CFE 000000111111492101 ACTIVACOOP'), 5)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Object Repository/Page_Novedat/div_CFE 000000111111492101 ACTIVACOOP'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input__accept-alert-modal'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.scrollToElement(findTestObject('Page_Novedat/select_Seleccione ACTUALIZAR LA INFORMACIN _308cb5'), 2)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_Seleccione ACTUALIZAR LA INFORMACIN _308cb5'), '02', true)

WebUI.click(findTestObject('Page_Novedat/span_No actualizacin de la informacin'))

WebUI.scrollToElement(findTestObject('Page_Novedat/label_He ledo y entendido los trminos del proceso'), 5)

WebUI.setText(findTestObject('Page_Novedat/textarea__momentKnowInfoForm'), 'test')

WebUI.click(findTestObject('Page_Novedat/label_He ledo y entendido los trminos del proceso'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/btn_editar'), 5)

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

WebUI.scrollToElement(findTestObject('Page_Novedat/input_Error Modal_continuar'), 5)

WebUI.click(findTestObject('Page_Novedat/label_Acepto los trminos y condiciones'))

WebUI.click(findTestObject('Page_Novedat/label_Acepto recibir respuestas de este rec_83a274'))

WebUI.click(findTestObject('Page_Novedat/input_Error Modal_continuar'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_puede consultar su historia de crdito_bdb83d'))

WebUI.delay(3)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input__accept-assing-modal'))

WebUI.click(findTestObject('Page_Novedat/span_Bloquear'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.scrollToElement(findTestObject('Page_Novedat/input_Error Modal_continuar'), 5)

WebUI.click(findTestObject('Page_Novedat/input_Error Modal_continuar'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Novedat/input_Delete_accept-delete'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.scrollToElement(findTestObject('Page_Novedat/input__continuar'), 5)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_Select  4-INCONSISTENCIA EN EL SISTE_176edf'), '4', true)

WebUI.setText(findTestObject('Page_Novedat/textarea__observationCitizen'), 'test')

WebUI.click(findTestObject('Page_Novedat/input__continuar'))

WebUI.delay(3)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Vector Comportamiento_goMyList'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_ANALISTAREVISOR'), 'REVIEWER', true)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Men'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Operaciones masivas'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneMODIFICACINRECLAMO'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneDEVOLVERAPROBARDESASIGNARR_d86014'), '5', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneCorregido por Actualizacin_bd1ea0'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneReclamoTipo de DocumentoTi_cb090e'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccionePrrrogaRecurso de Reposici_6894ea'), '9', true)

WebUI.setText(findTestObject('Page_Novedat/input_Filtro 3_filter3Form'), accountNumber)

WebUI.click(findTestObject('Page_Novedat/button_Buscar'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Estado Proceso_checkboxListCom'))

WebUI.setText(findTestObject('Page_Novedat/input__emailForm'), 'dalonso@stt.com.co')

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneInformacin cambio en actua_ce7fb1'), '7', true)

WebUI.scrollToElement(findTestObject('Page_Novedat/select_Seleccione  1-Investigacin interna d_6ab5eb'), 5)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_Seleccione  1-Investigacin interna d_6ab5eb'), '1', true)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Telfono Celular_btn btn-inverse2 pull_ad7ef9'))

WebUI.click(findTestObject('Page_Novedat/input__accept-alert-confirm-modal-action'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input__accept-alert-confirm-modal'))

WebUI.click(findTestObject('Page_Novedat/input__accept-modal-success'))

WebUI.click(findTestObject('Page_Novedat/li_Lista'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_ANALISTAREVISOR'), 'ANALYST', true)

WebUI.click(findTestObject('Page_Novedat/li_Men'))

WebUI.click(findTestObject('Page_Novedat/li_Reclamos'))

WebUI.click(findTestObject('Page_Novedat/li_Formulario de consulta'))

WebUI.click(findTestObject('Page_Novedat/li_Formulacin Reclamos Operador'))

WebUI.setText(findTestObject('Page_Novedat/input__idNumber'), personIdNumber)

WebUI.setText(findTestObject('Page_Novedat/input_Nmero de Obligacin_obligationNumber'), accountNumber)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneDerecho de PeticinTrmino d_6b3198'), '5', true)

WebUI.click(findTestObject('Page_Novedat/button_Enviar'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/div_CVE 000000111699097121 VOTRE PASSION  S'), 5)

WebUI.click(findTestObject('Object Repository/Page_Novedat/div_CVE 000000111699097121 VOTRE PASSION  S'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\64. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Acciones Operador'))

WebUI.click(findTestObject('Page_Novedat/li_Reactivacin Cuentas'))

WebUI.setText(findTestObject('Page_Novedat/input__idNumber'), personIdNumber)

WebUI.setText(findTestObject('Page_Novedat/input_Nmero de Obligacin_obligationNumber'), accountNumber)

WebUI.click(findTestObject('Page_Novedat/button_Enviar'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/h3_CVE 000000111699097121 VOTRE PASSION  SB'), 5)

WebUI.click(findTestObject('Object Repository/Page_Novedat/h3_CVE 000000111699097121 VOTRE PASSION  SB'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneFINALIZ EL PROCESO DE INVE_c417e2'), '025', true)

WebUI.setText(findTestObject('Page_Novedat/textarea__observation'), 'test')

WebUI.click(findTestObject('Page_Novedat/input__accept-alert-modal'))

WebUI.click(findTestObject('Object Repository/Page_Novedat/input_test_btn btn-primary'))

