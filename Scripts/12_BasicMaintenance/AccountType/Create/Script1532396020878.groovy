import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('12_BasicMaintenance/AccountType/Create/Type_Add'))

WebUI.setText(findTestObject('12_BasicMaintenance/AccountType/Create/input_TypeName'), C_TypeName)

WebUI.setText(findTestObject('12_BasicMaintenance/AccountType/Create/input_HomePageURL'), C_HomePageURL)

WebUI.click(findTestObject('12_BasicMaintenance/AccountType/Create/button_submit'))

WebUI.callTestCase(findTestCase('12_BasicMaintenance/AccountType/Retrieval'), [('state') : '启用', ('R_TypeName') : C_TypeName
        , ('R_HomePageURL') : C_HomePageURL], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('12_BasicMaintenance/AccountType/Create/td_TypeNmae'), C_TypeName)

