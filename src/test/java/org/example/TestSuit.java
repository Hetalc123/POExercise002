package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
    HomePage homePage = new HomePage();
    CompareListPage compareListPage = new CompareListPage();
    AppleMacbookPage appleMacbookPage = new AppleMacbookPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    LoginPage loginPage = new LoginPage();
    EmailSentPage emailSentPage = new EmailSentPage();
    NewReleasePage newReleasePage = new NewReleasePage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    GuestCheckoutPage guestCheckoutPage = new GuestCheckoutPage();
    ShippingPage shippingPage = new ShippingPage();
    PaymentPage paymentPage = new PaymentPage();
    PaymentCardPage paymentCardPage = new PaymentCardPage();
    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();
    FaceBookPage faceBookPage = new FaceBookPage();
    @Test
    public void toVerifyNonRegisteredUserShouldNotBeAbleToVote(){
        //method to vote in communityPoll
        homePage.communityPoll();
        //print error message
        homePage.communityPollErrorMessage();
    }
    @Test
    public void toVerifyProductsInCompareList(){
        //ad two poducts in comparelist
        homePage.addProductsInCompareList();
        //confirm products in comparelist
        compareListPage.checkProductsInCompareList();
    }
    @Test
    public void toVerifyNonRegisteredUserShouldNotBeAbleToReferAProductToFriend(){
     //click on product
        homePage.clickOnProduct();
        //click on email a friend
     appleMacbookPage.clickOnEmailAFriend();
     //add details in emailafriend
     emailAFriendPage.emilAFriend();
     //print a message
     emailAFriendPage.printAnErrorMessage();
    }
    @Test
    public void toVerifyProductInShoppingCart(){
        //click on electronics category
    homePage.clickOnElectronics();
    //click on product to add in cart
    electronicsPage.addProductToCart();
    //confirm product in shopping cart
    shoppingCartPage.confirmTheProductInShoppingCart();
    }
    @Test
    public void a_toVerifyUserShouldBeAbleToRegisterSuccesfully(){
        //click on register Button
        homePage.clickOnRegisterButton();
        //enter details in registration form
        registrationFormPage.enterRegistrationDetails();
        //confirm if registration done or not
        registrationResultPage.verifyUserRegisteredSuccesfullyOrNot();
    }
    @Test
    public void toverifyRegisteredUserShouldBeAbleToReferAProductToAFriend(){
        //click on login button
        homePage.clickOnLoginButton();
        //enter login details
        loginPage.enterLoginDetails();
        //go to the product needs to be refered
        homePage.clickOnProduct();
        //click on email
        appleMacbookPage.clickOnEmailAFriend();
        //fill details
        emailAFriendPage.emilAFriend();
        //send email
        emailSentPage.printEmailSentMessage();
    }
    @Test
    public void toVerifyRegisteredUserShouldBeAbleToVote(){
        //click on login
        homePage.clickOnLoginButton();
        //fill login details
        loginPage.enterLoginDetails();
        //go to communityPoll
        homePage.communityPoll();
        homePage.communityPollVoteMessage();
    }
    @Test
    public void printProductTitleForTheProductsOnHomePage(){
        homePage.printProductTitle();
    }
    @Test
    public void verifySearchButtonAlert(){
        homePage.verifySearchButtonAlert();
    }
    @Test
    public void verifyPriceListedInCurrencySelectedFromCurrencySelector(){
        homePage.verifyProductPriceAreDisplayedAsPerSelectedCurrency();
    }
    @Test
    public void verifyUserShouldBeAbleToSearchProductAccordingly(){
        //search the product
        homePage.verifyProductUserShouldBeAbleToSearchProductAccordingly("Apple","nike");
    }
    @Test
    public void verifyGuestUserShouldBeAbleToLeaveComment(){
        homePage.clickOnNewRelease();
        newReleasePage.typeComment();
        newReleasePage.verifyCommentAddedSuccessfullyOrNot();
        newReleasePage.verifyCommentIsDisplayedAtLast();
    }
    @Test
    public void verifyGuestUserShouldBeAbleToCheckoutSuccessfully(){
        homePage.clickOnBuildYourOwnComputer();
        buildYourOwnComputerPage.addDetails();
        buildYourOwnComputerPage.addProductToCart();
        buildYourOwnComputerPage.addProductToCart();
        buildYourOwnComputerPage.clickOnShoppingCart();
        shoppingCartPage.verifyBuildYourOwnComputerIsAddedToCart();
        shoppingCartPage.clickOnTermsAndConditionsAndCheckout();
        checkoutPage.clickOnCheckoutAsGuest();
        guestCheckoutPage.fillCkeckoutDetails();
        guestCheckoutPage.handlePopUp();
        shippingPage.selectShippingOptionAndClickOnContinue();
        paymentPage.selectPaymentOption();
        paymentCardPage.enterCardDetails();
        paymentCardPage.alertMessage();
        guestCheckoutPage.confirmCheckout();
        orderConfirmationPage.verifyOrderisSubmittedOrNot();
    }
    @Test
    public void b_verifyWhenUserClicksOnFacebookUserShouldBeNavigatedToFacebookPage(){
    homePage.clickOnFacebook();
    faceBookPage.verifyFaceBookPage();
    }
    @Test
    public void verifyVoteAlert(){
        homePage.verifyVoteAlert();
    }
}
