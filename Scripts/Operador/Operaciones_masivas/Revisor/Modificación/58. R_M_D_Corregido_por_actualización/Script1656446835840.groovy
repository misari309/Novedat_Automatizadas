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
personIdNumber = accounts.getValue('personIdNumber', 58)
accountNumber = accounts.getValue('accountNumber', 58)
int nScreenshot = 0
String screenshot

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-login.datacredito.com.co/login/login.htm')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Username_username'), GlobalVariable.user_operador)

WebUI.setText(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Password_password'), GlobalVariable.password_operador)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
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
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Men'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
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
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Object Repository/Page_Novedat/div_LAB 000000111419493115 NATURA COSMETICO'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Radica Caso_accept-alert-modal'))

WebUI.click(findTestObject('Page_Novedat/span_Corregido por Actualizacin'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.scrollToElement(findTestObject('Page_Novedat/input_Alert Model_continuar'), 5)

WebUI.click(findTestObject('Page_Novedat/input_Alert Model_continuar'))

WebUI.delay(5)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Proceed  Without Changes_accept-transmit'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.scrollToElement(findTestObject('Page_Novedat/input_ObservationComment_continuar'), 5)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_Select  34-REGISTRO YA ACTUALIZADO  _06b062'), '34', true)

WebUI.click(findTestObject('Page_Novedat/input_ObservationComment_continuar'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Vector Comportamiento_goMyList'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_ANALISTAREVISOR'), 'REVIEWER', true)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Men'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Operaciones masivas'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneMODIFICACINRECLAMO'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneAPROBARDEVOLVERDESASIGNAR'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneCorregido por Actualizacin_a9747c'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneModificacinTipo de DocumentoOtros'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneNmero de CasoNmero de Obli_97145b'), '9', true)

WebUI.setText(findTestObject('Page_Novedat/input_Filtro 3_filter3Form'), accountNumber)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/button_Buscar'))

WebUI.click(findTestObject('Page_Novedat/input_Estado Proceso_checkboxListCom'))

WebUI.setText(findTestObject('Page_Novedat/input__emailForm'), 'dalonso@stt.com.co')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneLa justificacin no concuer_da67dd'), '001', true)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Comentario_btn btn-primary mb-1'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input__accept-alert-confirm-modal-action'))

WebUI.click(findTestObject('Page_Novedat/input__accept-alert-confirm-modal'))

WebUI.click(findTestObject('Page_Novedat/input__accept-modal-success'))

WebUI.click(findTestObject('Page_Novedat/li_Men'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Lista'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_ANALISTAREVISOR'), 'ANALYST', true)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Men'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Modificacin'))

WebUI.setText(findTestObject('Page_Novedat/input_Nmero de Obligacin_obligationNumber'), accountNumber)

WebUI.setText(findTestObject('Page_Novedat/input__idNumber'), personIdNumber)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneActualizacin en lneaManten_76b44e'), '1', true)

WebUI.click(findTestObject('Page_Novedat/button_Enviar'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Devolver_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Lista'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneRECLAMOMODIFICACIONTIPO DO_b4f5c4'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneModificacinCorregido por A_b21c35'), '9', true)

WebUI.setText(findTestObject('Page_Novedat/input_Consultar por_idFilter3'), accountNumber)

WebUI.click(findTestObject('Page_Novedat/input_Consultar por_btn btn-primary ml-1'))

WebUI.click(findTestObject('Object Repository/Page_Novedat/span_AL0993550896'))

WebUI.click(findTestObject('Page_Novedat/span_Corregido por Actualizacin'))

WebUI.scrollToElement(findTestObject('Page_Novedat/input_Alert Model_continuar'), 5)

WebUI.click(findTestObject('Page_Novedat/input_Alert Model_continuar'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Novedat/input_Proceed  Without Changes_accept-transmit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_Select  33-MODIFICACION ES PARA OTRA_68a101'), '33', true)

WebUI.click(findTestObject('Page_Novedat/input_ObservationComment_continuar'))

