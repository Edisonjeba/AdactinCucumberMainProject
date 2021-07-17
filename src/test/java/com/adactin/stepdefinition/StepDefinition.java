package com.adactin.stepdefinition;


import com.adactin.BaseClass.AdactinmainBase;

import AdactinCucumberPom.LogoutPom4;
import AdactinCucumberPom.Pom1;
import AdactinCucumberPom.SearchHotelPom3;
import AdactinCucumberPom.SelectPom2;
import cucumber.api.java.en.*;

public class StepDefinition extends AdactinmainBase {
	
	Pom1 lg = new Pom1(driver);
	SelectPom2 sp = new SelectPom2(driver);
	SearchHotelPom3 sh = new SearchHotelPom3(driver);
	LogoutPom4 lo = new LogoutPom4(driver);
	
	@Given("^User must login the login page$")
	public void user_must_login_the_login_page() throws Throwable {
		getUrl("https://adactinhotelapp.com/index.php");
	}

	@When("^User enter the valid user name in the username field$")
	public void user_enter_the_valid_user_name_in_the_username_field() throws Throwable {
	    enterText(lg.getUsername(), "Edison1994");
	}

	@When("^User enter the valid password in the password field$")
	public void user_enter_the_valid_password_in_the_password_field() throws Throwable {
	   enterText(lg.getPassword(), "7806863409");
	}

	@Then("^User confirm it and   navigated to the search page$")
	public void user_confirm_it_and_navigated_to_the_search_page() throws Throwable {
	    clickBox(lg.getLogin());
	}
	
	
	
	
	//@Given("^User successfully loging and enter into the Search Hotel$")
	//public void user_successfully_loging_and_enter_into_the_Search_Hotel() throws Throwable {
	    
	//}

	@When("^User select the hotel location in the location field$")
	public void user_select_the_hotel_location_in_the_location_field() throws Throwable {
		DropDown(sp.getCountry(), "Sydney");
		
	}

	@When("^User select the hotel in the hotels field$")
	public void user_select_the_hotel_in_the_hotels_field() throws Throwable {
		DropDown(sp.getHotel(), "Hotel Sunshine");
		
	}

	@When("^User select the room type in the room type field$")
	public void user_select_the_room_type_in_the_room_type_field() throws Throwable {
		DropDown(sp.getRoomtype1(), "Double");
		
	}

	@When("^User select the number of room in the number of room$")
	public void user_select_the_number_of_room_in_the_number_of_room() throws Throwable {
		DropDown(sp.getRoom(), "2");
	}

	//@When("^User select the adults room in the number of adult per room$")
	//public void user_select_the_adults_room_in_the_number_of_adult_per_room() throws Throwable {
	//	DropDown(sp., index);
	//}

	@When("^User select the number of children per room in the number of children per room$")
	public void user_select_the_number_of_children_per_room_in_the_number_of_children_per_room() throws Throwable {
		DropDown(sp.getChildroom(), "2");
	}

	@Then("^User confirm search it and navigate to Select Hotel$")
	public void user_confirm_search_it_and_navigate_to_Select_Hotel() throws Throwable {
	   clickBox(sp.getRadiobutton());
	}

   
	@When("^User select hotel in select hotel redio button$")
	public void user_select_hotel_in_select_hotel_redio_button() throws Throwable {
	    clickBox(sp.getSearch());
	}

	//@Then("^User select the Hotel and navigate to Book Hotel$")
	//public void user_select_the_Hotel_and_navigate_to_Book_Hotel() throws Throwable {
	    
	//}
	
	
	
	@Given("^User enter the valid first name in the firstname field$")
	public void user_enter_the_valid_first_name_in_the_firstname_field() throws Throwable {
	    enterText(sh.getFstname(), "Edison");
	}

	@When("^User enter the valid last name in the lastname field$")
	public void user_enter_the_valid_last_name_in_the_lastname_field() throws Throwable {
	    enterText(sh.getLstname(), "Jeba");
	}

	@When("^User enter the billing Address in the address field$")
	public void user_enter_the_billing_Address_in_the_address_field() throws Throwable {
	    enterText(sh.getTxtarea(), "33,middle street, chennai-94");
	}

	@When("^User enter the credit card number in the credit card no field$")
	public void user_enter_the_credit_card_number_in_the_credit_card_no_field() throws Throwable {
	    enterText(sh.getCcnumber(), "1234523641257895");
	}

	@When("^User select the card type in the credit card type field$")
	public void user_select_the_card_type_in_the_credit_card_type_field() throws Throwable {
	    DropDown(sh.getCtype(), "AMEX");
	}

	@When("^User select the expiry month in the month field$")
	public void user_select_the_expiry_month_in_the_month_field() throws Throwable {
	    DropDown(sh.getMonth(), "3");
	}

	@When("^User select the expiry year in the expiry year field$")
	public void user_select_the_expiry_year_in_the_expiry_year_field() throws Throwable {
	    DropDown(sh.getYear(), "2021");
	}

	@When("^User enter the cvv number in the cvv number field$")
	public void user_enter_the_cvv_number_in_the_cvv_number_field() throws Throwable {
	    enterText(sh.getCvvno(), "547");
	}

	@Then("^User confirm book now it and navigate to booking confirmation$")
	public void user_confirm_book_now_it_and_navigate_to_booking_confirmation() throws Throwable {
	    clickBox(sh.getBooknow());
	}

	@Given("^User click logout in the confirmation page logout$")
	public void user_click_logout_in_the_confirmation_page_logout() throws Throwable {
	   clickBox(lo.getLogout());
	}

	

}
