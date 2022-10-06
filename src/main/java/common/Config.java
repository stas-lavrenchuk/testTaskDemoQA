package common;

/**
 * Specify the browser and platform for tests
 * CHROME_WINDOWS
 * CHROME_MAC
 * MOZILLA_WIN
 */

public class Config {
        public static final String BROWSER_AND_PLATFORM = "CHROME_WINDOWS";
        /**
         * Clean browser cookies after each iteration
         */
        public static final Boolean CLEAR_COOKIES = true;
        /**
         * To keep the browser open after all tests
         */
        public static final Boolean HOLD_BROWSER_OPEN = false;
        /**
         * Clear dir reports before starting the build
         */
        public static final Boolean CLEAR_REPORTS_DIR = true;


}
