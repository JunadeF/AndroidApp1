package zm.hashcode.appctivities;

import android.icu.text.BreakIterator;
import android.view.View;

import androidx.test.annotation.UiThreadTest;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.MediumTest;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@MediumTest
@RunWith(AndroidJUnit4.class)
public class ThirdActivityTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @UiThreadTest
    public void testNoErrorInCapitalization() {
        final String msg = "Test button";
        BreakIterator mMessage;
        mMessage.setText(msg);
        View mCapitalize = null;
        assert mCapitalize != null;
        mCapitalize.performClick();
        final String actual = mMessage.getText().toString();
        final String notExpectedRegexp = "(?i:ERROR)";
        assertNotContainsRegex("Capitalization found error:",
                notExpectedRegexp, actual);
    }

    private void assertNotContainsRegex(String s, String notExpectedRegexp, String actual) {
    }

}