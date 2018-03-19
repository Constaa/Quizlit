package jonas.quizlit;

import android.os.AsyncTask;

import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by Jonas on 19.03.18.
 */

public class ActivityDataSource extends AsyncTask<String, Void, String> {

    @Override
    protected String doInBackground(String... strings) {
        return null;
    }


    private void openConnection() throws IOException {
        StringBuffer dataBuffer = new StringBuffer();
        dataBuffer.append(URLEncoder.encode("authkey", "UTF-8"));
        dataBuffer.append(POST_PARAM_KEYVALUE_SEPERATOR);
        dataBuffer.append(URLEncoder.encode(AUTHKEY, "UTF-8"));
        dataBuffer.append(POST_PARAM_SEPERATOR);
        dataBuffer.append(URLEncoder.encode("method", "UTF-8"));
        dataBuffer.append(POST_PARAM_SEPERATOR);
        dataBuffer.append(URLEncoder.encode(DESTINATION_METHOD, "UTF-8"));

        URL url = new URL()
    }
}


