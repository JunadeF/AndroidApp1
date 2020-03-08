package zm.hashcode.appctivities;

import android.icu.text.BreakIterator;
import android.view.View;

import androidx.test.annotation.UiThreadTest;
import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.MediumTest;
import androidx.test.rule.ActivityTestRule;


import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@MediumTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

        @Rule
        public ActivityTestRule<MainActivity>

    mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    private MainActivity Null;
    private MainActivity mActivity = Null;
    private BreakIterator mMessage;


    @Before
    public void setUp() throws Exception {
        mActivity = mActivityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
        mActivity = Null;
    }

    @Test
    public void test_ActivityMainLaunch() {
        View view = mActivity.findViewById(R.id.firstTextView);
        assertNotNull(view);

    }

        @UiThreadTest
        public void testNoErrorInCapitalization() {
            final String msg = "Test button";
            mMessage.setText(msg);
            View mCapitalize = null;
            mCapitalize.performClick();
            final String actual = mMessage.getText().toString();
            final String notExpectedRegexp = "(?i:ERROR)";
            assertNotContainsRegex("Capitalization found error:",
                    notExpectedRegexp, actual);
        }

    private void assertNotContainsRegex(String s, String notExpectedRegexp, String actual) {
    }

}