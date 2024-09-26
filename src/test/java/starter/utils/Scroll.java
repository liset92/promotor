package starter.utils;

import io.appium.java_client.AppiumBy;

public class Scroll {

    private Scroll() {
    }

    public static void untilFindElementByTextContains(String numberScrollElement, String textoToSearch) {
        Drivers.getAndroidDriver().findElement(AppiumBy.androidUIAutomator(String.format("new UiScrollable(new UiSelector().scrollable(true).instance(%s)).scrollIntoView(new UiSelector().textContains(\"%s\").instance(0))", numberScrollElement, textoToSearch)));
    }
}


