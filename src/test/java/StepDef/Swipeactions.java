package StepDef;

import com.google.common.collect.ImmutableList;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;

public class Swipeactions {

        public static void swipe_toalocations(AppiumDriver driver)
        {
            Dimension sa = driver.manage().window().getSize();
            int height = sa.getHeight();

            System.out.println("height =  "+ height );

            int width = sa.getWidth();

            System.out.println("width = "+ width);

            Point midPoint =  new Point((int) (sa.width*0.5), (int) (sa.height*0.5));
//

            PointerInput input = new PointerInput(PointerInput.Kind.TOUCH,"finger1");
            Sequence swipe = new Sequence(input,0);
//
            swipe.addAction(input.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),720,1853));

            swipe.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        swipe.addAction(input.createPointerMove(Duration.ofSeconds(3),PointerInput.Origin.viewport(),endPoint.x,endPoint.y));
            swipe.addAction(input.createPointerMove(Duration.ofSeconds(2),PointerInput.Origin.viewport(),700,755));
            swipe.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
            driver.perform(ImmutableList.of(swipe));


        }
    }

