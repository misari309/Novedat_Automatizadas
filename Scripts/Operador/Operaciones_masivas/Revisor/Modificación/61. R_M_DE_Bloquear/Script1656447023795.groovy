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
personIdNumber = accounts.getValue('personIdNumber', 61)
accountNumber = accounts.getValue('accountNumber', 61)
int nScreenshot = 0
String screenshot

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-login.datacredito.com.co/login/login.htm')

WebUI.setText(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Username_username'), GlobalVariable.user)

WebUI.setText(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Password_password'), GlobalVariable.password)

WebUI.maximizeWindow()

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\61. O_Masivas\\' + nScreenshot + '.png')
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
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\61. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Men'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\61. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Modificacin'))

WebUI.setText(findTestObject('Page_Novedat/input__idNumber'), personIdNumber)

WebUI.setText(findTestObject('Page_Novedat/input_Nmero de Obligacin_obligationNumber'), accountNumber)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneActualizacin en lneaManten_76b44e'), '1', true)

WebUI.click(findTestObject('Page_Novedat/button_Enviar'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\61. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/div_COF 000000111111112499 COBRANZAS Y FI'), 5)

WebUI.click(findTestObject('Object Repository/Page_Novedat/div_COF 000000111111112499 COBRANZAS Y FI'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\61. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Radica Caso_accept-alert-modal'))

WebUI.click(findTestObject('Page_Novedat/span_Bloquear'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\61. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.scrollToElement(findTestObject('Page_Novedat/input_Alert Model_continuar'), 5)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\61. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Alert Model_continuar'))

WebUI.delay(3)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\61. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Delete_accept-delete'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\61. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.scrollToElement(findTestObject('Page_Novedat/input_ObservationComment_continuar'), 5)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_Select  4-INCONSISTENCIA EN EL SISTE_176edf'), '4', true)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\61. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_ObservationComment_continuar'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\61. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Vector Comportamiento_goMyList'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_ANALISTAREVISOR'), 'REVIEWER', true)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\61. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Men'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\61. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Operaciones masivas'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneMODIFICACINRECLAMO'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneAPROBARDEVOLVERDESASIGNAR'), '3', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneCorregido por Actualizacin_2f6f5e'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneModificacinTipo de DocumentoOtros'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneNmero de CasoNmero de Obli_97145b'), '9', true)

WebUI.setText(findTestObject('Page_Novedat/input_Filtro 3_filter3Form'), accountNumber)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\61. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/button_Buscar'))

WebUI.click(findTestObject('Page_Novedat/input_Estado Proceso_checkboxListCom'))

WebUI.setText(findTestObject('Page_Novedat/input__emailForm'), 'dalonso@stt.com.co')

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneCaso no aplica para proces_2d5db3'), '4', true)

WebUI.click(findTestObject('Page_Novedat/input_Comentario_btn btn-primary mb-1'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\61. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input__accept-alert-confirm-modal-action'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\61. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input__accept-alert-confirm-modal'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\61. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input__accept-modal-success'))

WebUI.click(findTestObject('Page_Novedat/li_Lista'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_ANALISTAREVISOR'), 'ANALYST', true)

WebUI.click(findTestObject('Page_Novedat/li_Modificacin'))

WebUI.setText(findTestObject('Page_Novedat/input_Nmero de Obligacin_obligationNumber'), accountNumber)

WebUI.setText(findTestObject('Page_Novedat/input__idNumber'), personIdNumber)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneActualizacin en lneaManten_76b44e'), '1', true)

WebUI.click(findTestObject('Page_Novedat/button_Enviar'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\61. O_Masivas\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Lista'))

WebUI.click(findTestObject('Page_Novedat/li_Lista Comn'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneRECLAMOMODIFICACIONTIPO DO_b4f5c4'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneModificacinCorregido por A_b21c35'), '9', true)

WebUI.setText(findTestObject('Page_Novedat/input_Consultar por_idFilter3'), accountNumber)

WebUI.click(findTestObject('Page_Novedat/input_Consultar por_btn btn-primary ml-1'))

WebUI.click(findTestObject('Object Repository/Page_Novedat/span_AL0993581077'))

WebUI.click(findTestObject('Object Repository/Page_Novedat/input_COF 000000111111112499 COBRANZAS Y FI_0e9966'))

WebUI.click(findTestObject('Page_Novedat/input_Asignar_accept-assing-modal'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_ANALISTAREVISOR'), 'REVIEWER', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneRECLAMOMODIFICACIONTIPO DO_b4f5c4'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneModificacinCorregido por A_b21c35'), '9', true)

WebUI.setText(findTestObject('Page_Novedat/input_Consultar por_idFilter3'), accountNumber)

WebUI.click(findTestObject('Page_Novedat/input_Consultar por_btn btn-primary ml-1'))

WebUI.click(findTestObject('Object Repository/Page_Novedat/span_AL0993581077'))

WebUI.click(findTestObject('Page_Novedat/input_Accin Aprobar_accept-motivo-aprobacion'))

WebUI.click(findTestObject('Page_Novedat/li_Acciones Operador'))

WebUI.click(findTestObject('Page_Novedat/li_Reactivacin Cuentas'))

WebUI.setText(findTestObject('Page_Novedat/input_Nmero de Obligacin_obligationNumber'), accountNumber)

WebUI.setText(findTestObject('Page_Novedat/input__idNumber'), personIdNumber)

WebUI.click(findTestObject('Page_Novedat/button_Enviar'))

WebUI.click(findTestObject('Object Repository/Page_Novedat/label_COF 000000111111112499 COBRANZAS Y FI'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneFINALIZ EL PROCESO DE INVE_c417e2'), '53', true)

WebUI.setText(findTestObject('Page_Novedat/textarea__observation'), 'teat')

WebUI.click(findTestObject('Page_Novedat/input_Radica Caso_accept-alert-modal'))

WebUI.click(findTestObject('Page_Novedat/input_Comentario_btn btn-primary mb-1'))

