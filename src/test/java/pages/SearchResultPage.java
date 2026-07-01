package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage{

    @FindBy(css = "label[class='control-label']")
    private WebElement searchCriteriaTitle;

    public String getSearchCriteriaTitle(){
        return getText(searchCriteriaTitle);
    }
}
