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
personIdNumber = accounts.getValue('personIdNumber', 68)
accountNumber = accounts.getValue('accountNumber', 68)
int nScreenshot = 0
String screenshot

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-login.datacredito.com.co/login/login.htm')

WebUI.setText(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Username_username'), GlobalVariable.user_operador)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Password_password'), GlobalVariable.password_operador)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Remember me_okta-signin-submit'))

WebUI.executeJavaScript('window.open()', [])

WebUI.delay(5)

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl(GlobalVariable.url_operador)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Men'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Object Repository/Page_Novedat/div_Alertas y comentarios_col-sm-2'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Formulario de consulta'))

WebUI.click(findTestObject('Page_Novedat/li_Formulacin Reclamos Operador'))

WebUI.setText(findTestObject('Page_Novedat/input__idNumber'), personIdNumber)

WebUI.setText(findTestObject('Page_Novedat/input_Nmero de Obligacin_obligationNumber'), accountNumber)

WebUI.click(findTestObject('Object Repository/Page_Novedat/div_JustificacinSeleccioneDerecho de Petici_3b31c5'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneDerecho de PeticinTrmino d_6b3198'), '5', true)

WebUI.click(findTestObject('Page_Novedat/button_Enviar'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/div_CFE 000000111165051157 COOMULCAR'), 5)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Object Repository/Page_Novedat/div_CFE 000000111165051157 COOMULCAR'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input__accept-alert-modal'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.scrollToElement(findTestObject('Page_Novedat/select_Seleccione ACTUALIZAR LA INFORMACIN _308cb5'), 5)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_Seleccione ACTUALIZAR LA INFORMACIN _308cb5'), '02', true)

WebUI.click(findTestObject('Page_Novedat/span_No actualizacin de la informacin'))

WebUI.scrollToElement(findTestObject('Page_Novedat/label_He ledo y entendido los trminos del proceso'), 5)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.setText(findTestObject('Page_Novedat/textarea__momentKnowInfoForm'), 'test')

WebUI.click(findTestObject('Page_Novedat/label_He ledo y entendido los trminos del proceso'))

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

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Error Modal_continuar'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_puede consultar su historia de crdito_bdb83d'))

WebUI.delay(3)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input__accept-assing-modal'))

WebUI.click(findTestObject('Page_Novedat/span_Corregido por Actualizacin'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.scrollToElement(findTestObject('Page_Novedat/input_Error Modal_continuar'), 5)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Error Modal_continuar'))

WebUI.delay(3)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Proceed  Without Changes_accept-transmit'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.scrollToElement(findTestObject('Page_Novedat/input__continuar'), 5)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_Select  34-REGISTRO YA ACTUALIZADO  _06b062'), '34', true)

WebUI.setText(findTestObject('Page_Novedat/textarea__observationCitizen'), 'test')

WebUI.click(findTestObject('Page_Novedat/input__continuar'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Vector Comportamiento_goMyList'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_ANALISTAREVISOR'), 'REVIEWER', true)

WebUI.click(findTestObject('Page_Novedat/li_Men'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Operaciones masivas'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneMODIFICACINRECLAMO'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneDEVOLVERAPROBARDESASIGNARR_d86014'), '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneCorregido por Actualizacin_5305bc'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneReclamoTipo de DocumentoTi_cb090e'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccionePrrrogaRecurso de Reposici_6894ea'), '9', true)

WebUI.setText(findTestObject('Page_Novedat/input_Filtro 3_filter3Form'), accountNumber)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/button_Buscar'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Estado Proceso_checkboxListCom'))

WebUI.setText(findTestObject('Page_Novedat/input__emailForm'), 'dalonso@stt.com.co')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneEl cambio propuesto no es _f5f283'), '1', true)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Telfono Celular_btn btn-inverse2 pull_ad7ef9'))

WebUI.click(findTestObject('Page_Novedat/input__accept-alert-confirm-modal-action'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input__accept-alert-confirm-modal'))

WebUI.click(findTestObject('Page_Novedat/input__accept-modal-success'))

WebUI.click(findTestObject('Page_Novedat/li_Lista'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_ANALISTAREVISOR'), 'ANALYST', true)

WebUI.click(findTestObject('Page_Novedat/li_Men'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Modificacin'))

WebUI.setText(findTestObject('Page_Novedat/input__idNumber'), personIdNumber)

WebUI.setText(findTestObject('Page_Novedat/input_Nmero de Obligacin_obligationNumber'), accountNumber)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneActualizacin en lneaManten_76b44e'), '1', true)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/button_Enviar'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/div_CCF 000000111468986143 BANCOLOMBIA SUFI_9102fe'), 5)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\68. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Object Repository/Page_Novedat/div_CCF 000000111468986143 BANCOLOMBIA SUFI_9102fe'))

WebUI.click(findTestObject('Page_Novedat/li_Lista'))

WebUI.click(findTestObject('Page_Novedat/li_Lista Comn'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneRECLAMOMODIFICACIONTIPO DO_b4f5c4'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneModificacinCorregido por A_b624b6'), '9', true)

WebUI.setText(findTestObject('Page_Novedat/input_Consultar por_idFilter3'), accountNumber)

WebUI.click(findTestObject('Page_Novedat/input_Consultar por_btn btn-primary ml-1'))

WebUI.click(findTestObject('Object Repository/Page_Novedat/span_70005031'))

WebUI.click(findTestObject('Object Repository/Page_Novedat/input_CCF 000000111468986143 BANCOLOMBIA SU_861bf6'))

WebUI.click(findTestObject('Page_Novedat/input__accept-assing-modal'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_ANALISTAREVISOR'), 'REVIEWER', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneRECLAMOMODIFICACIONTIPO DO_b4f5c4'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneModificacinCorregido por A_b624b6'), '9', true)

WebUI.setText(findTestObject('Page_Novedat/input_Consultar por_idFilter3'), accountNumber)

WebUI.click(findTestObject('Page_Novedat/input_Consultar por_btn btn-primary ml-1'))

WebUI.click(findTestObject('Object Repository/Page_Novedat/span_70005031'))

WebUI.click(findTestObject('Page_Novedat/input_Fecha de anlisis_btn btn-primary pull-right'))

WebUI.click(findTestObject('Page_Novedat/input_Accin Aprobar_accept-motivo-aprobacion'))

