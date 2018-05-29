package a2.assignment12.com.acadgild.todoproject1.assignment122;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Settings extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Load preferences
        addPreferencesFromResource(R.xml.preferences);
    }



}
