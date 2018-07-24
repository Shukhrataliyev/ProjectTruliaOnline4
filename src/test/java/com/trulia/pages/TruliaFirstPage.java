package com.trulia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trulia.utilities.Driver;

public class TruliaFirstPage {
	public TruliaFirstPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//h1[.='Web Orders']")
	public WebElement webOrderss;

	

}