package Object_Repository;

import org.openqa.selenium.By;

public class SmartData_Object 
{
	public By MainMenu = By.xpath(".//*[@class='et_pb_row et_pb_row_31']/div/div[3]/div");
	
	public By WhoWeAre = By.xpath(".//*[@id='menu-primary-menu-4']/li[1]");
	
	public By JobOpening = By.xpath(".//*[@class='et_pb_button et_pb_custom_button_icon et_pb_button_1 et_pb_bg_layout_light' and text()='Job Openings']");
	
	public By SearchJob = By.xpath(".//*[@class='searchBlock']/button");
	
	public By OpeningOneJob = By.xpath(".//*[@class='copListBlock']/div[1]/div[1]");
	
	public By EasyApply = By.xpath("//*[@class=\"apply_without_reg_btn easyApply hidethis\" and text()='Easy Apply ']");
	
	public By CancelJob = By.xpath(".//*[text()='Cancel']");
	
	public By BackToJobs = By.xpath(".//*[@class='backJobBoard']");
	
	
}
