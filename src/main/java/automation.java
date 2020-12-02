import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.graphwalker.java.annotation.GraphWalker;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.BeforeExecution;


@GraphWalker(value = "random(edge_coverage(100))", start = "edge_goToCreateNote")
public class automation extends ExecutionContext implements myNotepad {

    AndroidDriver<AndroidElement> ad;
    DesiredCapabilities dc = new DesiredCapabilities();

    @BeforeExecution
    public void openApp (){

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.onto.notepad");
        dc.setCapability("appActivity", ".NotepadNotesActivity");

        try {

            ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Override
    public void vertex_createNotePage(){

        Assert.assertTrue(ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView").isDisplayed());
    }

    @Override
    public void vertex_notesListPage(){

        Assert.assertTrue(ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ListView").isDisplayed());
    }

    @Override
    public void vertex_editTitlePage(){

        Assert.assertTrue(ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView").isDisplayed());
    }

    @Override
    public void vertex_editContentPage(){

        Assert.assertTrue(ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView").isDisplayed());
    }

    @Override
    public void vertex_createTitle(){

        Assert.assertTrue(ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView").isDisplayed());
    }

    @Override
    public void vertex_createContent(){

        Assert.assertTrue(ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView").isDisplayed());
    }

    @Override
    public void vertex_deleteNote(){

        Assert.assertTrue(ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView").isDisplayed());
    }

    @Override
    public void edge_createNewNote(){

        MobileElement el1 = (MobileElement) ad.findElementById("com.onto.notepad:id/titleEdit");
        el1.click();
        el1.sendKeys("USA");
        MobileElement el2 = (MobileElement) ad.findElementById("com.onto.notepad:id/contentEdit");
        el2.click();
        el2.sendKeys("Canada");
        el2.click();
        MobileElement el3 = (MobileElement) ad.findElementByAccessibilityId("Save");
        el3.click();
    }

    @Override
    public void edge_deleteNote(){

        MobileElement el1 = (MobileElement) ad.findElementById("com.onto.notepad:id/titleEdit");
        el1.click();
        el1.clear();
        MobileElement el2 = (MobileElement) ad.findElementById("com.onto.notepad:id/contentEdit");
        el2.click();
        el2.clear();
        MobileElement el3 = (MobileElement) ad.findElementByAccessibilityId("Save");
        el3.click();
        MobileElement el4 = (MobileElement) ad.findElementByAccessibilityId("Save");
        el4.click();
    }

    @Override
    public void edge_goToDeleteNote(){

        MobileElement el1 = (MobileElement) ad.findElementById("com.onto.notepad:id/titleView");
        el1.click();
    }

    @Override
    public void edge_createContent(){

        MobileElement el1 = (MobileElement) ad.findElementById("com.onto.notepad:id/contentEdit");
        el1.click();
        el1.sendKeys("Korea");
        MobileElement el2 = (MobileElement) ad.findElementByAccessibilityId("Save");
        el2.click();
    }

    @Override
    public void edge_createTitle(){

        MobileElement el1 = (MobileElement) ad.findElementById("com.onto.notepad:id/titleEdit");
        el1.click();
        el1.sendKeys("England");
        MobileElement el2 = (MobileElement) ad.findElementByAccessibilityId("Save");
        el2.click();
    }

    @Override
    public void edge_goToCreateContent(){

        MobileElement el1 = (MobileElement) ad.findElementByAccessibilityId("Add");
        el1.click();
    }

    @Override
    public void edge_goToCreateTitle(){

        MobileElement el1 = (MobileElement) ad.findElementByAccessibilityId("Add");
        el1.click();
    }

    @Override
    public void edge_goToCreateNote(){

        MobileElement el1 = (MobileElement) ad.findElementByAccessibilityId("Add");
        el1.click();
    }

    @Override
    public void edge_editNoteTitle(){

        MobileElement el1 = (MobileElement) ad.findElementById("com.onto.notepad:id/titleEdit");
        el1.click();
        el1.sendKeys(" Turkey");
        MobileElement el2 = (MobileElement) ad.findElementByAccessibilityId("Save");
        el2.click();
    }


    @Override
    public void edge_editNoteContent(){

        MobileElement el1 = (MobileElement) ad.findElementById("com.onto.notepad:id/contentEdit");
        el1.click();
        el1.sendKeys(" Germany");
        MobileElement el2 = (MobileElement) ad.findElementByAccessibilityId("Save");
        el2.click();
    }

    @Override
    public void edge_goToEditPage(){

        MobileElement el1 = (MobileElement) ad.findElementById("com.onto.notepad:id/titleView");
        el1.click();
    }
}
