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
personIdNumber = accounts.getValue('personIdNumber', 56)
accountNumber = accounts.getValue('accountNumber', 56)
int nScreenshot = 0
String screenshot

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-login.datacredito.com.co/login/login.htm')

WebUI.setText(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Username_username'), GlobalVariable.user_operador)

WebUI.setText(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Password_password'), GlobalVariable.password_operador)

WebUI.click(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Remember me_okta-signin-submit'))

WebUI.maximizeWindow()

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.executeJavaScript('window.open()', [])

WebUI.switchToWindowIndex(1)

WebUI.delay(5)

WebUI.navigateToUrl(GlobalVariable.url_operador)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Men'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Modificacin'))

WebUI.setText(findTestObject('Page_Novedat/input__idNumber'), personIdNumber)

WebUI.setText(findTestObject('Page_Novedat/input_Nmero de Obligacin_obligationNumber'), accountNumber)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneActualizacin en lneaManten_76b44e'), '1', true)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/button_Enviar'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/div_CAC 039059173756461100 FINANCIERA COMUL'), 5)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Object Repository/Page_Novedat/div_CAC 039059173756461100 FINANCIERA COMUL'))

WebUI.click(findTestObject('Page_Novedat/input_Radica Caso_accept-alert-modal'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Object Repository/Page_Novedat/div_Corregido por Actualizacin'))

WebUI.click(findTestObject('Page_Novedat/span_Corregido por Actualizacin'))

WebUI.scrollToElement(findTestObject('Page_Novedat/input_Alert Model_continuar'), 5)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Alert Model_continuar'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.delay(3)

WebUI.click(findTestObject('Page_Novedat/input_Proceed  Without Changes_accept-transmit'))

WebUI.scrollToElement(findTestObject('Page_Novedat/input_ObservationComment_continuar'), 5)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_Select  34-REGISTRO YA ACTUALIZADO  _06b062'), '34', true)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_ObservationComment_continuar'))

WebUI.delay(5)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Vector Comportamiento_goMyList'))

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_ANALISTAREVISOR'), 'REVIEWER', true)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.delay(5)

WebUI.click(findTestObject('Page_Novedat/li_Men'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Operaciones masivas'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneMODIFICACINRECLAMO'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneAPROBARDEVOLVERDESASIGNAR'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneCorregido por Actualizacin_c75183'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneModificacinTipo de DocumentoOtros'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneNmero de CasoNmero de Obli_97145b'), '9', true)

WebUI.setText(findTestObject('Page_Novedat/input_Filtro 3_filter3Form'), accountNumber)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/button_Buscar'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input_Estado Proceso_checkboxListCom'))

WebUI.setText(findTestObject('Page_Novedat/input__emailForm'), 'dalonso@stt.com.co')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Novedat/select_SeleccioneEl cambio propuesto no es _b80acb'), '1', true)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Object Repository/Page_Novedat/input_Proceed  Without Changes_btn btn-secondary'))

WebUI.click(findTestObject('Page_Novedat/input__accept-alert-confirm-modal-action'))

WebUI.click(findTestObject('Page_Novedat/input__accept-alert-confirm-modal'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/input__accept-modal-success'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Novedat/li_Lista'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_ANALISTAREVISOR'), 'ANALYST', true)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Men'))

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/li_Modificacin'))

WebUI.setText(findTestObject('Page_Novedat/input__idNumber'), personIdNumber)

WebUI.setText(findTestObject('Page_Novedat/input_Nmero de Obligacin_obligationNumber'), accountNumber)

WebUI.selectOptionByValue(findTestObject('Page_Novedat/select_SeleccioneActualizacin en lneaManten_76b44e'), '1', true)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.click(findTestObject('Page_Novedat/button_Enviar'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Novedat/div_CAC 039059173756461100 FINANCIERA COMUL'), 5)

//Screenshot ------------------------------------------------------------------------------------------------------------------------------------------------------------------
WebUI.waitForPageLoad(5)
screenshot = ('C:\\Users\\camil\\Katalon Studio\\Novedat\\Responses\\O_Masivas_Revisor_Aprobar_Corregido_por_actualización\\' + nScreenshot + '.png')
WebUI.takeScreenshot(screenshot)
nScreenshot++
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

WebUI.closeBrowser()

