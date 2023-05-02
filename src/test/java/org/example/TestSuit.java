package org.example;

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
    @Test
    public void a_toVerifyNonRegisteredUserShouldNotBeAbleToVote(){
        //method to vote in communityPoll
        homePage.communityPoll();
        //print error message
        homePage.communityPollErrorMessage();
    }
    @Test
    public void b_toVerifyProductsInCompareList(){
        //ad two poducts in comparelist
        homePage.addProductsInCompareList();
        //confirm products in comparelist
        compareListPage.checkProductsInCompareList();
    }
    @Test
    public void c_toVerifyNonRegisteredUserShouldNotBeAbleToReferAProductToFriend(){
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
    public void d_toVerifyProductInShoppingCart(){
        //click on electronics category
    homePage.clickOnElectronics();
    //click on product to add in cart
    electronicsPage.addProductToCart();
    //confirm product in shopping cart
    shoppingCartPage.confirmTheProductInShoppingCart();
    }
    @Test
    public void e_toVerifyUserShouldBeAbleToRegisterSuccesfully(){
        //click on register Button
        homePage.clickOnRegisterButton();
        //enter details in registration form
        registrationFormPage.enterRegistrationDetails();
        //confirm if registration done or not
        registrationResultPage.verifyUserRegisteredSuccesfullyOrNot();
    }
    @Test
    public void f_toverifyRegisteredUserShouldBeAbleToReferAProductToAFriend(){
        //click on login button
        homePage.clickOnLoginButton();
        //enter login details
        loginPage.enterLoginDetails();
        //go to the product needs to be refered
        homePage.clickOnProduct();
        appleMacbookPage.clickOnEmailAFriend();
        emailAFriendPage.emilAFriend();
        emailSentPage.printEmailSentMessage();
    }
    @Test
    public void g_toVerifyRegisteredUserShouldBeAbleToVote(){
        homePage.clickOnLoginButton();
        loginPage.enterLoginDetails();
        homePage.communityPoll();
        homePage.communityPollVoteMessage();
    }
}
