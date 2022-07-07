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
personIdNumber = accounts.getValue('personIdNumber', 57)
accountNumber = accounts.getValue('accountNumber', 57)
int nScreenshot = 0
String screenshot

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-login.datacredito.com.co/login/login.htm')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Username_username'), GlobalVariable.user_operador)

WebUI.setText(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Password_password'), GlobalVariable.password_operador)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Remember me_okta-signin-submit'))

WebUI.delay(5)

WebUI.executeJavaScript('window.open()', [])

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl(GlobalVariable.url_operador)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Men'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Modificacin'))

WebUI.setText(findTestObject('Page_Novedat/input__idNumber'), personIdNumber)

WebUI.setText(findTestObject('Page_Novedat/input_Nmero de Obligacin_obligationNumber'), accountNumber)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneActualizacin en lneaManten_76b44e'), '1', true)

WebUI.click(findTestObject('Page_Novedat/button_Enviar'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/div_ALI 000000188175209123 MERCAEXPRESS'), 5)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Object Repository/Page_Novedat/div_ALI 000000188175209123 MERCAEXPRESS'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.delay(5)

WebUI.click(findTestObject('Page_Novedat/input_Radica Caso_accept-alert-modal'))

WebUI.click(findTestObject('Page_Novedat/span_Bloquear'))

WebUI.scrollToElement(findTestObject('Page_Novedat/input_Alert Model_continuar'), 5)

WebUI.click(findTestObject('Page_Novedat/input_Alert Model_continuar'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.delay(5)

WebUI.click(findTestObject('Page_Novedat/input_Delete_accept-delete'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.scrollToElement(findTestObject('Page_Novedat/input_ObservationComment_continuar'), 5)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_Select  4-INCONSISTENCIA EN EL SISTE_176edf'), '4', true)

WebUI.click(findTestObject('Page_Novedat/input_ObservationComment_continuar'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Vector Comportamiento_goMyList'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_ANALISTAREVISOR'), 'REVIEWER', true)

WebUI.delay(3)

WebUI.click(findTestObject('Page_Novedat/li_Men'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Operaciones masivas'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SelectMODIFICACINRECLAMO'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneAPROBARDEVOLVERDESASIGNAR'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneCorregido por Actualizacin_c75183'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneModificacinTipo de DocumentoOtros'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneNmero de CasoNmero de Obli_97145b'), '9', true)

WebUI.setText(findTestObject('Page_Novedat/input_Filtro 3_filter3Form'), '000000188175209123')

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/button_Buscar'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Estado Proceso_checkboxListCom'))

WebUI.setText(findTestObject('Page_Novedat/input__emailForm'), 'dalonso@stt.com.co')

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneEl cambio propuesto no es _b80acb'), '1', true)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Comentario_btn btn-primary mb-1'))

WebUI.delay(3)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input__accept-alert-confirm-modal-action'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input__accept-alert-confirm-modal'))

WebUI.click(findTestObject('Page_Novedat/input__accept-modal-success'))

WebUI.click(findTestObject('Page_Novedat/li_Lista'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_ANALISTAREVISOR'), 'ANALYST', true)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Modificacin'))

WebUI.setText(findTestObject('Page_Novedat/input_Nmero de Obligacin_obligationNumber'), '000000188175209123')

WebUI.setText(findTestObject('Page_Novedat/input__idNumber'), '30027872')

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneActualizacin en lneaManten_76b44e'), '1', true)

WebUI.click(findTestObject('Page_Novedat/button_Enviar'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Men'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Acciones Operador'))

WebUI.click(findTestObject('Page_Novedat/li_Reactivacin Cuentas'))

WebUI.setText(findTestObject('Page_Novedat/input__idNumber'), '30027872')

WebUI.setText(findTestObject('Page_Novedat/input_Nmero de Obligacin_obligationNumber'), '000000188175209123')

WebUI.click(findTestObject('Page_Novedat/button_Enviar'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/h3_ALI 000000188175209123 MERCAEXPRESS    B'), 5)

WebUI.click(findTestObject('Object Repository/Page_Novedat/h3_ALI 000000188175209123 MERCAEXPRESS    B'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneFINALIZ EL PROCESO DE INVE_c417e2'), '025', true)

WebUI.setText(findTestObject('Page_Novedat/textarea__observation'), 'test')

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Radica Caso_accept-alert-modal'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Bloquear\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Object Repository/Page_Novedat/input_test_btn btn-primary'))

WebUI.closeBrowser()

