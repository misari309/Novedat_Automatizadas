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

TestData accounts = findTestData('Data Files/Para_reactivar')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-login.datacredito.com.co/login/login.htm')

WebUI.setText(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Username_username'), '1-80168185@dev.datacredito.com.co')

WebUI.setEncryptedText(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Password_password'), 'OzQGslQmBm+Et1xdB1NeKw==')

WebUI.click(findTestObject('Page_Experian LATAMB - Preview - Sign In/input_Remember me_okta-signin-submit'))

WebUI.executeJavaScript('window.open()', [])

WebUI.switchToWindowIndex(1)

WebUI.delay(5)

WebUI.navigateToUrl('https://dev-novedat.datacredito.com.co/?entidad=900422614')

for(int i=16;i<=accounts.getRowNumbers();i++) {
	
	personIdNumber = accounts.getValue('personIdNumber', i)
	accountNumber = accounts.getValue('accountNumber', i)
	
	try {
		
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
		
		println(personIdNumber + " funciona")
		
	}catch(def err) {
		
		println(personIdNumber + " no funciona")
		
	}
	
	
	
	
	
}



