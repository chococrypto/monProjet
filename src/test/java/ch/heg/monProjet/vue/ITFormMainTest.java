package ch.heg.monProjet.vue;

import static org.assertj.swing.core.MouseButton.LEFT_BUTTON;
import static org.assertj.swing.launcher.ApplicationLauncher.application;
import static org.assertj.swing.finder.WindowFinder.findFrame;

import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.testng.testcase.AssertJSwingTestngTestCase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;

public class ITFormMainTest extends AssertJSwingTestngTestCase {

    private FormMain frame;
    private FrameFixture window;
    @Override
    protected void onSetUp() {
        frame = GuiActionRunner.execute(FormMain::new);
        window = new FrameFixture(robot(), frame);
        window.show();
    }

    @Test
    public void testFillList(){
        Assert.assertEquals(frame.sizeOfList(), frame.sizeOfListArray());
    }
    @Test
    public void testFillListInterfaceClean(){
        window.button(frame.getBtnVider().getName()).click(LEFT_BUTTON);
        Assert.assertEquals(frame.sizeOfList(),0);
    }

}
