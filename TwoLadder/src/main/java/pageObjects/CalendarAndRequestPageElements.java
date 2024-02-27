package pageObjects;

public interface CalendarAndRequestPageElements {
String FirstDropdown = "//span[@id='pr_id_6_label']";
String SecondDropdown = "//span[@class='p-button-label'][normalize-space()='My2L Request']";
String ClickRequest = "//span[normalize-space()='Strategy Request']";
String SearchCompany = "//input[@placeholder='Search Company']";
String AssignTo = "/html/body/app-root/div/div/app-call-calendar/app-strategy-request-dialog/p-dialog/div/div/div[2]/div/div[2]/div/p-dropdown/div";
String SearchAssignTo = "/html/body/app-root/div/div/app-call-calendar/app-strategy-request-dialog/p-dialog/div/div/div[2]/div/div[2]/div/p-dropdown/div/div[3]/div[1]/div/input";
String Dates = "//span[@class='p-button-icon pi pi-calendar']";
String SelectDate = "/html/body/div[2]/div/div/div[2]/table/tbody/tr[5]/td[4]/span";
String Description = "/html/body/app-root/div/div/app-call-calendar/app-strategy-request-dialog/p-dialog/div/div/div[2]/div/div[5]/div/textarea";
String UploadFile = "//label[@for='upload-documents-brand']";
String SaveButton = "//button[@icon='fa fa-info']";
String Repeat = "/html/body/app-root/div/div/app-call-calendar/app-strategy-request-dialog/p-dialog/div/div/div[2]/div/div[4]/div/p-dropdown/div/div[2]";
String StartDate = "(//span[@class='p-button-icon pi pi-calendar'])[2]";
String EndDate ="(//span[@class='p-button-icon pi pi-calendar'])[3]";
String SelectStartDate = "/html/body/div[2]/div/div/div[2]/table/tbody/tr[5]/td[5]/span";
String SelectEndDate = "/html/body/div[2]/div/div/div[2]/table/tbody/tr[1]/td[7]/span";

}
