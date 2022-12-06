package com.android.RingPayPages;

import org.openqa.selenium.By;

public class UserRegistrationNew {

		// User Details Header
		public static By objUserDetailsHeader = By.xpath("//*[@text='User Details']");

		// First Name text field
		public static By objFirstName = By.xpath("(//*[@class='android.widget.EditText'])[1]");

		// Last Name text field
		public static By objLastName = By.xpath("(//*[@class='android.widget.EditText'])[2]");

		//Mother's Name
		public static By objMothersName = By.xpath("(//*[@text='Last Name']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/descendant::android.widget.EditText)[1]");
		
		 //mother's name error message
        public static By objMotherError = By.xpath("//*[@text=concat('Please enter valid mother', \"'\", 's name')]");
		
		// Email Address text Field
		public static By objUserEmail = By.xpath("(//*[@class='android.widget.EditText'])[4]");

		// DOB
		public static By objUserDOB = By.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Date of Birth']]");

		// ok button
		public static By objOK = By.xpath("//*[@text='OK']");

		// DOB - month
		public static By objDatePickerMonth = By.xpath("(//*[@class='android.widget.NumberPicker'])[1]");

		// DOB - date
		public static By objDatePickerDate = By.xpath("(//*[@class='android.widget.NumberPicker'])[2]");

		// DOB - year
		public static By objDatePickerYear = By.xpath("(//*[@class='android.widget.NumberPicker'])[3]");

		// Gender select
		public static By objGenderSelect = By.xpath("//*[@text='Gender']");

		// Male gender
		public static By objMaleRadio = By.xpath(
				"(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[@class='android.widget.RadioButton'])[1]");

		// Female gender
		public static By objFemaleRadio = By.xpath(
				"(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[@class='android.widget.RadioButton'])[2]");

		// Register
		public static By objProceed = By.xpath("//*[@class='android.view.ViewGroup' and ./*[@text='Proceed']]");

		// First name error
		public static By objFirstNameError = By.xpath("//*[@text='Please enter valid first name']");

		// Last name error
		public static By objLastNameError = By.xpath("//*[@text='Please enter valid last name']");

		// DOB error
		public static By objDOBError = By.xpath("//*[@text='Please select Date of Birth']");

		// Email error 1
		public static By objEmailError = By.xpath("//*[@text='Please enter valid email address']");

		// Email error 2
		public static By objEmailError1 = By.xpath("//*[@text='Please enter valid email id']");

		// Gender error
		public static By objGender = By.xpath("//*[@text='Please select Gender']");

		// Toast message
		public static By objToast = By.xpath("//android.widget.Toast[1]");

		// None of the above
		public static By objNoneOfAbove = By.xpath("//*[@text='NONE OF THE ABOVE']");

		// Internet error
		public static By objInternetError = By.xpath("//*[@text=' Check your connection & try again ']");

		// Okay got it button
		public static By objGotItBtn = By.xpath("//*[@text='Okay Got it']");

		// Your application can't process
		public static By objProcessError = By.xpath("//*[@text='Your application cannot be processed\nright now.']");

		// Offer page
		public static By objOfferHeader = By.xpath("//*[@text='Offer']");

		// Male option
		public static By objMaleOption = By.xpath("//*[@text='Male']");

		// Gender Cancel Button
		public static By objGenderCancelBtn = By.xpath("//*[@text='CANCEL']");

		// ================================================================================

		public static By objSetPin = By.xpath("//*[@text='Set Pin']");
		public static By objEnterPin = By.xpath("//*[@class='android.widget.EditText']");
		public static By objReEnterPin = By.xpath("(//*[@class='android.widget.EditText'])[2]");
		public static By objSubmit = By.xpath("//*[@text='Submit']");
		public static By objEnterPin1 = By.xpath(
				"(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and (./preceding-sibling::* | ./following-sibling::*)[./*[./*[@text='Submit']]]]]/*[@class='android.widget.TextView'])[2]");
		public static By objEnterPin2 = By.xpath(
				"(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and (./preceding-sibling::* | ./following-sibling::*)[./*[./*[@text='Submit']]]]]/*[@class='android.widget.TextView'])[3]");
		public static By objEnterPin3 = By.xpath(
				"(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and (./preceding-sibling::* | ./following-sibling::*)[./*[./*[@text='Submit']]]]]/*[@class='android.widget.TextView'])[4]");
		public static By objEnterPin4 = By.xpath(
				"(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and (./preceding-sibling::* | ./following-sibling::*)[./*[./*[@text='Submit']]]]]/*[@class='android.widget.TextView'])[5]");
		public static By objHide = By.xpath("//*[@text='*']");
		public static By objErrorMessage = By.xpath("//*[@text='Please enter new Pin']");
		public static By objSorryErrorMessage = By.xpath("//*[@text='Sorry! Pin does not match, please enter again']");

		public static By objHide(int nNumber) {
			return By.xpath("//*[@text='*'][" + nNumber + "]");
		}

		public static By objTransactionPinSet = By.xpath("//*[@text='Transaction Security Pin Set Successfully']");
		public static By objAllowLocationPopup = By.xpath("//*[@text='Location Permission Required']");
		public static By objAllowLocationBtn = By.xpath("//*[@text='Allow']");
		public static By objOkBtn = By.xpath("//*[@resource-id='android:id/button1']");
		public static By objNotNowLocationBtn = By.xpath("//*[@text='Not Now']");

		public static By objPaymentDoneMsg = By.xpath("//*[@text='Payment Done!']");
		public static By objSuccessMsg = By
				.xpath("(//*[@text='Payment Done!']/following-sibling::android.widget.TextView)[2]");
		public static By objGoTOHomePageBtn = By.xpath("//*[@text='Go to Homepage']");
		public static By objNoBtn = By.xpath("//*[@text='No']");
}
